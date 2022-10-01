package ui;


import domain.Caesar;
import domain.Spiegeling;

public class Main {
    public static void main(String[] args) {
        String a= "hello world";
        Spiegeling spiegeling=new Spiegeling();
        Caesar caesar=new Caesar();
        String b=caesar.encode(a);

        System.out.println(caesar.encode(a));
        System.out.println(caesar.decode(b));
    }
}