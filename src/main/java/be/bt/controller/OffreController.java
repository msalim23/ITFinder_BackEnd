package be.bt.controller;


import be.bt.domain.Demandeur;
import be.bt.domain.Offre;
import be.bt.repository.IDemandeurRepository;
import be.bt.repository.IOffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
public class OffreController {

    @Autowired
    IOffreRepository offreRepository;

    @GetMapping(value= {"/offres"})
    public List<Offre> getAll() {
        return offreRepository.findAll();
    }

    @GetMapping(value= {"/offre/{id}"})
    public ResponseEntity<Offre> getById(@PathVariable String id) {

        Optional<Offre> result = offreRepository.findById(id);

        return (result.isPresent())?
                new ResponseEntity<>(result.get(), HttpStatus.OK)
                :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/offre/add")
    public void addOffre( @RequestBody Offre p) {
        offreRepository.save(p);
    }

    @PutMapping(value = "/offre/update")
    public void updateOffre( @RequestBody Offre p) {

        offreRepository.save(p);
    }

    @DeleteMapping(value = "/offre/delete/{id}")
    public void deleteDemandeur (@PathVariable String id){
        offreRepository.deleteById(id);
    }


}
