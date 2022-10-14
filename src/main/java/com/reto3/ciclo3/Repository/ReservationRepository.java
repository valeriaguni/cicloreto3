package com.reto3.ciclo3.Repository;

import com.reto3.ciclo3.CrudRepository.ReservationCrudRepository;
import com.reto3.ciclo3.Entidad.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAllReservations(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Optional<Reservation> getReservation(Integer idReservation){
        return reservationCrudRepository.findById(idReservation);
    }

    public Reservation saveReservation(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
}