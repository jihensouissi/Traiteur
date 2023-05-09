package tn.esprit.spring.controllers;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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



}
