package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Room;
import com.reto3.ciclo3.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms()
    {
        return roomRepository.getAllRooms();
    }

    public Optional<Room> getRoom(Integer id){
        return roomRepository.getRoom(id);
    }

    public Room saveRoom(Room room){
        return roomRepository.saveRoom(room);
    }

}