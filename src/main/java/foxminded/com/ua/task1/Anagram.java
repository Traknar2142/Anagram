package foxminded.com.ua.task1;

public class Anagram {
    private final String SPACE_SEPARATED = "\\s";

    public String createAnagram(String inpitString) {
        String[] massOfWords = inpitString.split(SPACE_SEPARATED);
        StringBuilder outputString = new StringBuilder();
        for (String word : massOfWords) {
            outputString.append(Anagram.reverceWord(word) + " ");
        }
        if (outputString.length() != 0) {
            outputString.deleteCharAt(outputString.length() - 1);
        }
        return outputString.toString();
    }

    private static String reverceWord(String inputWord) {
        StringBuilder revercedWord = new StringBuilder(inputWord);
        StringBuilder tempWord = new StringBuilder();
        for (int letterPositionNumberInTheReverceWord = revercedWord.length()
                - 1; letterPositionNumberInTheReverceWord >= 0; letterPositionNumberInTheReverceWord--) {
            if (Character.isLetter(revercedWord.charAt(letterPositionNumberInTheReverceWord))) {
                tempWord.append(revercedWord.charAt(letterPositionNumberInTheReverceWord));
            }
        }
        int letterPositionNumberInTheTempWord = 0;
        for (int letterPositionNumberInTheReverceWord = 0; letterPositionNumberInTheReverceWord <= revercedWord.length()
                - 1; letterPositionNumberInTheReverceWord++) {
            if (Character.isLetter(revercedWord.charAt(letterPositionNumberInTheReverceWord))) {
                revercedWord.setCharAt(letterPositionNumberInTheReverceWord,
                        tempWord.charAt(letterPositionNumberInTheTempWord));
                letterPositionNumberInTheTempWord++;
            }
        }
        return revercedWord.toString();
    }
}
