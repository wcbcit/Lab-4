import java.util.List;
import java.util.ArrayList;

/**
 * The dictionary class represents a list of related words.
 * It includes methods for word manipulation and comparison.
 *
 * @author emma lee
 * @author nicholas farrell
 * @author walter chu
 * @version 1.0
 */
public class Dictionary
{
    private static final int MIN_LENGTH_EXCLUSIVE;

    List<String> listOfJaWords;

    static
    {
        MIN_LENGTH_EXCLUSIVE = 5;
    }

    /**
     * Constructs a Dictionary object and initializes the list of words.
     */
    public Dictionary()
    {
        listOfJaWords = new ArrayList<>();

        listOfJaWords.add("jab");
        listOfJaWords.add("jabbed");
        listOfJaWords.add("jabber");
        listOfJaWords.add("jabbered");
        listOfJaWords.add("jabbering");
        listOfJaWords.add("jabbers");
        listOfJaWords.add("jabberwocky");
        listOfJaWords.add("jabbing");
        listOfJaWords.add("jabot");
        listOfJaWords.add("jabots");
        listOfJaWords.add("jabs");
        listOfJaWords.add("jacaranda");
        listOfJaWords.add("jacarandas");
        listOfJaWords.add("jacinth");
        listOfJaWords.add("jack");
        listOfJaWords.add("jackal");
        listOfJaWords.add("jackals");
        listOfJaWords.add("jackanapes");
        listOfJaWords.add("jackanapeses");
        listOfJaWords.add("jackass");
        listOfJaWords.add("jackasses");
        listOfJaWords.add("jackboot");
        listOfJaWords.add("jackboots");
        listOfJaWords.add("jackdaw");
        listOfJaWords.add("jackdaws");
        listOfJaWords.add("jacked");
        listOfJaWords.add("jacket");
        listOfJaWords.add("jacketed");
        listOfJaWords.add("jacketing");
        listOfJaWords.add("jackets");
        listOfJaWords.add("jackhammer");
        listOfJaWords.add("jackhammers");
        listOfJaWords.add("jackie");
        listOfJaWords.add("jacking");
        listOfJaWords.add("jackknife");
        listOfJaWords.add("jackpot");
        listOfJaWords.add("jackpots");
        listOfJaWords.add("jacks");
        listOfJaWords.add("jackson");
        listOfJaWords.add("jacksonville");
        listOfJaWords.add("jaclyn");
        listOfJaWords.add("jacob");
        listOfJaWords.add("jacobean");
        listOfJaWords.add("jacobian");
        listOfJaWords.add("jacobin");
        listOfJaWords.add("jacobins");
        listOfJaWords.add("jacobite");
        listOfJaWords.add("jacobites");
        listOfJaWords.add("jacobs");
        listOfJaWords.add("jacquard");
        listOfJaWords.add("jacquards");
        listOfJaWords.add("jacqueline");
        listOfJaWords.add("jacques");
        listOfJaWords.add("jactitation");
        listOfJaWords.add("jactitations");
        listOfJaWords.add("jactus");
        listOfJaWords.add("jacuzzi");
        listOfJaWords.add("jacuzzis");
        listOfJaWords.add("jade");
        listOfJaWords.add("jaded");
        listOfJaWords.add("jadeite");
        listOfJaWords.add("jadeites");
        listOfJaWords.add("jades");
        listOfJaWords.add("jading");
        listOfJaWords.add("jaeger");
        listOfJaWords.add("jaffa");
        listOfJaWords.add("jag");
        listOfJaWords.add("jagged");
        listOfJaWords.add("jaggedly");
        listOfJaWords.add("jaggedness");
        listOfJaWords.add("jagger");
        listOfJaWords.add("jags");
        listOfJaWords.add("jaguar");
        listOfJaWords.add("jaguars");
        listOfJaWords.add("jai");
        listOfJaWords.add("jail");
        listOfJaWords.add("jailed");
        listOfJaWords.add("jailer");
        listOfJaWords.add("jailers");
        listOfJaWords.add("jailhouse");
        listOfJaWords.add("jailing");
        listOfJaWords.add("jailor");
        listOfJaWords.add("jailors");
        listOfJaWords.add("jails");
        listOfJaWords.add("jaipur");
        listOfJaWords.add("jakarta");
        listOfJaWords.add("jake");
        listOfJaWords.add("jalopies");
        listOfJaWords.add("jalopy");
        listOfJaWords.add("jalousie");
        listOfJaWords.add("jalousies");
        listOfJaWords.add("jam");
        listOfJaWords.add("jamaica");
        listOfJaWords.add("jamaican");
        listOfJaWords.add("jamaicans");
        listOfJaWords.add("jamb");
        listOfJaWords.add("jamboree");
        listOfJaWords.add("jamborees");
        listOfJaWords.add("jambs");
        listOfJaWords.add("james");
        listOfJaWords.add("jamey");
        listOfJaWords.add("jamie");
        listOfJaWords.add("jammed");
        listOfJaWords.add("jamming");
        listOfJaWords.add("jammy");
        listOfJaWords.add("jams");
        listOfJaWords.add("jan");
        listOfJaWords.add("jane");
        listOfJaWords.add("janeiro");
        listOfJaWords.add("janet");
        listOfJaWords.add("jangle");
        listOfJaWords.add("jangled");
        listOfJaWords.add("jangles");
        listOfJaWords.add("jangling");
        listOfJaWords.add("janice");
        listOfJaWords.add("janitor");
        listOfJaWords.add("janitorial");
        listOfJaWords.add("janitors");
        listOfJaWords.add("january");
        listOfJaWords.add("januarys");
        listOfJaWords.add("janus");
        listOfJaWords.add("japan");
        listOfJaWords.add("japanese");
        listOfJaWords.add("japanned");
        listOfJaWords.add("japanning");
        listOfJaWords.add("japans");
        listOfJaWords.add("jape");
        listOfJaWords.add("japed");
        listOfJaWords.add("japer");
        listOfJaWords.add("japers");
        listOfJaWords.add("japery");
        listOfJaWords.add("japes");
        listOfJaWords.add("japing");
        listOfJaWords.add("japonica");
        listOfJaWords.add("japonicas");
        listOfJaWords.add("jar");
        listOfJaWords.add("jardiniere");
        listOfJaWords.add("jardinieres");
        listOfJaWords.add("jarful");
        listOfJaWords.add("jarfuls");
        listOfJaWords.add("jargon");
        listOfJaWords.add("jargons");
        listOfJaWords.add("jarred");
        listOfJaWords.add("jarring");
        listOfJaWords.add("jarringly");
        listOfJaWords.add("jarrow");
        listOfJaWords.add("jars");
        listOfJaWords.add("jasmine");
        listOfJaWords.add("jasmines");
        listOfJaWords.add("jason");
        listOfJaWords.add("jasper");
        listOfJaWords.add("jaspers");
        listOfJaWords.add("jaundice");
        listOfJaWords.add("jaundiced");
        listOfJaWords.add("jaunt");
        listOfJaWords.add("jaunted");
        listOfJaWords.add("jauntier");
        listOfJaWords.add("jauntiest");
        listOfJaWords.add("jauntily");
        listOfJaWords.add("jaunting");
        listOfJaWords.add("jaunts");
        listOfJaWords.add("jaunty");
        listOfJaWords.add("java");
        listOfJaWords.add("javanese");
        listOfJaWords.add("javelin");
        listOfJaWords.add("javelins");
        listOfJaWords.add("jaw");
        listOfJaWords.add("jawbone");
        listOfJaWords.add("jawbones");
        listOfJaWords.add("jawboning");
        listOfJaWords.add("jawbreaker");
        listOfJaWords.add("jawbreakers");
        listOfJaWords.add("jawed");
        listOfJaWords.add("jawing");
        listOfJaWords.add("jaws");
        listOfJaWords.add("jay");
        listOfJaWords.add("jays");
        listOfJaWords.add("jayvees");
        listOfJaWords.add("jaywalk");
        listOfJaWords.add("jaywalked");
        listOfJaWords.add("jaywalker");
        listOfJaWords.add("jaywalkers");
        listOfJaWords.add("jaywalking");
        listOfJaWords.add("jaywalks");
        listOfJaWords.add("jazz");
        listOfJaWords.add("jazzed");
        listOfJaWords.add("jazzes");
        listOfJaWords.add("jazzier");
        listOfJaWords.add("jazziest");
        listOfJaWords.add("jazzing");
        listOfJaWords.add("jazzman");
        listOfJaWords.add("jazzmen");
        listOfJaWords.add("jazzy");
    }

    /**
     * Retrieves the word based on input parameters and a Wordable interface.
     *
     * @param word   The input word.
     * @param number The number associated with the word.
     * @param w      The Wordable interface implementation.
     * @return The retrieved word.
     */
    public String getWords(final String   word,
                           final int      number,
                           final Wordable w)
    {
        return word;
    }

    /**
     * Reverses the given string.
     *
     * @param s The input string to be reversed.
     * @return The reversed string.
     */
    public static String reverseString(final String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Compares two words in alphabetical order.
     *
     * @param word1 The first word.
     * @param word2 The second word.
     * @return An integer representing the order of the words.
     */
    public int alphabeticalOrder(final String word1,
                                 final String word2)
    {
        return word1.compareTo(word2);
    }

    /**
     * Checks if the length of a word is above a specified minimum length.
     *
     * @param word The word to check.
     * @return True if the word's length is above the minimum length, false otherwise.
     */
    public static boolean isLengthAboveFive(final String word)
    {
        return word.length() > MIN_LENGTH_EXCLUSIVE;
    }
}
