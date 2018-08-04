package com.cg.streams1;

// Application to generate 1100 random no.s, write in a text file, read, eliminate duplicate and sort collection
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Result {

	public static void main(String[] args) throws IOException {

		// writes to boy.txt
		writeToBoy();

		// reads from boy.txt
		readBoy();
	}

	// method to write to boy.txt
	private static void writeToBoy() throws IOException {
		FileWriter file = new FileWriter("boy.txt");
		BufferedWriter writer = new BufferedWriter(file);
		for (int i = 0; i <= 50; i++) {
			String x = String.valueOf(((int) ((Math.random() * 1000) % 100) + 1));
			writer.write(x + "\r\n");
		}
		writer.close();
	}

	// method to read from boy.txt
	private static void readBoy() throws IOException {

		FileReader file = new FileReader("boy.txt");
		BufferedReader reader = new BufferedReader(file);
		ArrayList<Integer> treeset = new ArrayList<>();

		// reading integers
		for (int i = 0; i <= 50; i++) {
			treeset.add(Integer.valueOf(reader.readLine()));
		}
		reader.close();

		// distinct element & sorting
		treeset.stream().distinct().sorted().forEach(System.out::println);

	}

}