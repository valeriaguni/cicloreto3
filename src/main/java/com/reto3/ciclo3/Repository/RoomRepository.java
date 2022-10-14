package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.RoomCrudRepository;
import com.reto3.ciclo3.Entidad.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class RoomRepository {

    @Autowired
    private RoomCrudRepository roomCrudRepository;

    public List<Room> getAllRooms() {
        return (List<Room>) roomCrudRepository.findAll();
    }

    public Optional<Room> getRoom(Integer id) {
        return roomCrudRepository.findById(id);
    }

    public Room saveRoom(Room room){
        return roomCrudRepository.save(room);
    }
}
