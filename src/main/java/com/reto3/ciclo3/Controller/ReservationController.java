package com.reto3.ciclo3.Controller;

import com.reto3.ciclo3.Entidad.Reservation;
import com.reto3.ciclo3.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/{idReservation}")
    public Optional<Reservation> getReservation(@PathVariable Integer idReservation){
        return reservationService.getReservation(idReservation);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation saveReservation(@RequestBody Reservation reservation){ return reservationService.saveReservation(reservation); }

}