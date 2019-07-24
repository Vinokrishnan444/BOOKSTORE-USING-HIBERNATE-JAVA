package com.niit.BookStores.DAO;
import java.util.List;
import com.niit.BookStores.model.Book;
public interface BookDAO {

	boolean addBook(Book b);
	boolean updateBook(Book b);
	boolean deleteBook(Book b);
	Book selectOneBook(String bookname);
	List<Book> selectAll();
	
}
