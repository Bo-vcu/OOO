package domain;

public abstract class Media {
    //superklasse software
    //idk, kijk naar de opdracht ofzo?
    private String naam;
    private String versie;
    private double prijs;

    public Media(String naam, String versie, double prijs) {
        this.naam = naam;
        this.versie = versie;
        this.prijs=prijs;
    }

    @Override
    public String toString() {
        return naam+", "+versie+", "+prijs;
    }
}
