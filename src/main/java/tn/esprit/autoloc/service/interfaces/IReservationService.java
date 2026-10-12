package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservation(Long id);

    Reservation addReservation(Reservation entity);

    Reservation modifyReservation(Reservation entity);

    void removeReservation(Long id);
}