package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Tenant;
import co2123.hw1.domain.Apartment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tenants")
public class TenantController {

    @GetMapping("/tenants")
    public String listTenants(@RequestParam("apartment") int apartmentId, Model model) {
        Apartment apartment = Hw1Application.getApartmentById(apartmentId);
        if (apartment != null) {
            List<Tenant> tenants = apartment.getTenants();
            model.addAttribute("tenants", tenants);
            model.addAttribute("apartmentId", apartmentId);
        }
        return "tenants/list";
    }

    @GetMapping("/newTenant")
    public String showNewTenantForm(@RequestParam("apartment") int apartmentId, Model model) {
        model.addAttribute("tenant", new Tenant());
        model.addAttribute("apartmentId", apartmentId);
        return "tenants/form";
    }

    @PostMapping("/addTenant")
    public String addTenant(@ModelAttribute Tenant tenant, @RequestParam("apartment") int apartmentId) {
        Apartment apartment = Hw1Application.getApartmentById(apartmentId);
        if (apartment != null) {
            apartment.addTenant(tenant);
        }
        return "redirect:/tenants?apartment=" + apartmentId;
    }

}