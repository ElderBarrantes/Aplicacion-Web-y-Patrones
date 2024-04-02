
package com.tienda.service;

import com.tienda.domian.Producto;
import java.util.List;

//En esta clase obtenemos los servicios que queremos implementar en nuestra BD para que el 
//usuario pueda accionarlas despues en la pagina o vista del sitio web.

public interface ProductoService {
    
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);//todos los objetos que llamen a varios datos o una lista deben de llamarse en plural. getProductos. 
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);//Este nombre podriamos cambiarlo ya que podria confundirse con el de dao
    
        //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}