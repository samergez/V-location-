package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;

@RestController
@RequestMapping("/api/vehicules")
public class VehiculeController extends CrudController<Vehicule> {
    public VehiculeController(VehiculeRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Vehicule vehicule, Long id) {
        vehicule.setIdVehicule(id);
    }
}
