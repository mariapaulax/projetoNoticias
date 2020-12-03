/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model.dao;

import br.ulbra.connection.ConnectionFactory;
import br.ulbra.model.bean.Noticias;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class NoticiasDAO {
     public void save(Noticias noticias){
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
           em.getTransaction().begin();
           
           if(noticias.getId()== null){
               
           em.persist(noticias);//insert no banco
           }else{
               em.merge(noticias);
           }
           em.getTransaction().commit();
           
        } catch (Exception e) {
           System.err.print(e.getMessage());
           em.getTransaction().rollback();
            
            
        }finally{
           em.close();
            
        }
         
        }
    
    public Noticias remove(Integer id){
          EntityManager em = new ConnectionFactory().getConnection();
          Noticias noticias = null;
        try {
           noticias = em.find(Noticias.class, id);
            em.getTransaction().begin();
            em.remove(noticias);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "removido com sucesso");
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        return noticias;
    }

    
    public Noticias findById(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Noticias noticias  = null;
        try {
            noticias = em.find(Noticias.class, id);
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }finally{
            em.close();
        }
        
        return noticias;
    }
    
    
    public List<Noticias> findAll(){
          EntityManager em = new ConnectionFactory().getConnection();
          List<Noticias> noticias = null;
          try {
            noticias = em.createQuery("from Noticias n").getResultList();
            
        } catch (Exception e) {
             System.err.println(e);
           
        }finally{
            em.close();
          }
          return noticias;
    }
}
