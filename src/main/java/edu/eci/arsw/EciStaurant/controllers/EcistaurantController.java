package edu.eci.arsw.EciStaurant.controllers;

import edu.eci.arsw.EciStaurant.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/")
public class EcistaurantController {

        @Autowired
        private StudentRepository studenRepo;

        public String getMensaje() {
            return "Estamos Trabajando en ECI-STAURANT ;)";

    }
}
