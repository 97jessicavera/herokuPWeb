package com.m4a.practicaBD.modelos;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity; //Referencia clase modelo
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;


@Entity
@Table(name="libro")
public class Libro{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long IDLibro;

    @Column(name ="titulo", nullable = false)
    private String Titulo;

    @Column(name ="editorial", nullable = false)
    private String Editorial;

    @Column(name = "precio", nullable = false)
    private String Precio;
    @OneToMany(cascade = CascadeType.ALL, fetch =   FetchType.LAZY, mappedBy =  "libro") // Tabla que hace la realacion
    private List <Autor> autor; // Lista

    public Libro(){

    }
    public Libro(long IDLibro, String Titulo, String Editorial, String Precio){  
     this.IDLibro = IDLibro;
     this.Titulo= Titulo;
     this.Editorial=Editorial;
     this.Precio=Precio;
    }

    /**
     * @return long return the IDLibro
     */
    public long getIDLibro() {
        return IDLibro;
    }

    /**
     * @param IDLibro the IDLibro to set
     */
    public void setIDLibro(long IDLibro) {
        this.IDLibro = IDLibro;
    }

    /**
     * @return String return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return String return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return String return the Precio
     */
    public String getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

}