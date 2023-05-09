package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entities.Plat;

import java.util.List;

public interface IServicePlat {
    public void ajouterPlatAffecterClientEtCuisinier (Plat plat, Integer idClient, Integer idCuisinier);
}
