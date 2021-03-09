package com.m4a.practicaBD.repositorios;
import com.m4a.practicaBD.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long>{
    
}
