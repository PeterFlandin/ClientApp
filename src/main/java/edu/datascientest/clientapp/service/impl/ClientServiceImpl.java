package edu.datascientest.clientapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.datascientest.clientapp.dto.ClientDto;
import edu.datascientest.clientapp.dto.ClientDtoConsultation;
import edu.datascientest.clientapp.model.Client;
import edu.datascientest.clientapp.repository.ClientRepository;
import edu.datascientest.clientapp.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientDtoConsultation> getClients() {
	return clientRepository.findAll().stream().map(c -> new ClientDtoConsultation(c.getId(), c.getNom()))
		.collect(Collectors.toList());
    }

    @Override
    public void addClient(ClientDto clientDto) {
	Client client = new Client();
	client.setNom(clientDto.getNom());
	client.setAdresse(clientDto.getAdresse());
	clientRepository.save(client);

    }

    @Override
    public void updateClient(Client client) {
	clientRepository.save(client);
    }

    @Override
    public void deleteClient(Integer id) {
	clientRepository.deleteById(id);

    }

}
