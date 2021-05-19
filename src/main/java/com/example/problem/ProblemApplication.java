package com.example.problem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = ProblemApplication.class)

public class ProblemApplication implements CommandLineRunner {

    // This application will fail to start up, as it tries to parse ChiliConfig before KidneyConfig
    // Just rename KidneyConfig to AAAKidneyConfig and it will start up.

    private final PartyService partyService;

    public ProblemApplication(PartyService partyService) { this.partyService = partyService; }


    public static void main(String[] args) {
        SpringApplication.run(ProblemApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("Wow, we're having a party. Let the party service serve the food");
        System.out.println(partyService.serve());
        System.out.println("Done.");
    }
}
