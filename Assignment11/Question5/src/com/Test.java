package com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Test {

/*3. In above assignment use TreeSet instead of LinkedHashSet. 
 * Use natural ordering for the Book. If any book with duplicate isbn is added, 
 * what will happen?
 * Books are stored in which order?
 * */
	
	public static void main(String[] args) 
	{
		
		
		TreeSet<Book>library=new TreeSet<>();
		
		Book b1=new Book("101",500.00,"Ram",3000);
		Book b2=new Book("1",575,"Vinod",790);
		Book b3=new Book("31",650.00,"Dhanraj",200);
		Book b4=new Book("str",550.00,"Tanay",30);
		Book b5=new Book("3",400.00,"Shekhar",50);
		Book b6=new Book("90",300.00,"Pratik",80);
		Book b7=new Book("7",260.00,"Vinod",78);
		
		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(b4);
		library.add(b5);
		library.add(b6);
		library.add(b7);
		
		
		System.out.println("Sort by natural Order");
		Iterator<Book>itr=library.iterator();
		
		while(itr.hasNext())
		{
			Book ele=itr.next();
			System.out.println(ele);
		}
		
	}
}

