package tn.esprit.spring.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Cuisinier;
import tn.esprit.spring.serviceInterface.IServiceCuisinier;

import javax.persistence.Id;

@RestController
@Api(tags = "Gestion des Cuisiniers")
@RequestMapping("/cuisinier")
public class CuisinierController {
    @Autowired
    IServiceCuisinier serviceCuisinier;

    @ApiOperation(value = "Ajouter un Cuisinier")
    @PostMapping("/add-Cuisinier")
    @ResponseBody
    public Cuisinier addCuisinier(@RequestBody Cuisinier cuisinier) {

        Cuisinier c= serviceCuisinier.ajouterCuisinier(cuisinier);
        return c;
    }
    @GetMapping({"/retrieve-cuisinier/{Cuisinier-id}"})
    public Cuisinier retrieveCuisinier(@PathVariable("Cuisinier-id") Integer idCuisinier) {
        return this.serviceCuisinier.retrieveCuisinier(idCuisinier);
    }

}
