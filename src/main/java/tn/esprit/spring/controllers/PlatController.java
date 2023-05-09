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
    @Autowired
    private PlatRepository platRepository;

    @ApiOperation(value = "Récupérer la liste des clients")
    @GetMapping("/retrieve-all-clients")
    @ResponseBody
    public void ajouterPlatAffecterClientsEtCuisinierr (Plat plat, Integer idClient, Integer idCuisinier)
    {plat.aj}

}
