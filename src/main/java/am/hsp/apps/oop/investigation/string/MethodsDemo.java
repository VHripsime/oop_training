package main.java.am.hsp.apps.oop.investigation.string;

/**
 * Investigating String class methods...
 * 
 * @author user
 *
 */
public class MethodsDemo {

    public static void main(String[] args) {

        String word = "Investigating";
        System.out.println("The char at index 4 in " + "\"" + word + "\"" + " is: " + word.charAt(4));
        System.out.println("The unicode of the char at index 4 is: " + word.codePointAt(4));
        System.out.println("Does " + "\"" + word + "\"" + " contains \"Invest\": " + word.contains("Invest"));
        System.out.println("The last index of 't' in " + "\"" + word + "\"" + " is: " + word.lastIndexOf('t'));
        System.out.println("Converting all chars in " + "\"" + word + "\"" + " to lowercase: " + word.toLowerCase());
        System.out.println("Converting all chars in " + "\"" + word + "\"" + " to uppercase: " + word.toUpperCase());
        System.out.println();

        String firstString = "Sun";
        String secondString = "flower";
        CharSequence sequence = "flower";
        char[] charArray = { 'f', 'l', 'o', 'w', 'e', 'r' };
        StringBuffer stringBuffer = new StringBuffer("Sun");

        compareLexicographically(firstString, secondString);
        System.out.println("Concatenating " + "\"" + firstString + "\"" + " and " + "\"" + secondString + "\"" + ": "
                + firstString.concat(secondString));
        System.out.println("Does " + "\"" + firstString + "\"" + " equals to the string buffer " + "\"" + stringBuffer
                + "\"" + "?: " + firstString.contentEquals(stringBuffer));
        System.out.println("Does " + "\"" + secondString + "\"" + " equals to the char sequence " + "\"" + sequence
                + "\"" + "?: " + secondString.contentEquals(sequence));
        System.out.print("Creating string from the last 5 elements of the array " + getCharArray(charArray) + ": "
                + String.copyValueOf(charArray, 1, 5));
        System.out
                .println("\nDoes " + "\"" + secondString + "\"" + " ends with \"er\"?: " + secondString.endsWith("er"));
        System.out.println("\nPrinting the chars with their Unicodes of " + "\"" + secondString + "\"" + ":");
        printCharsWithUnicodes(secondString);
        System.out.println(
                "Replacing letter 'n' with 'm' in " + "\"" + firstString + "\"" + ": " + firstString.replace('n', 'm'));
        System.out.println();

        byte[] byteArray = { 97, 98, 99, 100 };
        System.out.println("The string representation of the byte array " + getByteArray(byteArray) + " is: "
                + (new String(byteArray)));
        System.out.println();

        String thirdString = "bookcase";
        String fourthString = "copybook";
        System.out.println("Does " + "\"" + thirdString + "\"" + "[0-3] region matches with " + "\"" + fourthString
                + "\"" + "[4-7] region?: " + thirdString.regionMatches(0, fourthString, 4, 4));
        System.out.println("Replacing \"book\" with \"upper\" in the " + "\"" + thirdString + "\"" + ": "
                + thirdString.replaceAll("book", "upper"));
        System.out.println(
                "Does " + "\"" + thirdString + "\"" + " start with \"book\"?: " + thirdString.startsWith("book"));
        System.out.println("Getting the substring of " + "\"" + fourthString + "\"" + " from the [4-7] region: "
                + fourthString.substring(4, 8));
        System.out.println("Representing the string " + "\"" + thirdString + "\"" + " in char array: "
                + getCharArray(thirdString.toCharArray()));

        String sentence = " String class methods. ";
        System.out.println("\nRemoving any leading or trailing whitespace from " + "\"" + sentence + "\""
                + " sentence: " + "\"" + sentence.trim() + "\"");
    }

    /**
     * Compares the given two strings lexicographically and prints the result.
     * 
     * @param firstString
     * @param secondString
     */
    private static void compareLexicographically(String firstString, String secondString) {
        if (doesFirstStringComeBeforeSecondOne(firstString, secondString)) {
            System.out.println("\"" + firstString + "\"" + " comes before " + "\"" + secondString + "\"");
        } else if (doesFirstStringComeAfterSecondOne(firstString, secondString)) {
            System.out.println("\"" + firstString + "\"" + " comes after " + "\"" + secondString + "\"");
        } else {
            System.out.println("\"" + firstString + "\"" + " and " + "\"" + secondString + "\"" + " are the same.");
        }
    }

    /**
     * Checks whether the first string comes before the second one.
     * 
     * @param firstString
     * @param secondString
     * @return
     */
    private static boolean doesFirstStringComeBeforeSecondOne(String firstString, String secondString) {
        return (firstString.compareTo(secondString) < 0);
    }

    /**
     * Checks whether the first string comes after the second one.
     * 
     * @param firstString
     * @param secondString
     * @return
     */
    private static boolean doesFirstStringComeAfterSecondOne(String firstString, String secondString) {
        return (firstString.compareTo(secondString) > 0);
    }

    /**
     * Returns the given char array content.
     * 
     * @param array
     * @return
     */
    private static String getCharArray(char[] array) {
        StringBuilder elements = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                elements.append(array[i] + "]");
            } else {
                elements.append(array[i] + ", ");
            }
        }

        return elements.toString();
    }

    /**
     * Returns the given byte array content.
     * 
     * @param array
     * @return
     */
    private static String getByteArray(byte[] array) {
        StringBuilder elements = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                elements.append(array[i] + "]");
            } else {
                elements.append(array[i] + ", ");
            }
        }

        return elements.toString();
    }

    /**
     * Prints the chars of the given input with their Unicodes.
     * 
     * @param input
     */
    private static void printCharsWithUnicodes(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + ": " + input.codePointAt(i));
        }
    }
}
