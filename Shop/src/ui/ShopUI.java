package ui;

import javax.swing.JOptionPane;


import domain.Game;
import domain.Movie;
import domain.Media;
import domain.MediaBeheerSysteem;

import java.util.HashMap;

public class ShopUI {
//SoftwareBeheerSysteem heeft een list van Media objecten (= abstracte klasse)
//Game en Movie erven over van Media

        private final MediaBeheerSysteem beheer;

        public ShopUI(){
            beheer = new MediaBeheerSysteem();
            beheer.getAll();
        }

        public void start(){
            String keuzemenu = createKeuzeMenu();
            int keuze = -1;
            while(keuze != 0){
                String keuzestring = JOptionPane.showInputDialog(keuzemenu);
                if(keuzestring == null){
                    keuze = 0;
                }else{
                    try{
                        keuze = Integer.parseInt(keuzestring);
                        dispatch(keuze);
                    } catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Gelieve een geldige keuze te maken");
                    } catch(IllegalArgumentException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }
        }

        private String createKeuzeMenu(){
            return "1. Registreer software.\n" +
                    "2. Toon alle beschikbare software.\n" +
                    "3. Toon totale prijs van alle beschikbare software.\n" +
                    "\n" +
                    "0. Stop.";
        }

        private void dispatch(int keuze) throws IllegalArgumentException{
            switch (keuze) {
                case 0:
                    beheer.saveAll();
                    break;
                case 1:
                    registreerMedia();
                    break;
                case 2:
                    toonAlleBeschikbareMedia();
                    break;
                case 3:
                    toonTotalePrijsAlleBeschikbareMedia();
                    break;
                default:
                    break;
            }
        }

        private void registreerMedia()  throws IllegalArgumentException{
            try {
                Media media = null;
                String type = JOptionPane.showInputDialog(null,"geef het type van Media (G/M)");
                String naamSoftware= JOptionPane.showInputDialog("Geef de naam van de nieuwe Media");
                String versieSoftware = JOptionPane.showInputDialog("Geef de versie van de nieuwe Media");
                String prijsMedia = JOptionPane.showInputDialog("Geef de prijs van de nieuwe media");

                switch (type) {
                    case "G":
                        //hier kunnen dingen voor de game worden gedaan
                        media = new Game(naamSoftware,versieSoftware,Double.parseDouble(prijsMedia));
                        break;
                    case "M":
                        media = new Movie(naamSoftware,versieSoftware,Double.parseDouble(prijsMedia));
                        break;
                }
                beheer.voegToe(media);

            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        private void toonAlleBeschikbareMedia(){
            String overzicht = beheer.toString();
            JOptionPane.showMessageDialog(null, overzicht);
        }

        private void toonTotalePrijsAlleBeschikbareMedia(){
            double prijs = beheer.getTotaleWaardeBeschikbareSoftware();
            JOptionPane.showMessageDialog(null, "Totale prijs van alle beschikbare software = €" + prijs);
        }
}
