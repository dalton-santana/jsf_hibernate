/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.posweb.dao;

import br.com.posweb.models.Curso;
import br.com.posweb.util.HibernateUtil;
import java.net.URL;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Dalton Sant'Ana
 */
public class CursoDAO {
    
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session;
    Transaction tx;
           

    public void salvar(Curso curso) {
       session = factory.openSession();
       tx = session.beginTransaction();
       
       session.persist(curso);
       
       session.close();    }

}
