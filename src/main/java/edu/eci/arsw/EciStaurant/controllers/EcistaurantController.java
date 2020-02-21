package edu.eci.arsw.EciStaurant.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/")
public class EcistaurantController {



        @RequestMapping(method = RequestMethod.GET)
        public String getMensaje() {
            String ans = "Estamos Trabajando en ECI-STAURANT ;)";
            return ans;

    }
}
