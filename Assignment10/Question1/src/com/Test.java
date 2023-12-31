package com;

import java.util.*;

public class Test {

	public static int menu() {

		int choise;
		Scanner sc = new Scanner(System.in);
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Search a book with given isbn (hint - indexOf())");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list (hint - Collections.reverseList())");
		choise = sc.nextInt();
		return choise;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Book> arr = new ArrayList<Book>();
		CompareBookPrice c = new CompareBookPrice();
		
		int choise;
		while (0 != (choise = menu())) {
			switch (choise) {
			case 1:// 1. Add new book in list
			{
				Book bk = new Book();
				bk.accept();

				if (arr.contains(bk)) {
					System.out.println("Book is alredy present in library");
					Iterator<Book> itr = arr.iterator();
					while (itr.hasNext()) {
						Book b1 = itr.next();
						if (b1.getIsbn().equals(bk.getIsbn())) {
							b1.setQuantity(b1.getQuantity() + bk.getQuantity());
							System.out.println("Quantity increases successfully");
							break;
						}
					}
				} else {
					arr.add(bk);
					System.out.println("Book added susscessfully");
				}

			}
				break;

			case 2:// 2. Display all books in forward order.
			{
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b = itr.next();
					System.out.println(b);
				}
			}
				break;

			case 3:// 3. Search a book with given isbn (hint - indexOf())
			{
				System.out.println("Enter the isbn no of book for get the book");
				String isbn = sc.next();
				Book b = new Book();
				b.setIsbn(isbn);
				int i = 0;
				int temp=0;
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					if (b.getIsbn().equals(b1.getIsbn())) {
						temp=i;
						break;
					}
					i++;
				}
				System.out.println("Book is found at index no : " + temp);
			}

				break;

			case 4:// Delete a book at given index.
			{
				System.out.println("Enter the index no at which you want delete the book");
				int index = sc.nextInt();
				arr.remove(index);
				System.out.println("Book is remove successfully");
			}
				break;

			case 5:// Delete a book with given isbn.
			{
				System.out.println("Enter the isbn no of book for get the book");
				String isbn = sc.next();
				Book b = new Book();
				b.setIsbn(isbn);
				int i = 0;
				int temp=0;
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b1 = itr.next();
					if (b.getIsbn().equals(b1.getIsbn())) {
						temp=i;
						break;
					}
					i++;
				}
				arr.remove(temp);
				System.out.println("Book is found at index : "+temp+" and remove successfully");
				break;
			}

			case 6:// 6. Reverse the list (hint - Collections.reverseList())
			{
				Collections.reverse(arr);
				System.out.println("List reverse is successfully");
				Iterator<Book> itr = arr.iterator();
				while (itr.hasNext()) {
					Book b = itr.next();
					System.out.println(b);
				}

				break;
			}
		}

		System.out.println("THANK YOU FOR USING THE APPLICATION");

	}
	}

}
