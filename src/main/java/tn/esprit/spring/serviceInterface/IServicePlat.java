package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entities.Plat;

import java.util.List;

public interface IServicePlat {
    public void ajouterPlatAffecterClientEtCuisinier (Plat plat, Integer idClient, Integer idCuisinier);

    List<Plat> AfficherlistPlatsParClient(String nom, String prenom);
    public Plat ajouterPlat(Plat plat);
}
