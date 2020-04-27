package com.gmail.nelya;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		getArrayList();

	}

	public static void getArrayList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			String element = "Number ";
			arrayList.add(i, element + (i + 1));
		}
		for (String element : arrayList) {
			System.out.println(element);
		}
		System.out.println();
		arrayList.remove(0);
		arrayList.remove(0);
		arrayList.remove(arrayList.size() - 1);

		for (String element : arrayList) {
			System.out.println(element);
		}
	}
}
