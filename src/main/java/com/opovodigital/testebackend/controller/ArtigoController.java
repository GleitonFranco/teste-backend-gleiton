package com.opovodigital.testebackend.controller;

import com.opovodigital.testebackend.dao.ArtigoDao;
import com.opovodigital.testebackend.model.Artigo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArtigoController {

    private ArtigoDao dao = new ArtigoDao();

    @RequestMapping(value = "/artigos/novo", method = RequestMethod.GET)
    public String novo(Model model) {
        model.addAttribute("artigo", new Artigo());
        return "pages/ArtigoForm";
    }

    @GetMapping("/artigos/lista")
    public String lista(Model model) {
        model.addAttribute("artigos", this.dao.todos());
        return "pages/ArtigoLista";
    }

    @GetMapping("/artigos/{id}")
    @RequestMapping(value = "/artigos/{id}", method = RequestMethod.GET)
    public String form(Model model, @PathVariable("id") Long id) {
        model.addAttribute("artigo", this.dao.obterPorId(id));
        return "pages/ArtigoForm";
    }

    @GetMapping("/artigos/delete/{id}")
    public String remover(Model model, @PathVariable("id") Long id) {
        this.dao.remover(id);
        model.addAttribute("artigos", this.dao.todos());
        return "pages/ArtigoLista";
    }

    @RequestMapping(value = "/artigos", method = RequestMethod.POST)
    public String salvarOuAtualizar(Model model, Artigo artigo) { //@PathVariable("artigo")
        if (artigo.getId() == null) {
            dao.salvar(artigo);
        } else {
            dao.atualizar(artigo);
        }
        model.addAttribute("artigos", this.dao.todos());
        return "pages/ArtigoLista";
    }
}
