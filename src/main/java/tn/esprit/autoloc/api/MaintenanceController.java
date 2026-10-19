package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.repository.MaintenanceRepository;

@RestController
@RequestMapping("/api/maintenances")
public class MaintenanceController extends CrudController<Maintenance> {
    public MaintenanceController(MaintenanceRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Maintenance maintenance, Long id) {
        maintenance.setIdMaintenance(id);
    }
}
