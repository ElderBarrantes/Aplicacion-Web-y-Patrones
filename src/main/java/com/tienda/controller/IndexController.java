
package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//este controlador respondera a todas las peticiones que inicien con index
public class IndexController {
    
    @RequestMapping("/")
    //ha esto se le llama metodo o accion
    public String page(Model model) {//el nombre del metodo se llama page.
        model.addAttribute("attribute", "value");
        return "index";//en el return, se indica el nombre de una vista que este en el archivo templates. 
        //Solo se le agrega el nombre, no el .html
    }
    
}
