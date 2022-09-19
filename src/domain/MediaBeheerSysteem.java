package domain;

import java.util.HashMap;

public class MediaBeheerSysteem {
    //arraylist of hashmap van software's
    private HashMap<Integer, Media> medias;
    private int id=1;

    //constructor
    public MediaBeheerSysteem() {
        this.medias = new HashMap<>();
    }


    // TODO: 19/09/2022 getAll functie
    public String getAll(){
        String res="";
        for (int i:medias.keySet()){
            res+="\n"+medias.get(i);
        }
        return res;
    }
    // TODO: 19/09/2022 saveAll functie
    public void saveAll(){
        //geen idee
    }
    // TODO: 19/09/2022 voegtoe functie
    public void voegToe(Media media){
        medias.put(id,media);
    }
    // TODO: 19/09/2022 getTotaleWaardeBeschikbareSoftware functie
    public double getTotaleWaardeBeschikbareSoftware(){
        return 0;
    }
}
