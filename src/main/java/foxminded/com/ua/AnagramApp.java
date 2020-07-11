package foxminded.com.ua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import foxminded.com.ua.task1.Anagram;

public class AnagramApp {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        try {
            String inputString = reader.readLine();
            Anagram anagram = new Anagram();
            String result = anagram.createAnagram(inputString);
            System.out.println(result);
        } catch (IOException exception) {
            System.out.println("Enter words");
        }
    }
}
