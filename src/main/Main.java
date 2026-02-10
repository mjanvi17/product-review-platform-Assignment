package main;

import model.*;
import service.ReviewService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create users
        User u1 = new User("Analyst1", 3, 1.5);
        User u2 = new User("Reviewer2", 1, 1.0);

        // Create product
        Product product = new Product("Notion");

        // Create reviews
        Review r1 = new Review(product, u1, 4, 5);
        Review r2 = new Review(product, u2, 3, 3);

        List<Review> reviews = Arrays.asList(r1, r2);

        // Calculate weighted score
        ReviewService service = new ReviewService();
        double score = service.calculateWeightedScore(reviews);

        System.out.println("Credibility Weighted Score: " + score);
    }
}

