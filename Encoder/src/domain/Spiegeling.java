package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Spiegeling implements Methode{
    @Override
    public String encode(String s) {
        String[] letters=s.split("");
        StringBuilder res= new StringBuilder();

        for(int i=letters.length-1;i>=0;i--)
            res.append(letters[i]);
        return res.toString();
    }

    @Override
    public String decode(String s) {
        String[] letters=s.split("");
        StringBuilder res= new StringBuilder();

        for(int i=letters.length-1;i>=0;i--)
            res.append(letters[i]);
        return res.toString();
    }
}
