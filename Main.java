import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Main class contains the main method for executing word operations based on command-line arguments.
 * It initializes constants, validates command-line arguments, and performs word operations accordingly.
 *
 * @author Emma Lee
 * @author Nicholas Farrell
 * @author Walter Chu
 * @version 1.0
 */
public class Main
{
    private static final int    MIN_LENGTH_ARGS;
    private static final int    CML_INDEX_OF_WORDY_KEYWORD;
    private static final int    CML_INDEX_OF_INTEGER;
    private static final int    MIN_LENGTH_NTH;
    private static final int    MAX_LENGTH_NTH;
    private static final String CONCATENATION_KEYWORD;
    private static final String REPEAT_KEYWORD;
    private static final String NTH_KEYWORD;
    private static final String REVERSE_KEYWORD;
    private static final String CONCATENATION_SEPARATOR;

    static
    {
        MIN_LENGTH_ARGS             = 1;
        CML_INDEX_OF_WORDY_KEYWORD  = 0;
        CML_INDEX_OF_INTEGER        = 1;
        MIN_LENGTH_NTH              = 0;
        MAX_LENGTH_NTH              = 192;
        CONCATENATION_KEYWORD       = "concat";
        REPEAT_KEYWORD              = "repeat";
        NTH_KEYWORD                 = "nth";
        REVERSE_KEYWORD             = "reverse";
        CONCATENATION_SEPARATOR     = "";
    }

    /**
     * Validates the length of command-line arguments.
     *
     * @param args           The array of command-line arguments.
     * @param minLengthArgs  The minimum required length of command-line arguments.
     * @throws IllegalArgumentException if the length of command-line arguments is less than the minimum required.
     */
    private static void validateArgsLength(final String[] args,
                                           final int      minLengthArgs)
    {
        if(args.length < minLengthArgs)
        {
            throw new IllegalArgumentException(String.format("The minimum number of commandline arguments is %d.",
                                                             minLengthArgs));
        }
    }

    /**
     * Validates if a command-line argument is an integer.
     *
     * @param string The command-line argument to validate.
     * @throws IllegalArgumentException if the command-line argument is not an integer.
     */
    private static void validateArgIsInteger(final String string)
    {
        try
        {
            Integer.parseInt(string);
        }
        catch (NumberFormatException e)
        {
            throw new IllegalArgumentException("The second command-line argument must be an integer.");
        }
    }

    /**
     * Validates the range of an integer.
     *
     * @param numberToCheck The integer to check.
     * @throws IllegalArgumentException if the integer is outside the specified range.
     */
    private static void validateIntegerRange(final int numberToCheck)
    {
        if(numberToCheck < MIN_LENGTH_NTH ||
           numberToCheck > MAX_LENGTH_NTH)
        {
            throw new IllegalArgumentException(String.format("The number must be from %d to %d.",
                                                             MIN_LENGTH_NTH,
                                                             MAX_LENGTH_NTH));
        }
    }

    /**
     * The main method for executing word operations based on command-line arguments.
     *
     * @param args The array of command-line arguments.
     */
    public static void main(final String[] args)
    {
        final Dictionary    d;
        final List<String>  listOfJaWords;
        final String[]      arrayOfJaWords;

        Wordable      wordy;
        StringBuilder stringBuilder;

        d              = new Dictionary();
        listOfJaWords  = d.listOfJaWords;
        arrayOfJaWords = listOfJaWords.toArray(String[]::new);
        wordy          = null;
        stringBuilder  = new StringBuilder();

        validateArgsLength(args, MIN_LENGTH_ARGS);

        /**
         * Concatenates the list of words using a specified separator.
         *
         * @param unusedString  An unused string parameter.
         * @param unusedNumber  An unused integer parameter.
         * @return The concatenated string of words.
         */
        if(args[CML_INDEX_OF_WORDY_KEYWORD].equalsIgnoreCase(CONCATENATION_KEYWORD))
        {
            wordy = (unusedString, unusedNumber)-> String.join(CONCATENATION_SEPARATOR, listOfJaWords);
        }

        /**
         * Repeats each word a specified number of times.
         *
         * @param unusedString  An unused string parameter.
         * @param unusedNumber  An unused integer parameter.
         * @return The string with each word repeated.
         * @throws IllegalArgumentException if the second command-line argument is not an integer.
         */
        if(args[CML_INDEX_OF_WORDY_KEYWORD].equalsIgnoreCase(REPEAT_KEYWORD))
        {
            validateArgIsInteger(args[CML_INDEX_OF_INTEGER]);

            wordy = (unusedString, unusedNumber)->
            {
                for(final String string: listOfJaWords)
                {
                    for(int i = 0; i < Integer.parseInt(args[CML_INDEX_OF_INTEGER]); i++)
                    {
                        stringBuilder.append(string);
                    }
                }
                return stringBuilder.toString();
            };
        }

        /**
         * Retrieves the nth word from the list of words.
         *
         * @param unusedString  An unused string parameter.
         * @param unusedNumber  An unused integer parameter.
         * @return The nth word from the list.
         * @throws IllegalArgumentException if the specified index is out of range.
         */
        if(args[CML_INDEX_OF_WORDY_KEYWORD].equalsIgnoreCase(NTH_KEYWORD))
        {
            validateIntegerRange(Integer.parseInt(args[CML_INDEX_OF_INTEGER]));

            wordy = (unusedString, unusedNumber)-> listOfJaWords.get(Integer.parseInt(args[CML_INDEX_OF_INTEGER]));
        }

        /**
         * Reverses each word in the list.
         *
         * @param unusedString  An unused string parameter.
         * @param unusedNumber  An unused integer parameter.
         * @return The reversed string containing reversed words.
         */
        if(args[CML_INDEX_OF_WORDY_KEYWORD].equalsIgnoreCase(REVERSE_KEYWORD))
        {
            wordy = (unusedString, unusedNumber)->
            {
                for(final String string : listOfJaWords)
                {
                    StringBuilder reversedWord = new StringBuilder(string).reverse();

                    stringBuilder.append(reversedWord);
                }

                return stringBuilder.toString();
            };
        }

        /**
         * Print the string returned by Wordable wordy.
         */
        System.out.println(wordy.createString("unused string", 0));

        /**
         * Use a method reference to print the entire list of words.
         */
        listOfJaWords.forEach(System.out::println);

        /**
         * Apply the reverseString method from the Dictionary class within a loop to reverse each word and print the result.
         */
        listOfJaWords.forEach(word -> System.out.println(Dictionary.reverseString(word)));

        /**
         * Create an array from the list of words.
         * Create an alphabeticalOrder method in the Dictionary class.
         * Print the list.
         * Use Arrays.sort with a method reference to alphabeticalOrder.
         * Print the sorted list.
         */
        System.out.println(Arrays.toString(arrayOfJaWords));
        Arrays.sort(arrayOfJaWords, d::alphabeticalOrder);
        System.out.println(Arrays.toString(arrayOfJaWords));

        /**
         * Use conditional checks to print only the words that meet a certain condition.
         */
        for(final String word: listOfJaWords)
        {
            if(Dictionary.isLengthAboveFive(word))
            {
                System.out.println(word);
            }
        }
    }
}
