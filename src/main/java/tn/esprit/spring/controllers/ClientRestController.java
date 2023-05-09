package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Examen;
import tn.esprit.spring.serviceInterface.IExamenService;
import tn.esprit.spring.serviceInterface.IServiceClient;

@RestController
@Api(tags = "Gestion des clients")
@RequestMapping("/client")
public class ClientRestController {

	@Autowired
	IExamenService examenService;
	@Autowired
	IServiceClient serviceClient;
    //http://localhost:8087/SpringMVC/swagger-ui/index.html
	@ApiOperation(value = "Récupérer la liste des clients")
	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients() {
		return serviceClient.retrieveAllClients();
	}
	@ApiOperation(value = "Ajouter un Client")
	@PostMapping("/add-Client")
	@ResponseBody
	public Client addClient(@RequestBody Client client) {
		Client c = serviceClient.ajouterClient(client);
		return c;
	}

	


}
