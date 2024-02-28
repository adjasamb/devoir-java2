import java.util.ArrayList;
import java.util.List;

import Entities.Adresse;
import Entities.Client;
import Services.AdresseService;


public class Views {
    private static final String sc = null;
    private static Object choix;

    public static void main(String[] args) throws Exception {
        do{
        System.out.println("1-Creer un client");
        System.out.println("2-lister les clients");
        System.out.println("3-Ajouter une adresse et lui associe un client");
        System.out.println("4-lister les adresses et lui associe un client");
        System.out.println("5-Quitter");
        choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Entrer un nomcomplet");
                    String numero = sc.nextLine();
                    System.out.println("Entrer un Telephone");
                    String tel = sc.nextLine();
                    System.out.println("Entrer un email");
                    String adresse = sc.nextLine();
                    Adresse ag = new Adresse();
                    ag.setVille(adresse);
                    ag.setQuartier(tel);
                    ag.setNumVilla(adresse);
                    AdresseService.ajouterAdresse(ag);
                    break;

                    case 2:
                    List<Adresse> adresses = AdresseServices.listeraAdresse();
                    for (Adresse : adresses) {
                        System.out.println("ville " + adresse.getVille());
                        System.out.println("quartier " + adresse.getQuartier());
                        System.out.println("numvilla " + adresse.getNumVilla());
                        System.out.println("=================================");
                    }
                    break;

                case 3:
                    System.out.println("Entrer l'addresse");
                    adresse = sc.nextLine();
                    Adresse adressesAdresse = AdresseServices.listeraAdresse(adresse);
                    if (adresse != null) {
                        System.out.println("Ville " + adresse.getAdresse());
                        System.out.println("quartier " +adresse.getQuartier());
                        System.out.println("Adresse " + adresse.getNumVilla());
                    } else {
                        System.out.println("Erreur sur l'adresse");
                    }
                    System.out.println("=================================");
                    break;
         }
        }while (1 != 5);

    } 
 }