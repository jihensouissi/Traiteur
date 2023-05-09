package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Categorie;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.entities.Plat;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.CuisinierRepository;
import tn.esprit.spring.repository.PlatRepository;
import tn.esprit.spring.serviceInterface.IServicePlat;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class PlatServiceMPL implements IServicePlat {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    PlatRepository platRepository;
    @Autowired
    CuisinierRepository cuisinierRepository;
    public void ajouterPlatAffecterClientEtCuisinier (Plat plat, Integer idClient, Integer idCuisinier)
    {
        platRepository.save(plat);
        Client c =clientRepository.findById(idClient).orElse(null);
        Cuisinier cu=cuisinierRepository.findById(idCuisinier).orElse(null);
        Set<Plat> plats = c.getPlats();
        Integer p=0;
        for (Plat platt :plats)
        {
            if(platt.getCategorie().equals(Categorie.PRINIPAL))
            {p++;}
            if (p<2){plat.setClient(c);}
            if (p>2 &&platt.getCategorie().equals(Categorie.DESSERT)|platt.getCategorie().equals(Categorie.ENTREE))
            {plat.setClient(c);}


        }
        log.info(("Rejcted"));
        cu.getPlats().add(plat);
        platRepository.save(plat);


    }

    @Override
    public List<Plat> AfficherlistPlatsParClient(String nom, String prenom) {
        // Client client = cr.findByNomEAndPrenomE(nom,prenom);
        return platRepository.findByClientNomAndClientPrenom(nom,prenom);

    }







}
