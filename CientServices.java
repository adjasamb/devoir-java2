package Services;

import java.util.List;

import Repositories.ClientRepositories;
import Entities.Client;
import Repositories.ClientRepositories;

public class CientServices {
    ClientRepositories clientRepository=new ClientRepositories();
   
   public  List<Client>listerClient(){
    
        return clientRepository.selectAll();
    }
    public void ajouterClient(Client client){
        clientRepository.insert(client);

    }
    public Client trouvclientbytelephone(String telephone){
        return clientRepository.selectclientbytelephone(telephone);
    }

}

