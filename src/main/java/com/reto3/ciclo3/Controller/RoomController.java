package com.reto3.ciclo3.Controller;

import com.reto3.ciclo3.Entidad.Room;
import com.reto3.ciclo3.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Room")
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @GetMapping("/all")
    public List<Room> getAllRooms()
    {
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Optional<Room> getRoom(@PathVariable Integer id)
    {
        return roomService.getRoom(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room saveRoom(@RequestBody Room room)
    {
        return roomService.saveRoom(room);
    }
}