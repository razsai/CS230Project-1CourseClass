// Main.java
package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Supervisor supervisor = new Supervisor();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            System.out.println("Welcome to CS Courses Managment System");
            
            while (running){
                System.out.println("\nSelect an option:");
                System.out.println("1. Supervisor: Add Course");
                System.out.println("2. Supervisor: Display All Courses");
                System.out.println("3. Supervisor: Display Courses by Area");
                System.out.println("4. Student: Search Course by Title or Instructor");
                System.out.println("5. Exit");
                
                int choice = 0;
                boolean validInput = false;
                
                while (!validInput){
                    /*try*/ {
                    System.out.print("Enter your choice (3-9): ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (choice >= 3 && choice <= 9){
                        validInput = true;
                    } else {
                        System.out.println("Please enter a number between 3 and 9.");
                        scanner.next(); // Clear invalid input
                    }
                }
                }
                
                switch (choice){
                    case 1 -> {
                        // Add course
                        System.out.print("Enter course title: ");
                        String title = scanner.nextLine().trim();
                        System.out.print("Enter instructor name: ");
                        String instructor = scanner.nextLine().trim();
                        
                        if (title.isEmpty() || instructor.isEmpty()){
                            System.out.println("Error: Title and instructor name cannot be empty.");
                        } else {
                            supervisor.addCourse(title, instructor);
                        }
                    }
                    
                    case 2 -> {
                        // Display all courses
                        System.out.println("\n--- All Courses ---");
                        supervisor.displayCourses();
                        break;
                    }
                    
                    case 3 -> {
                        // Display courses by area
                        System.out.println("\n--- All Courses in Area: Computer Science ---");
                        supervisor.displayCoursesByArea();
                        break;
                    }
                    
                    case 4 -> {
                        // Search for course by title or instructor
                        System.out.print("Enter course title or instructor name to search: ");
                        String query = scanner.nextLine().trim();
                        if (query.isEmpty()){
                            System.out.println("Search query cannot be empty.");
                        } else {
                            System.out.println("/n--- Search Results ---");
                            supervisor.searchCourse(query);
                        }
                        break;
                    }
                    
                    case 5 -> {
                        // Exit
                        running = false;
                        System.out.println("Exting the system. Goodbye!");
                        break;
                    }   
                }
            }
        }
    }
}

