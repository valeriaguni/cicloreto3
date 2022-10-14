package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.MessageCrudRepository;
import com.reto3.ciclo3.Entidad.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class MessageRepository {

    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAllMessages(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getMessage(Integer idMessage){
        return messageCrudRepository.findById(idMessage);
    }

    public Message saveMessage(Message message){
        return messageCrudRepository.save(message);
    }
}