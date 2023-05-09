package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entities.Cuisinier;

public interface IServiceCuisinier {
    public Cuisinier ajouterCuisinier(Cuisinier cuisinier);
    public void afficherListeCuisinier();
    public Cuisinier retrieveCuisinier(Integer idCuisinieer);

}
