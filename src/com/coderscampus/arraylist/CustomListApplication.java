package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int i = 1; i <= 31; i++) {
			myCustomList.add("element " + i);
		}

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

		try {
			System.out.println(myCustomList.get(100));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("**ERROR*** " + e.getMessage());
		}

		try {
			System.out.println(myCustomList.get(-30));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("**ERROR*** " + e.getMessage());
		}

		System.out.println("The size of your list is: " + myCustomList.getSize());

		System.out.println("----------------------------------------------------");

		CustomList<Integer> myCustomIntegerList = new CustomArrayList<>();
		for (int i = 1; i <= 1000000; i++) {
			myCustomIntegerList.add(i);
		}

		System.out.println("The size of your list is: " + myCustomIntegerList.getSize());

		System.out.println(myCustomIntegerList.get(10));
		System.out.println(myCustomIntegerList.get(999));
		System.out.println(myCustomIntegerList.get(999999));

		try {
			System.out.println(myCustomIntegerList.get(-1000000));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("**ERROR*** " + e.getMessage());
		}
	}
}
