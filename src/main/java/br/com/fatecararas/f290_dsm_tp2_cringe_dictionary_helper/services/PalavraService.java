package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.repositories.PalavraRepository;

@Service
public class PalavraService {

    @Autowired
    private PalavraRepository repository;

    public void adicionar(Palavra palavra) {
        repository.save(palavra);
    }

    public List<Palavra> obterTodas() {
        return repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
     public void atualizar(@PathVariable Integer id, String novoSignificado) {
        Palavra palavra = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Palavra não encontrada"));

        palavra.setSignificado(novoSignificado);
        repository.save(palavra);

    }

    public void atualizarPalavra(@PathVariable Palavra palavra1, String novoSignificado) {
        Palavra palavra = palavra1;
        palavra1.setSignificado(novoSignificado);
        repository.save(palavra);

    }
}

