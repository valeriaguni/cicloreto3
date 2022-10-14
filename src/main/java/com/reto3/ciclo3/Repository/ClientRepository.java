package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.ClientCrudRepository;
import com.reto3.ciclo3.Entidad.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ClientRepository {

    @Autowired

    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAllClients() {
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(Integer id) {
        return clientCrudRepository.findById(id);
    }

    public Client saveClient(Client client) {
        return clientCrudRepository.save(client);
    }
}