package com.ingarch.promoteur.repository;

import com.ingarch.promoteur.models.Villa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VillaRepository  extends JpaRepository<Villa, Long> {

    Villa findTop1AppartementByNombrechambreAndProjetEtat(String nb, String etat);

    List<Villa> findByNombrechambreAndProjetEtat(String nb, String etat);
}
