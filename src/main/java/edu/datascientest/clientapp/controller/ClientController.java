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

import edu.datascientest.clientapp.model.Client;
import edu.datascientest.clientapp.repository.ClientRepository;

@RestController
@RequestMapping("app-clients/api/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getClients() {
	return clientRepository.findAll();
    }

    private record ClientRequest(String nom, String adresse) {
    }

    @PostMapping
    public void addClient(@RequestBody ClientRequest request) {
	Client client = new Client();
	client.setNom(request.nom());
	client.setAdresse(request.adresse());
	clientRepository.save(client);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Integer id) {
	Client client = clientRepository.getReferenceById(id);
	clientRepository.delete(client);
    }

    @PutMapping
    public void updateClient(@RequestBody Client client) {
	clientRepository.save(client);
    }

}
