package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.entities.Examen;
import tn.esprit.spring.entities.Plat;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.CuisinierRepository;
import tn.esprit.spring.serviceInterface.IServiceClient;

import java.util.List;
import java.util.Set;

@Service
@Slf4j

public class ClientServiceMPL implements IServiceClient {
    @Autowired
    ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        List<Client> clients = (List<Client>) clientRepository.findAll();
        for (Client client : clients) {
            log.info(" Client : " + client);
        }
        return clients;
    }
    public Client ajouterClient(Client client)
    {
        clientRepository.save(client);
        return client;
    }
    public float MontantApayerParClient(Integer idClient)
    {
        Client c =clientRepository.findById(idClient).get();
       Set<Plat> plats= c.getPlats();
       float montant=0;
       for(Plat p : plats)
       { montant =montant + p.getPrix();}
        return montant;
    }



}
