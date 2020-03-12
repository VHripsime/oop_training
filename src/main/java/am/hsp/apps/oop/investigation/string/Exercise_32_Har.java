package main.java.am.hsp.apps.oop.investigation.string;

/**
 * https://www.w3resource.com/java-exercises/string/index.php
 * 
 * Find the longest Palindromic substring within a given string.
 * 
 * @author user
 *
 */
public class Exercise_32_Har {

    public static void main(String[] args) {

        System.out.println(getLongestPalindrom("thequickbrownfoxxofnworbquickthe"));    	
    }

    /**
     * HRIPSIME JAN NAYI, LOGIKAN LRIV NUYNNA INCH MER BOLOR MAXIMUM GTNELU
     * XNDIRNERUM
     * 
     * @param input
     * @return
     */
    private static String getLongestPalindrom(String input) {               
        String maxPalindrom = "";
        for (int i = 0; i < input.length() - 1; i++) {
        	
        	/*when max palindrom already found*/
        	if(maxPalindrom.length() >= input.length() - 1 - i) {
        		return maxPalindrom;
        	}
        	
        	String palindrom = getMaxPalindromFromLeft(input.substring(i, input.length() - 1));

            if (palindrom.length() > maxPalindrom.length()) {
            	maxPalindrom = palindrom;
            }
        }

        return maxPalindrom;
    }    
    
    /**
     * Get the max palindrom which starts from the very left of the given input.
     * @param input
     * @return
     */
    private static String getMaxPalindromFromLeft(String input) {    	               
        for (int i = input.length() - 1; i > 0; i--) {
        	String subInput = input.substring(0, i + 1);
        	if(isPalindrom(subInput)) {
        		return subInput;
        	}
        }
        
        return "";
    }

    /**
     * Checks whether the given string is palindrom.
     * 
     * @param word
     * @return
     */
    private static boolean isPalindrom(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (doCharsNotEqual(word, i, word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks whether in given string the chars in the given indexs are not equal.
     * 
     * @param word
     * @param firstIndex
     * @param secondIndex
     * @return
     */
    private static boolean doCharsNotEqual(String word, int firstIndex, int secondIndex) {
        return (word.charAt(firstIndex) != word.charAt(secondIndex));
    }
}
