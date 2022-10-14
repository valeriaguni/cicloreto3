package com.reto3.ciclo3.Controller;

import com.reto3.ciclo3.Entidad.Message;
import com.reto3.ciclo3.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    @GetMapping("/{idMessage}")
    public Optional<Message> getMessage(@PathVariable Integer idMessage){ return messageService.getMessage(idMessage);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message saveMessage(@RequestBody Message message){ return messageService.saveMessage(message);
    }
}
