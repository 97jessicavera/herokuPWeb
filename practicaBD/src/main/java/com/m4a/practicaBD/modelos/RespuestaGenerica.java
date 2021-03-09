package com.m4a.practicaBD.modelos;

import java.util.List;

public class RespuestaGenerica<T> {
    
    //0-> Respuesta ok
    //1-> Error
    private int codigo;
    private String mensaje;
    private List<T> datos;

    public RespuestaGenerica(){
        
    }
    
    public RespuestaGenerica(int codigo, String mensaje, List<T> datos){
           this.codigo=codigo;
           this.mensaje=mensaje;
           this.datos=datos;
    }

    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return List<T> return the datos
     */
    public List<T> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(List<T> datos) {
        this.datos = datos;
    }

}