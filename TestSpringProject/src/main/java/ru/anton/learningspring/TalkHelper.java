package ru.anton.learningspring;

import java.util.Set;
import java.util.TreeSet;

/**
 * This is a simple (even trivial) talk helper
 *
 * @author Anton Nazarov
 * @since 26 Aug 2018
 */
public class TalkHelper {

    /**
     * Get only "A" symbols from the string. Every other symbol will replaced by
     * dash "-".
     */
    public String getAs(String msg) {
        StringBuilder sb = new StringBuilder();
        String[] splited = msg.split("a");
        boolean first = true;
        for (String splt : splited) {
            String replaced = splt.replaceAll("\\w", "-");

            if (first) {
                first = false;
            } else {
                sb.append("a").append(replaced);
            }
        }

        return sb.toString();
    }

    /**
     * Get a sorted list of unique characters.
     */
    public String uniqueCharacters(String test) {
        Set<String> symbs = new TreeSet<>();
        for (int i = 0; i < test.length(); i++) {
            symbs.add(String.valueOf(test.charAt(i)));
        }

        StringBuilder sb = new StringBuilder();
        for (String symb : symbs) {
            sb.append(symb);
        }

        return sb.toString();
    }
}
