package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApartmentController {

    @RequestMapping("/apartments")
    public String apartment(Model model){
        model.addAttribute("apartments", Hw1Application.apartments);
        return "apartments/list";
    }
    @RequestMapping("/newApartment")
    public String newApartment(Model model){
        model.addAttribute("apartment", new Apartment());
        return "apartments/form";
    }

    @RequestMapping("/addApartment")
    public String addApartment(@ModelAttribute Apartment apartment){
        Hw1Application.apartments.add(apartment);
        return "redirect:/apartment";
    }
}
