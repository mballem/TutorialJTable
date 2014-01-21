package com.mballem.app.controller;

import com.mballem.app.entity.Livro;
import com.mballem.app.facade.LivroFacade;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Marcio Ballem
 * Date: 31/03/13
 * Time: 01:44
 * http://www.mballem.com/
 */
public class LivroController {

    private LivroFacade facade;

    public LivroController() {
        this.facade = new LivroFacade();
    }

    public int addLivro(Livro livro) {
        return facade.save(livro);
    }

    public int alterarLivro(Livro livro) {
        return facade.update(livro);
    }

    public int excluirLivro(Long id) {
        return facade.remove(id);
    }

    public List<Livro> findLivros() {
        return facade.findAll();
    }
}
