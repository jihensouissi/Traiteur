package tn.esprit.spring.serviceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.entities.Client;

import java.util.List;

public interface IServiceClient {

    public List<Client> retrieveAllClients();
    public Client ajouterClient(Client client);

}
