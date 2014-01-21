package com.mballem.app.facade;

import com.mballem.app.dao.ILivroDAO;
import com.mballem.app.dao.LivroDAO;
import com.mballem.app.entity.Livro;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Marcio Ballem
 * Date: 31/03/13
 * Time: 01:41
 * http://www.mballem.com/
 */
public class LivroFacade {

    private ILivroDAO dao;

    public LivroFacade() {
        this.dao = new LivroDAO();
    }

    public int save(Livro livro) {
        return dao.save(livro);
    }

    public int update(Livro livro) {
        return dao.update(livro);
    }

    public int remove(Long id) {
        return dao.remove(id);
    }

    public List<Livro> findAll() {
        return dao.findAll();
    }
}
