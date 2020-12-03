/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.teste;

import br.ulbra.model.bean.Noticias;
import br.ulbra.model.dao.NoticiasDAO;
import javax.swing.JOptionPane;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author maria
 */
public class teste {
    
    
    public static void main(String[] args) {
    /* n.setId(1);
        f.setNoticias("blablabla");*/
      
        NoticiasDAO dao = new NoticiasDAO();
        Noticias nat = new Noticias();
        nat.setTitulo("");
        dao.save(nat);
        
        /*Noticias n = dao.findById(2);
       
       
        dao.save(n);
        
        JOptionPane.showMessageDialog(null, "Item inserido\nId:"+f.getId()+"\nTitulo:"+f.getTitulo()+
                "\nNoticias:"+f.getNoticias()+"\nDataPublicacao:"+f.getDataPublicacao());*/
                
       
       
       String resultado = "Consulta por Descrição\n "
                + "--------------------------------\n"
               + "  Código    |  Titulo    |    Noticias    |    Data Publicacao    \n";
        for (Noticias n: dao.findAll()){
            resultado += "  "
                    + " " +n.getId()+"     "
                    + "         |    "+n.getTitulo()+"\n"
                    + "         |    "+n.getNoticias()+"\n"
                    + "         |    "+n.getDataPublicacao()+"\n";
   
                  
                                       
        }
        JOptionPane.showMessageDialog(null, resultado);
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Qual código deseja excluir?"));
        dao.remove(cod);

    }
}
