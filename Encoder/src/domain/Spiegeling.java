package domain;

public class Spiegeling implements CodeerStrategy {
    @Override
    public String codeer(String s) {
        String[] letters=s.split("");
        StringBuilder res= new StringBuilder();

        for(int i=letters.length-1;i>=0;i--)
            res.append(letters[i]);
        return res.toString();
    }

    @Override
    public String decodeer(String s) {
        String[] letters=s.split("");
        StringBuilder res= new StringBuilder();

        for(int i=letters.length-1;i>=0;i--)
            res.append(letters[i]);
        return res.toString();
    }
}
