package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.entities.Examen;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.CuisinierRepository;
import tn.esprit.spring.serviceInterface.IServiceClient;

import java.util.List;

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




}
