
package br.ulbra.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Noticias {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    private String titulo;
    private String noticias;
    private String dataPublicacao;

    public Noticias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Noticias(Integer id, String titulo, String noticias, String dataPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.noticias = noticias;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Noticias{" + "id=" + id + ", titulo=" + titulo + ", noticias=" + noticias + ", dataPublicacao=" + dataPublicacao + '}';
    }
    
}
