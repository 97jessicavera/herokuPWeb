package com.m4a.practicaBD.controladores;
import java.util.List;
import com.m4a.practicaBD.modelos.Libro;
import com.m4a.practicaBD.repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // soporte para los meodos get post delete put update
@RequestMapping("/api") // Accion para llamar
public class LibroController {
    
    @Autowired
    private LibroRepository librorepository;
    @GetMapping("/libro")
    public List<Libro> getAllLibro(){
        return librorepository.findAll(); 
    }

    @PostMapping("/libro") //Registra un nuevo libro
    @ResponseBody
    public Libro guardarLibro(@RequestBody Libro l){
       
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

        return librorepository.save(l);
        
        //return new Autor();

    }

    @GetMapping("/{IDLibro}")
    @CrossOrigin
    public Libro recuperar(@PathVariable Long IDLibro) {
        return this.librorepository.findById(IDLibro).get();
    }

    @DeleteMapping("/{IDLibro}")
    @CrossOrigin
    public void eliminar(@PathVariable Long IDLibro) {
        this.librorepository.deleteById(IDLibro);
    }
}
