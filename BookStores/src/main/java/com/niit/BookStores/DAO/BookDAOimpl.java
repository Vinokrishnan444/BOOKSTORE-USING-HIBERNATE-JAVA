package com.niit.BookStores.DAO;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.niit.BookStores.config.Hibernateconfig;
import com.niit.BookStores.model.Book;

public class BookDAOimpl implements BookDAO {
SessionFactory sessionFactory;

	@Override
	public boolean addBook(Book b) {
		try {
			sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction txt = s.beginTransaction();
			s.save(b);
			txt.commit();
			s.close();
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean updateBook(Book b) {
		try {
			sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction txt = s.beginTransaction();
			s.save(b);
			txt.commit();
			s.close();
			return true;
		}catch(Exception e) {
		return false;
	}
	}

	@Override
	public boolean deleteBook(Book b) {
		try {
			sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction txt = s.beginTransaction();
			s.save(b);
			txt.commit();
			s.close();
			return true;
		}catch(Exception e) {
		return false;
	}}

	@Override
	public Book selectOneBook(String bookname) {
		try {
			sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction txt = s.beginTransaction();
		//s.createCriteria("select * from book where bookname='"+bookname+"'");
			Book b=(Book)s.createQuery("from Book where bookname='"+bookname+"'").uniqueResult();
			txt.commit();
			s.close();
			return b;
		}catch(Exception e) {
		return null;
	}
	}
	
	@Override
	public List<Book> selectAll() {
		try {
			sessionFactory = Hibernateconfig.createSessionFactory();
			Session s = sessionFactory.openSession();
			Transaction txt = s.beginTransaction();
		List<Book> b= s.createQuery("from Book").list();
			txt.commit();
			s.close();
			return b;
		}catch(Exception e) {
		return null;
	}
	}
		public void name() {
	}

}
