package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController extends CrudController<Reservation> {
    public ReservationController(ReservationRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Reservation reservation, Long id) {
        reservation.setIdReservation(id);
    }
}
