package com.example.sport_activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class SportActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportActivityApplication.class, args);
    }
}

@Controller
class SportActivityController {

    @GetMapping("/scheduleActivity")
    public String scheduleActivity(@RequestParam String activity, Model model) {
        String result = "Thank you! Your " + activity + " activity has been scheduled for next weekend.";
        model.addAttribute("scheduledActivity", result);
        return "index"; // Assuming your Thymeleaf template is named "index.html"
    }
}
