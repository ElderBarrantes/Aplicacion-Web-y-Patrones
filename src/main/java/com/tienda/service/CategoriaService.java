
package com.tienda.service;

import com.tienda.domian.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
}
