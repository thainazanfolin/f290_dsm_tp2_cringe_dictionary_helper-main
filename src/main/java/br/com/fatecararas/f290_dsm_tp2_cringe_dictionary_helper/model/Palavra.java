package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "palavras")
public class Palavra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100, unique = true)
    private String descricao;

    @Column(nullable = false)
    private String significado;

    public Palavra() {
    }

    public Palavra(String descricao, String significado) {
        this.id = null;
        this.descricao = descricao;
        this.significado = significado;
    }

    public Integer getId() {
        return id;
    }

    public Palavra setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String palavra) {
        this.descricao = palavra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    @Override
    public String toString() {
        return "Palavra [id=" + id + ", descricao=" + descricao + ", significado=" + significado + "]";
    }
}
