package com.barasingha.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Implementation {
	List<Contact> l = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void addContact() {
		int id = l.size() + 1;
		System.out.print("Enter name : ");
		String name = sc.nextLine();
		System.out.print("Enter mobile number : ");
		long mobileNumber = sc.nextLong();

		if (contactValidation(mobileNumber)) {
			l.add(new Contact(id, name, mobileNumber));
			System.out.println("\nContact added successfully");
		}

	}

	public void updateContact() {
		System.out.print("Enter name to update the contact details : ");
		String name = sc.nextLine();

		Optional<Contact> op = findByName(name);
		if (op.isPresent()) {
			System.out.print("Enter new name : ");
			String n = sc.nextLine();
			System.out.print("Enter new contact : ");
			long con = sc.nextLong();

			if (contactValidation(con)) {
				op.get().setName(n);
				op.get().setMobileNumber(con);
				System.out.println("\nContact updated successfully");
			}

		} else {
			System.out.println("\nName not found");
			System.out.println("Please enter valid name to update the details");
		}
	}

	public void deleteContact() {
		System.out.print("Enter name to delete the contact : ");
		String name = sc.nextLine();
		sc.nextLine();

		Optional<Contact> op = findByName(name);
		if (op.isPresent()) {
			l.remove(op.get());
			System.out.println("\nContact deleted successfully");
		} else {
			System.out.println("\nContact not found");
			System.out.println("Please enter valid name");
		}
	}

	public void searchContact() {
		System.out.println("1. Search by name");
		System.out.println("2. Search by number");
		System.out.print("Enter your choice : ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.print("Enter name : ");
			sc.nextLine();
			String name = sc.nextLine();

			Optional<Contact> byName = findByName(name);
			if (l.size() == 0) {
				System.out.println("\nNo data present");
				return;
			}
			if (byName.isPresent()) {
				System.out.println();
				System.out.println(l.toString());
			}
		} 
		else if (num == 2) {
			System.out.print("Enter number : ");
			long cont = sc.nextLong();

			if (contactValidation(cont)) {

				Optional<Contact> byContact = findByContact(cont);
				if (l.size() == 0) {
					System.out.println("\nNo data present");
					return;
				}
				if (byContact.isPresent()) {
					System.out.println();
					System.out.println(l.toString());
				}
			}

		} 
		else {
			System.out.println("\nPlease enter valid name/number");
		}
	}

	public void viewAllContact() {
		if (l.size() == 0) {
			System.out.println("\nNo data present");
			return;
		}
		System.out.println();
		l.forEach(System.out::println);
	}

	public Optional<Contact> findByName(String name) {
		return l.stream().filter(n -> n.getName().equalsIgnoreCase(name)).findFirst();
	}

	public Optional<Contact> findByContact(long cont) {
		return l.stream().filter(n -> n.getMobileNumber() == cont).findFirst();
	}

	public boolean contactValidation(long contact) {
		String num = (contact + "");
		if (num.length() == 10) {
			if (num.charAt(0) >= '6' && num.charAt(0) <= '9') {
				return true;
			}
		}
		System.out.println("\nMobile number must be 10 digits");
		System.out.println("It should starts with 6-9");
		return false;

	}
}
