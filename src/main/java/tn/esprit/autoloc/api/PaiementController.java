package tn.esprit.autoloc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repository.PaiementRepository;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController extends CrudController<Paiement> {
    public PaiementController(PaiementRepository repository) {
        super(repository);
    }

    @Override
    protected void setId(Paiement paiement, Long id) {
        paiement.setIdPaiement(id);
    }
}
