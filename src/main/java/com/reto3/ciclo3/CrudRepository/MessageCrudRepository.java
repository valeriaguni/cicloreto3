package com.reto3.ciclo3.CrudRepository;

import com.reto3.ciclo3.Entidad.Message;

import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}