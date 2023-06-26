package edu.datascientest.clientapp.service;

import java.util.List;

import edu.datascientest.clientapp.dto.ClientDto;
import edu.datascientest.clientapp.dto.ClientDtoConsultation;
import edu.datascientest.clientapp.model.Client;

public interface ClientService {

    // lire & voir les client
    List<ClientDtoConsultation> getClients();

    // Ajouter client
    void addClient(ClientDto client);

    void updateClient(Client client);

    void deleteClient(Integer id);
}
