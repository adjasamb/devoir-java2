package Repositories;

import java.util.ArrayList;
import java.util.List;

import Entities.Adresse;

public class AdresseRepositories {
    private List<Adresse> tAdresse=new ArrayList<>();
    public  List<Adresse> selectAll(){
       return tAdresse;
    }
    public  Adresse selectByVille(String ville){
        for (Adresse add : tAdresse) {
             if (add.getVille().compareTo(quartier)==0) {
                  return add;
             } 
        }
         return null;
     }
    public  void insert(Adresse adresse){
        tAdresse.add(adresse);
     }
}


