
package com.tienda.dao;

import com.tienda.domian.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    List<Categoria> findByDescripcion(String descripcion);
}
