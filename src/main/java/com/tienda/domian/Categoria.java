package com.tienda.domian;

import jakarta.persistence.*;//El * permite usar cualquier libreria de persistence
import java.io.Serializable;
import java.util.List;
import lombok.Data;


//Las anotaciones no llevan ";"
//las anotaciones siempre van pegadas a las clases o a los atributos o donde los estemos utilizando
@Data//Nos permite tener el getter and setter y otros atributos como toString, hashcode, etc. En nuestras variables.
@Entity//Para decir que es un objeto de clase identidad
@Table(name="categoria")//Para mapeo de las tablas en mysql
public class Categoria implements Serializable {//Permite que cuando guardamos o jalamos datos de mysql se serialice
    
    private static final long serialVersionUID= 1L;//identificador de version
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;//Esto es el equivalente de id_categoria en mysql. ya que hibernate lo transforma
    private String descripcion;
    private String rutaImagen;
    private boolean activo;// en los booleanos no se llaman getActivo sino isActivo.
    
    @OneToMany//asociamos una categoria con muchos productos
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)//no es insertable ni modificable desde aqui.
    List<Producto> productos;//se crea una lista ya que son varios productos los que  se pueden asociar con una categoria
    
    public Categoria() {
    }
    
    //Creamos el constructor para estas variable para poder modificarlas o actualizarlas en las tablas.
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
