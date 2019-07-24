package com.niit.BookStores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.niit.BookStores.DAO.BookDAO;
import com.niit.BookStores.DAO.BookDAOimpl;
import com.niit.BookStores.model.Book;

public class App 
{
    public static void main( String[] args )
    {
        BookDAO d = new BookDAOimpl();
        Scanner k = new Scanner(System.in);
        System.out.println("choose option");
        int m = k.nextInt();
        
			switch(m) {
        	case 1:
        		Book e = new Book();
        		e.setBookname("Twlightsaga");
        		e.setAuthorname("vinodhini");
        		e.setBookbackcontent("java introduction");
        		e.setPrice(500);
        		if(d.addBook(e))
        			break;
        		
        	case 2:
        		Book c = d.selectOneBook("saga");
        		d.deleteBook(c);
        		break;
        		
        	case 3:
        		Book c1 = d.selectOneBook("saga");
        		c1.setPrice(1000);
        		if(d.updateBook(c1))
        			break;
        	case 4:
        		ArrayList<Book> booklist = (ArrayList<Book>) d.selectAll();
        		Iterator<Book> iterator = booklist.iterator();
        		while(iterator.hasNext()) {
        			Book book = (Book) iterator.next();
        			System.out.println(book.getBookname() +"\t"+book.getAuthorname()+"\t"+book.getBookbackcontent()
        			+"\t"+book.getPrice());
        		}}
        	}}
