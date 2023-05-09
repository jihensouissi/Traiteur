package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Categorie;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.entities.Plat;
import tn.esprit.spring.repository.CuisinierRepository;
import tn.esprit.spring.serviceInterface.IServiceCuisinier;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class CuisinierServiceMpl implements IServiceCuisinier {
    @Autowired
    CuisinierRepository cuisinierRepository;
    public Cuisinier ajouterCuisinier(Cuisinier cuisinier)
    {
        cuisinierRepository.save(cuisinier);
        return cuisinier;
    }
    public Cuisinier retrieveCuisinier(Integer idCuisinieer) {
        return (Cuisinier)this.cuisinierRepository.findById(idCuisinieer).get();
    }
    @Scheduled(fixedDelay = 60000)
    public void afficherListeCuisinier()
    {Integer nb =0;
        List<Cuisinier> cu=cuisinierRepository.findAll();
        for (Cuisinier c:cu)
        {
            Set<Plat>plats=c.getPlats();
            for (Plat p:plats)
            {
                if (p.getCategorie().equals(Categorie.PRINIPAL))
                {nb++;

                }
            }
            if(nb>1) {log.info("Cuisinier java :"+ " "+c.getNom()+" "+c.getPrenom());}
        }

    }



}
