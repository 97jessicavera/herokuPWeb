package com.m4a.practicaBD.repositorios;

import java.util.List;

import com.m4a.practicaBD.modelos.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    //Metodo que permite la consulta de datos por el campo de identificacion
    @Query(value="Select a from Autor a where a.Nombre Like '%:Nombre%' ")
    List<Autor> buscarpornombre(@Param("Nombre")  String Nombre);
}
