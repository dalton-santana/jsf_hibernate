/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.posweb.controllers;

import br.com.posweb.dao.CursoDAO;
import br.com.posweb.models.Curso;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Dalton Sant'Ana
 */
@ManagedBean(name = "cursoController")
public class CursoController {

    private Curso curso;
    private List<Curso> lista;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getLista() {
        return lista;
    }

    public void setLista(List<Curso> lista) {
        this.lista = lista;
    }

    public void salvar() {
        
        CursoDAO dao = new CursoDAO();
        dao.salvar(curso);

        inicializar();
    }

    public String getNome() {
        return "Dalton";
    }

    @PostConstruct
    public void inicializar() {
 
       // CursoDAO dao = new CursoDAO();

       // lista = dao.listar();

        curso = new Curso();

    }

}
