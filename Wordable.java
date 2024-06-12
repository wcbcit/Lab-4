/**
 * A functional interface for creating a string based on input string and integer.
 *
 * @author emma lee
 * @author nicholas farrell
 * @author walter chu
 * @version 1.0
 */
@FunctionalInterface
public interface Wordable
{
    String createString(final String s,
                        final int    n);
}
