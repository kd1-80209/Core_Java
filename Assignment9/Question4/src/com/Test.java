package com;

import java.util.*;


public class Test {
	
	
	
	public static int menu()
	{
		
		int choise;
		Scanner sc=new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index -- list.remove(index)");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order -- l");
		choise=sc.nextInt();
		return choise;
	}

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		List<Book>arr=new ArrayList<Book>();
		//Book book=new Book();
		CompareBookPrice c=new CompareBookPrice();
		
		
		int choise;
		while(0!=(choise=menu()))
		{
			switch (choise) {
			case 1://1. Add new book in list
				Book bk=new Book();
				bk.accept();
				arr.add(bk);
				System.out.println("Book added susscessfully");
				break;
             
			case 2://2. Display all books in forward order.
				Iterator<Book> itr = arr.iterator();
				while(itr.hasNext())
				{
					Book b=itr.next();
					System.out.println(b);
				}
				break;
            
			case 3://3. Delete at book given index -- list.remove(index)
				System.out.println("Enter the index no at which you want delete the book");
				int index=sc.nextInt();
				arr.remove(index);
				break;
				
            case 4://4. Check if book with given isbn is in list or not
			{   System.out.println("Enter the isbn no of book");
				String isbn=sc.next();
				Book key=new Book();
				key.setIsbn(isbn);
				if(arr.contains(key))
				{
					System.out.println("Book is Found");
				}
				else {
					System.out.println("Book is Not Found");
				}
			}
				break;
				
            case 5://5. Delete all books in list
	
            	arr.clear();
            	System.out.println("All books are erased");
	            break;
	           
            case 6://6. Display number of books in list
            	
            	System.out.println("The no of books present in collections are :"+arr.size());
				
				break;
				
            case 7://7. Sort all books by price in desc order -- l
            	
            	arr.sort(c);
            	System.out.println("Array Sorted Sucessfully on price ");
				break;
			default:
				break;
			}
			System.out.println("------------------------------------------------------------------------");
		}
		
		System.out.println("THANK YOU FOR USING THE APPLICATION");
		
	}

}
