package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public interface IClientService {

    List<Client> retrieveAllClients();

    Client retrieveClient(Long id);

    Client addClient(Client entity);

    Client modifyClient(Client entity);

    void removeClient(Long id);
}