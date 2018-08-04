package com.cg.streams;

//class TestPerform to check odd,even & palindrome numbers using Stream API's stream method
import java.util.ArrayList;

public class TestPerform {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// putting 50 integers in ArrayList
		for (int i = 1; i <= 50; i++) {
			list.add(i);
		}

		// checking the isOdd predicate
		list.stream().filter(PerformOperation.isOdd()).forEach(System.out::println);

		System.out.println("-------");

		// checking the isEven predicate
		list.stream().filter(PerformOperation.isEven()).forEach(System.out::println);

		System.out.println("-------");

		// checking the isPalindrome predicate
		list.stream().filter(PerformOperation.isPalindrome()).forEach(System.out::println);

	}

}