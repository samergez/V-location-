package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.AgenceRepository;

@RestController
@RequestMapping("/api/agences")
public class AgenceController extends CrudController<Agence> {
    public AgenceController(AgenceRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Agence agence, Long id) {
        agence.setIdAgence(id);
    }
}
