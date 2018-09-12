/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import webservice.Usuarios;

@Controller
@RequestMapping("/ver.htm")
public class Login {
@RequestMapping(method=RequestMethod.POST)
public String login(@RequestParam("tuser") String User, @RequestParam("tpass") String Pass, Model model)
{
 List<Usuarios> milista= valido(User,Pass);
 model.addAttribute("listauser", milista);
 return "Bienvenido";
}

    private static java.util.List<webservice.Usuarios> valido(java.lang.String user, java.lang.String pass) {
        webservice.Miservicio_Service service = new webservice.Miservicio_Service();
        webservice.Miservicio port = service.getMiservicioPort();
        return port.valido(user, pass);
    }
    
}
