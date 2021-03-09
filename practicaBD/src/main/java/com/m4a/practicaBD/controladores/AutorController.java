package com.m4a.practicaBD.controladores;
//import java.util.ArrayList;
import java.util.List;

import com.m4a.practicaBD.modelos.Autor;
//import com.m4a.practicaBD.modelos.RespuestaGenerica;
//import com.m4a.practicaBD.modelos.Libro;
import com.m4a.practicaBD.repositorios.AutorRepository;
//import com.m4a.practicaBD.repositorios.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // soporte para los metodos get post delete put update
@RequestMapping("/api") // Accion para llamar
public class AutorController {

    @Autowired
    private AutorRepository autorrepository;

    @Autowired
    //private LibroController libroRepository;

    @GetMapping("/autor")
    public List<Autor> getAllAutor(){
        return autorrepository.findAll();
    }

    //getparabuscar
    //localhost:9898/api/autor/Jessica
    @GetMapping("/autor/{nombre}")
    @RequestMapping(value = "/autor/{nombre}", method = RequestMethod.GET)
    public List<Autor> getAutorByAutors(@PathVariable("Nombre") String Nombre){
        return autorrepository.buscarpornombre(Nombre);
    }

    @PostMapping("/autor")
    @ResponseBody
    public Autor guardarAutor(@RequestBody Autor a){
       
        /*
        Libro li = new Libro();
        li.setEditorial("Iluminate");
        li.setTitulo("Camilita y su deseo");
        li.setPrecio("12");
        librorepository.save(li);

        Autor a = new Autor();
        a.setNombre("Nombre");
        a.setApellido("Apellido");
        a.setNacionalidad("Nacionalidad");
        a.setLibro(li);
        */

        return autorrepository.save(a);
        

        //return new Autor();


    }
}
