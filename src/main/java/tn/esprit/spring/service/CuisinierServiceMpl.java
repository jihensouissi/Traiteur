package tn.esprit.spring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.repository.CuisinierRepository;
import tn.esprit.spring.serviceInterface.IServiceCuisinier;

import java.util.List;

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



}
