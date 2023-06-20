package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services.PalavraService;

@Controller
@RequestMapping("/dicionario")
public class PalavraController {

    @Autowired
    private PalavraService service;

    @GetMapping
    public String home(Model model) {
        List<Palavra> palavras = service.obterTodas();
        model.addAttribute("titulo", "Vergonha Alheia");
        model.addAttribute("palavras", palavras);
        model.addAttribute("palavra", new Palavra());
        return "dicionario";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("palavra") Palavra palavra) {
        service.adicionar(palavra);
        return "redirect:/dicionario";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Integer id) {
        service.excluir(id);
        return "redirect:/dicionario";
    }

    //TODO: Me'todo de atualização
     @PostMapping("/atualizar")
    public String atualizar(@PathVariable Integer id, @RequestParam String novoSignificado){
        service.atualizar(id, novoSignificado);
        return "redirect:/formulario";
    }

    //TODO: Método de edição com formulário
     @PostMapping("/atualizar/{id}")
    public String atualizarPalavra(@RequestParam Palavra palavra, @RequestParam String novoSignificado){
        service.atualizarPalavra(palavra, novoSignificado);
        return "redirect:/formulario";
    }

}