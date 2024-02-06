
package com.yourpackage.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yourpackage.model.Ebook;

public class EbookDAO {
	public static List<Ebook> getAllEbooks()  {
	    List<Ebook> ebooks = new ArrayList<>();
	    Connection connection = null;  
	    PreparedStatement preparedStatement =null;  
	    ResultSet resultSet = null;
	     
	    try {
	        connection = DatabaseUtil.getConnection("jdbc:mysql://localhost:3306/ebookdb","root","Surya@1234");
	        if (connection == null) {
	            throw new SQLException("Failed to establish a database connection.");
	        }

	        String sql = "SELECT * FROM ebooks";
	        preparedStatement = connection.prepareStatement("select * from ebooks");
	        resultSet = preparedStatement.executeQuery("select * from ebooks");
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String title = resultSet.getString("title");
	            String content = resultSet.getString("content");

	            Ebook ebook = new Ebook(title, content);
	            ebook.setId(id);
	            ebook.setTitle(title);
	            ebook.setContent(content);

	            ebooks.add(ebook);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Log the exception or handle it appropriately
	    } finally {
	        // Close resources as you did in your original code
	        DatabaseUtil.close(connection, preparedStatement, resultSet);
	    }
	    return ebooks;
	}

	
    
    public static void saveEbook(Ebook ebook) throws SQLException {
    	Connection connection = DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/ebookdb","root","Surya@1234");  
    	PreparedStatement preparedStatement=null;
        try {
            connection =DatabaseUtil.getConnection();
            String sql = "INSERT INTO ebooks (title, content) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ebook.getTitle());
            preparedStatement.setString(2, ebook.getContent());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	DatabaseUtil.close(connection, preparedStatement, null);
        }
    }
}
//    public static List<Ebook>getAllEbooks() {
//        List<Ebook> ebooks = new ArrayList<>();
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        try {
//            connection = DatabaseUtil.getConnection();
//            String sql = "SELECT * FROM ebooks";
//            preparedStatement = connection.prepareStatement(sql);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Ebook ebook = new Ebook(sql, sql);
//                ebook.setId(resultSet.getInt("id"));
//                ebook.setTitle(resultSet.getString("title"));
//                ebook.setContent(resultSet.getString("content"));
//                ebooks.add(ebook);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            DatabaseUtil.close(connection, preparedStatement, resultSet);
//        }
//        return ebooks;
//    }
//}