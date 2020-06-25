package com.traknar;
public class Anagram {
    public static String createAnagram(String inpitString){
        String outputString = "";
        String[] massOfWords = inpitString.split("\\s");

        for (int i = 0; i <= massOfWords.length-1; i++){
            char[] massOfChar = massOfWords[i].toCharArray();
            char[]  temp= new char[massOfChar.length];
            int count=0;
            for (int j = massOfChar.length-1; j >= 0; j--){
                if (Character.isLetter(massOfChar[j])){
                    temp[count] = massOfChar[j];
                    count++;
                }
            }
            count = 0;
            for (int j = 0; j <= massOfChar.length-1; j++){
                if (Character.isLetter(massOfChar[j])){
                    massOfChar[j] = temp[count];
                    count++;
                }
            }
            outputString = outputString + new String(massOfChar) + " ";
        }
        return outputString;
    }
}
