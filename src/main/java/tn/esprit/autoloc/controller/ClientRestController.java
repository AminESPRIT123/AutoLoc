package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.interfaces.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    private IClientService clientService;

    // http://localhost:8090/autoloc/client/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
    }

    // http://localhost:8090/autoloc/client/retrieve-client/1
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        Client client = clientService.retrieveClient(clientId);
        return client;
    }

    // http://localhost:8090/autoloc/client/add-client
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        Client client = clientService.addClient(c);
        return client;
    }

    // http://localhost:8090/autoloc/client/remove-client/1
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }

    // http://localhost:8090/autoloc/client/modify-client
    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client c) {
        Client client = clientService.modifyClient(c);
        return client;
    }
}