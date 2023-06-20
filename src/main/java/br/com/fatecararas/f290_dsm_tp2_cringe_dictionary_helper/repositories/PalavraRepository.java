package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;

@Repository
public interface PalavraRepository extends JpaRepository<Palavra, Integer> {
    
}
