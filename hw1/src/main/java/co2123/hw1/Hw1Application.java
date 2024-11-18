package co2123.hw1;

import co2123.hw1.domain.Apartment;
import co2123.hw1.domain.Tenant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {

    public static List<Apartment> apartments;


    public static Apartment getApartmentById(int id) {
        return apartments.stream()
                .filter(apartment -> apartment.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Ensure appropriate getter and setter methods for the 'apartments' list
    public static void setApartments(List<Apartment> apartments) {
        Hw1Application.apartments = apartments;
    }

    public static List<Apartment> getApartments() {
        return apartments;
    }
}

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        apartments = new ArrayList<>();

        Apartment a = new Apartment();
        a.setId(1);
        a.setAddress("1");
        a.setType("Apartment");
        List<Tenant> tenantsA = new ArrayList<>();
        Tenant tenant1A = new Tenant();
        tenant1A.setName("Tenant A1");
        Tenant tenant2A = new Tenant();
        tenant2A.setName("Tenant A2");
        tenantsA.add(tenant1A);
        tenantsA.add(tenant2A);
        a.setTenants(tenantsA);
        apartments.add(a);

        Apartment b = new Apartment();
        b.setId(2);
        b.setAddress("2");
        b.setType("Apartment");
        List<Tenant> tenantsB = new ArrayList<>();
        Tenant tenant1B = new Tenant();
        tenant1B.setName("Tenant B1");
        Tenant tenant2B = new Tenant();
        tenant2B.setName("Tenant B2");
        tenantsB.add(tenant1B);
        tenantsB.add(tenant2B);
        b.setTenants(tenantsB);
        apartments.add(b);

    }
}
