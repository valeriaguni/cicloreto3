package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Client;
import com.reto3.ciclo3.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService {

    @Autowired

    private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.getAllClients();
    }

    public Optional<Client> getClient(Integer id){
        return clientRepository.getClient(id);
    }

    public Client saveClient(Client client){
        return clientRepository.saveClient(client);
    }

    public Client save(Client client) {

        if (client.getId() == null) {
            return clientRepository.saveClient(client);
        } else {
            Optional<Client> client1 = clientRepository.getClient(client.getId());
            if (client1.isEmpty()) {
                return clientRepository.saveClient(client);
            } else {
                return client;
            }
        }
    }
}