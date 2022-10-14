package com.reto3.ciclo3.CrudRepository;

import com.reto3.ciclo3.Entidad.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
