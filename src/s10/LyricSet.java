package s10;

import java.util.*;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best", "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args){
        //Create a set from HashSet that's implemented Set
        Set words = new HashSet();
        //Add all word to set
        for (String w : lyric)
            words.add(w);

        //Traverse the list
        //NOTICE: set doesn't allow dupliate items
        for (Object o : words)
            System.out.println(o + " ");
        System.out.println("\n------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
    }
}
