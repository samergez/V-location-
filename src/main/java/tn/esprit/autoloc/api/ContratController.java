package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repository.ContratRepository;

@RestController
@RequestMapping("/api/contrats")
public class ContratController extends CrudController<Contrat> {
    public ContratController(ContratRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Contrat contrat, Long id) {
        contrat.setIdContrat(id);
    }
}
