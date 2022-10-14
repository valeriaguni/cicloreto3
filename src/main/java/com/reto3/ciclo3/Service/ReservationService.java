package com.reto3.ciclo3.Service;

import com.reto3.ciclo3.Entidad.Reservation;
import com.reto3.ciclo3.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.getAllReservations();
    }

    public Optional<Reservation> getReservation(Integer idReservation) {
        return reservationRepository.getReservation(idReservation);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.saveReservation(reservation);
    }

    public Reservation save(Reservation reservation) {

        if (reservation.getIdReservation() == null) {
            return reservationRepository.saveReservation(reservation);
        } else {
            Optional<Reservation> reservation1 = reservationRepository.getReservation(reservation.getIdReservation());
            if (reservation1.isEmpty()) {
                return reservationRepository.saveReservation(reservation);
            } else {
                return reservation;
            }
        }
    }
}