package ua.com.foxminded.task1.anagram;

public class Anagram {
    private static final String WHITE_SPACES_PATTERN = "\\s";

    public String createAnagram(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Please, enter words");
        }
        int countOfSpaces = 0;
        char[] letters =  inputString.toCharArray();
        for (int letterPosition = letters.length - 1; letterPosition >= 0; letterPosition--) {
            if (Character.isLetter(letters[letterPosition])) {
                break;
            }
            if (letters[letterPosition] == ' ') {
                countOfSpaces++;
            }
        }
        String[] words = inputString.split(WHITE_SPACES_PATTERN);
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(reverseWord(word) + " ");
        }

        if (result.length() != 0) {
            result.deleteCharAt(result.length() - 1);
        }
        for (int count = 0; count < countOfSpaces; count++) {
            result.append(" ");
        }        
        return result.toString();
    }

    private String reverseWord(String inputWord) {
        StringBuilder reversedWord = new StringBuilder(inputWord);
        StringBuilder tempWord = new StringBuilder();
        for (int pointer = reversedWord.length() - 1; pointer >= 0; pointer--) {
            if (Character.isLetter(reversedWord.charAt(pointer))) {
                tempWord.append(reversedWord.charAt(pointer));
            }
        }
        int letterPositionInTemp = 0;
        for (int pointer = 0; pointer <= reversedWord.length() - 1; pointer++) {
            if (Character.isLetter(reversedWord.charAt(pointer))) {
                reversedWord.setCharAt(pointer, tempWord.charAt(letterPositionInTemp));
                letterPositionInTemp++;
            }
        }
        return reversedWord.toString();
    }
}
