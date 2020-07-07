package com.traknar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
		try {
			String inputString = reader.readLine();
			String result = Anagram.createAnagram(inputString);
			System.out.println(result);
		} catch (IOException | NullPointerException e) {
			System.out.println("Enter words");
		}

	}
}
