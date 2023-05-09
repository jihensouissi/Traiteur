package tn.esprit.spring.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Plat;
import tn.esprit.spring.repository.PlatRepository;
import tn.esprit.spring.serviceInterface.IServicePlat;

import java.util.List;
@RestController
@Api(tags = "Gestion des plats")
@RequestMapping("/plat")
public class PlatController {
    @Autowired
    IServicePlat servicePlat;


    @ApiOperation(value = "Ajouter un Plat")
    @PostMapping("/add-assign-Plat/{idClient}/{idCuisinier}")
    @ResponseBody
    public void ajouterPlatAffecterClientsEtCuisinierr (@RequestBody Plat plat, @PathVariable("idClient") Integer idClient,@PathVariable("idCuisinier") Integer idCuisinier)
    {servicePlat.ajouterPlatAffecterClientEtCuisinier(plat,idClient,idCuisinier);}
    @ApiOperation(value = "Afficher Plats")
    @GetMapping("/Afficher Plat/{nom}/{prenom}")
    public List<Plat> AfficherlistPlatsParClient(@PathVariable("nom") String nom,@PathVariable("prenom") String prenom) {
        return servicePlat.AfficherlistPlatsParClient(nom,prenom);

    }


}
