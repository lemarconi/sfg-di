package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Criado por lemarconi on 08/06/2020
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }

}
