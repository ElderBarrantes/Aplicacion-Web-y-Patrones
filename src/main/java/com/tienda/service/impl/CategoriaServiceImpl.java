
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domian.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired//permite auto crear el metodo categoriaDao o cualquier otra categoria
    private CategoriaDao categoriaDao;//este metodo sirve para interactuar con la BD
    
    @Override
    @Transactional(readOnly= true)
    public List<Categoria> getCategorias(boolean activos) {
            List<Categoria> lista = categoriaDao.findAll();
            
            if(activos)
            {//remover los elementos inactivos
                lista.removeIf(c -> c.isActivo());
            }
            
            return lista;
    }
    
}
