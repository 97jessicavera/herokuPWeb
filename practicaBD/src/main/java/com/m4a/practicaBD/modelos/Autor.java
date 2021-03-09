package com.m4a.practicaBD.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity; //Referencia clase modelo
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

@Entity
@Table(name="autor")
public class Autor{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long IDAutor;

    @Column(name ="nombre", nullable = false)
    private String Nombre;

    @Column(name ="apellido", nullable = false)
    private String Apellido;

    @Column(name ="nacionalidad", nullable = false)
    private String Nacionalidad;

    @JsonBackReference
    @JoinColumn(name="IDLibro")
    @ManyToOne(fetch = FetchType.LAZY)
    private Libro libro; // Consulta 

    public Autor(){

    }
    public Autor(long IDAutor, String Nombre, String Apellido, String Nacionalidad, Libro libro){
      this.IDAutor= IDAutor;
      this.Nombre=Nombre;
      this.Apellido=Apellido;
      this.Nacionalidad = Nacionalidad;
      this.libro = libro;
    }

    /**
     * @return long return the IDAutor
     */
    public long getIDAutor() {
        return IDAutor;
    }

    /**
     * @param IDAutor the IDAutor to set
     */
    public void setIDAutor(long IDAutor) {
        this.IDAutor = IDAutor;
    }
    /**
     * @return long return the IDAutor
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param IDAutor the IDAutor to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return String return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return String return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return String return the Nacionalidad
     */
    public String getNacionalidad() {
        return Nacionalidad;
    }

    /**
     * @param Nacionalidad the Nacionalidad to set
     */
    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

}