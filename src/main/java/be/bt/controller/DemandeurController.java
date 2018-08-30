package be.bt.controller;

import be.bt.domain.Demandeur;
import be.bt.repository.IDemandeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/demandeurs")
@CrossOrigin(origins="*")
public class DemandeurController {

    @Autowired
    IDemandeurRepository demandeurRepository;

    @GetMapping(value= {""})
    public List<Demandeur> getAll() {
        return demandeurRepository.findAll();
    }

    @GetMapping(value= {"/{id}"})
    public ResponseEntity<Demandeur> getById(@PathVariable String id) {

        Optional<Demandeur> result = demandeurRepository.findById(id);

        return (result.isPresent())?
                new ResponseEntity<>(result.get(), HttpStatus.OK)
                :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/add")
    public void addDemandeur( @RequestBody Demandeur p) {
        demandeurRepository.save(p);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteDemandeur (@PathVariable String id){
        demandeurRepository.deleteById(id);
    }

    @PutMapping(value = "/update")
    public void updateOffre( @RequestBody Demandeur p) {

        demandeurRepository.save(p);
    }
}
