package Services;

import java.util.List;

import Entities.Adresse;
import Repositories.AdresseRepositories;

public class AdresseService {

    public static void ajouterAdresse(Adresse ag) {
        public class AdresseServices {
    private AdresseRepositories adresseRepositories=new AdresseRepositories();
    
  public List<Adresse> listerAgence(){
      return AdresseRepositories.selectAll();
   }
   public Adresse listeraAdresse(String villeString){
    return adresseRepositories.selectByVille(ville);
   }
   public void ajouterAdresse(Adresse adresse){
    adresseRepositories.insert(adresse);
   }

}
    }
    
}
