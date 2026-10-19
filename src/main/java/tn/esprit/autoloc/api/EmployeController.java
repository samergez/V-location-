package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.repository.EmployeRepository;

@RestController
@RequestMapping("/api/employes")
public class EmployeController extends CrudController<Employe> {
    public EmployeController(EmployeRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Employe employe, Long id) {
        employe.setIdEmploye(id);
    }
}
