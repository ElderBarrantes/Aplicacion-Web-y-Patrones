
package com.tienda.domian;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

//En esta clase de dominio, generalmente se crean las conexiones con las bases de datos
//por ejemplo, los nombres de los campos, columnas, variables. Asi como los constructores
//y la relaciones que tienen algunas tablas con otras y otros datos utiles


@Data //crea get y set a las variables 
@Entity // realiza un mapeo de la bd 
@Table(name="producto") //especifica el origen de los datos a utilizar.
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto; //hibernate transforma el id_producto
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    //private Long idCategoria;
    
    //En el join que esta abajo lo que le estamos diciendo es que relacione el id_categoria de producto con el id_categoria de Categoria.
    @ManyToOne
    @JoinColumn(name = "id_categoria")//Un join nos permite hacer llamado de una o mas tablas para hacer su consulta.
    Categoria categoria; //aqui le hicimos el llamado a los datos de la clase de categoria.
    
    
    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        //this.idCategoria = idCategoria;
    }
    
    
}
