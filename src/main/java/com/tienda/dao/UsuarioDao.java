/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.dao;

import com.tienda.domian.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username);
    
    
    //buscar usuario por username y password
    Usuario findByUsernameAndPassword(String username, String Password);
    
    //buscar por username o correo
    Usuario findByUsernameOrCorreo(String username, String correo);
    
    //si exite un usuario o un correo
    boolean existsByUsernameOrCorreo(String username, String correo);
}
