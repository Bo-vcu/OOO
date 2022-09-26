package domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class MediaBeheerSysteem {
    //hashmap van media's
    private HashMap<Integer, Media> medias;
    private int id=1;
    //constructor
    public MediaBeheerSysteem() {
        this.medias = new HashMap<>();
    }
    public void getAll(){
        try {
            File myObject = new File("products.txt");
            Scanner myScanner = new Scanner(myObject);
            while (myScanner.hasNextLine()){
                String s= myScanner.nextLine();
                String[] strings=s.split(",");
                String type=strings[0];
                Media media=null;
                switch (type){
                    case "Game":
                        media=new Game(strings[1].trim(),strings[2].trim(),Double.parseDouble(strings[3]));
                        break;
                    case "Movie":
                        media=new Movie(strings[1].trim(),strings[2].trim(),Double.parseDouble(strings[3]));
                        break;
                }
                this.voegToe(media);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void saveAll()  {
        try {
            FileWriter myWriter = new FileWriter("products.txt");
            for (int i:medias.keySet()) {
                String res = medias.get(i).toString();
                myWriter.write(medias.get(i).getClass().getSimpleName()+", "+res+"\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void voegToe(Media media){
        medias.put(id,media);
        id++;
    }

    // TODO: 19/09/2022 getTotaleWaardeBeschikbareSoftware functie
    public double getTotaleWaardeBeschikbareSoftware(){
        double res=0;
        for (int i: medias.keySet()){
            res+=medias.get(i).getPrijs();
        }
        return res;
    }
    @Override
    public String toString() {
        StringBuilder res= new StringBuilder("In Stock: ");
        for (int i: medias.keySet()){
            res.append("\n").append(medias.get(i));
        }
        return res.toString();
    }
}
