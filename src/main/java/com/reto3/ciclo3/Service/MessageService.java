package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Message;
import com.reto3.ciclo3.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.getAllMessages();
    }

    public Optional<Message> getMessage(Integer id) {
        return messageRepository.getMessage(id);
    }

    public Message saveMessage(Message message) {
        return messageRepository.saveMessage(message);
    }

    public Message save(Message message) {

        if (message.getIdMessage() == null) {
            return messageRepository.saveMessage(message);
        } else {
            Optional<Message> message1 = messageRepository.getMessage(message.getIdMessage());
            if (message1.isEmpty()) {
                return messageRepository.saveMessage(message);
            } else {
                return message;
            }
        }
    }
}