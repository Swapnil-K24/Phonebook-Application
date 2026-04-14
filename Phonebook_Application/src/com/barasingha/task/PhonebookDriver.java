package com.barasingha.task;

import java.util.Scanner;

public class PhonebookDriver {
	public static void main(String[] args) {

		Implementation i = new Implementation();
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------------");
		System.out.println("****** PHONEBOOK APPLICATION ******");
		System.out.println("-----------------------------------");
		System.out.println();

		while (true) {
			System.out.println("1. Add contact");
			System.out.println("2. Update contact");
			System.out.println("3. Delete contact");
			System.out.println("4. Search contact");
			System.out.println("5. View all contact");
			System.out.println("6. Exit");

			System.out.println();

			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				i.addContact();
				System.out.println("----------------------\n");
				break;
			}
			case 2: {
				i.updateContact();
				System.out.println("----------------------\n");
				break;
			}
			case 3: {
				i.deleteContact();
				System.out.println("----------------------\n");
				break;
			}
			case 4: {
				i.searchContact();
				System.out.println("----------------------\n");
				break;
			}
			case 5: {
				i.viewAllContact();
				System.out.println("----------------------\n");
				break;
			}
			case 6: {
				System.out.println("--------------------------------------");
				System.out.println("Thanks for using Phonebook Application");
				System.out.println("--------------------------------------");
				System.exit(0);
			}
			default: {
				System.out.println("Please enter valid choice");
				break;
			}
			}
		}
	}
}
