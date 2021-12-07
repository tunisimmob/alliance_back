package com.ingarch.promoteur.controllers;

import com.ingarch.promoteur.models.Villa;
import com.ingarch.promoteur.repository.VillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@Transactional

public class VillaController {
    @Autowired
    VillaRepository villaRepository;
    @PostMapping("/villa")
    public ResponseEntity<Villa> createVilla(@Valid @RequestBody Villa villa) {
        Villa result = villaRepository.save(villa);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/villa/{id}")
        public ResponseEntity<Optional<Villa>> getVilla(@PathVariable Long id) {
        Optional<Villa> projet = villaRepository.findById(id);
        return ResponseEntity.ok().body(projet);
    }

    @PutMapping("/villa")
    public ResponseEntity<Villa> updateVilla(@Valid @RequestBody Villa villa) {
        Villa result = villaRepository.save(villa);
        return ResponseEntity.ok().body(result);
    }


    @GetMapping("/villa")
    public List<Villa> getAllVilla() {
        return villaRepository.findAll();
    }

//
//    @GetMapping("/projets/encours/villas/s0_type")
//    public Villa getvillaS0() {
//        return villaRepository.findTop1villaByNombrechambreAndProjetEtat("0","en_cours");
//    }
//
//    @GetMapping("/projets/encours/villas/s1_type")
//    public Villa getvillaS1() {
//        return villaRepository.findTop1villaByNombrechambreAndProjetEtat("1","en_cours");
//    }
//
//    @GetMapping("/projets/encours/villas/s2_type")
//    public Villa getvillaS2() {
//        return villaRepository.findTop1villaByNombrechambreAndProjetEtat("2","en_cours");
//    }
//
//    @GetMapping("/projets/encours/villas/s3_type")
//    public Villa getvillaS3() {
//        return villaRepository.findTop1villaByNombrechambreAndProjetEtat("3","en_cours");
//    }
//
//
//    @GetMapping("/projets/encours/villas/commerce_type")
//    public Villa getvillaCommerce() {
//        return villaRepository.findTop1villaByNombrechambreAndProjetEtat("4","en_cours");
//    }
//
//
//
//    @GetMapping("/projets/fini/villas/s0_type")
//    public List<Villa> getvillasS0() {
//        return villaRepository.findByNombrechambreAndProjetEtat("0","fini");
//    }
//
//    @GetMapping("/projets/fini/villas/s1_type")
//    public List<Villa> getvillasS1() {
//        return villaRepository.findByNombrechambreAndProjetEtat("1","fini");
//    }
//
//    @GetMapping("/projets/fini/villas/s2_type")
//    public List<Villa> getvillasS2() {
//        return villaRepository.findByNombrechambreAndProjetEtat("2","fini");
//    }
//
//    @GetMapping("/projets/fini/villas/s3_type")
//    public List<Villa> getvillasS3() {
//        return villaRepository.findByNombrechambreAndProjetEtat("3","fini");
//    }
//
//
//    @GetMapping("/projets/fini/villas/commerce_type")
//    public List<Villa> getvillasCommerce() {
//        return villaRepository.findByNombrechambreAndProjetEtat("4","fini");
//    }


    @DeleteMapping("/villa/{id}")
    public ResponseEntity<Void> deleteVilla(@PathVariable Long id) {
        villaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/countvilla")
    public Long countVilla() {
        return villaRepository.count();
    }
}
