package edu.datascientest.clientapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.datascientest.clientapp.dto.ClientDto;
import edu.datascientest.clientapp.dto.ClientDtoConsultation;
import edu.datascientest.clientapp.model.Client;
import edu.datascientest.clientapp.service.ClientService;

@RestController
@RequestMapping("app-clients/api/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientDtoConsultation> getClients() {

	return clientService.getClients();

    }

    @PostMapping
    public void postClient(@RequestBody ClientDto request) {

	{
	    clientService.addClient(request);
	}

    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Integer id) {

	clientService.deleteClient(id);
    }

    @PutMapping("{id}")
    public void updateClient(@PathVariable("id") Integer id, @RequestBody Client client) {
	clientService.updateClient(client);
    }

//    @PutMapping
//    public void putClient(@PathVariable("id") Integer id, @RequestParam("nom") String nom,
//	    @RequestParam("adresse") String adresse) {
//	Client client = new Client();
//	client.setAdresse(client.getAdresse());
//	client.setNom(client.getNom());
//	clientRepository.save(client);
//    }
}
