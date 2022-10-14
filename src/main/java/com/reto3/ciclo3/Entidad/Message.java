package com.reto3.ciclo3.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;

    @Column(name = "messageText", nullable = false, length = 250)
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Category category;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

    public Message() {
    }

    public Message(String messageText) {
        this.messageText = messageText;
    }

    public Message(Integer idMessage, String messageText) {
        this.idMessage = idMessage;
        this.messageText = messageText;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String toString() {
        return "Message{" +
                "idMessage=" + idMessage +
                ", messageText='" + messageText + '\'' +
                ", category=" + category +
                ", client=" + client +
                ", messageText='" + messageText + '\'' +
                '}';


    }
}