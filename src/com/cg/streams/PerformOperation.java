package com.cg.streams;

//class PerformOperation with lambda expressions

import java.util.function.Predicate;

public class PerformOperation {
	
	//lambda Exp. to check Odd numbers
	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = (element) -> {
			return (element % 2 == 0) ? false : true;
		};
		return predicate;
	}
	
	//lambda Exp. to check Even numbers
	public static Predicate<Integer> isEven() {
		Predicate<Integer> predicate = (element) -> {
			return (element % 2 == 0) ? true : false;
		};
		return predicate;
	}
	
	//lambda Exp. to check Palindrome numbers
	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (element) -> {
			return (Integer.toString(element))
					.equals(new StringBuilder(Integer.toString(element)).reverse().toString());
		};
		return predicate;
	}
}