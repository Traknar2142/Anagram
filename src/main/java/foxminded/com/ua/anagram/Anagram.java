package foxminded.com.ua.anagram;

public class Anagram {
    private final static String WHITE_SPACES_PATTERN = "\\s";

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
        StringBuilder revercedWord = new StringBuilder(inputWord);
        StringBuilder tempWord = new StringBuilder();
        for (int letterPosition = revercedWord.length() - 1; letterPosition >= 0; letterPosition--) {
            if (Character.isLetter(revercedWord.charAt(letterPosition))) {
                tempWord.append(revercedWord.charAt(letterPosition));
            }
        }
        int letterPositionInTemp = 0;
        for (int letterPosition = 0; letterPosition <= revercedWord.length() - 1; letterPosition++) {
            if (Character.isLetter(revercedWord.charAt(letterPosition))) {
                revercedWord.setCharAt(letterPosition, tempWord.charAt(letterPositionInTemp));
                letterPositionInTemp++;
            }
        }
        return revercedWord.toString();
    }
}
