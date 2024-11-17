// Supervisor.java
package main.java;

import java.util.ArrayList;
import java.util.List;

public class Supervisor{
    private List<Course> courses;
    
    // Constructor with sample data
    public Supervisor(){
    this.courses = new ArrayList<>();
    courses.add(new Course("Object Oriented Programming", "Dr. Bashaer AlSaadi"));
    courses.add(new Course("Digital Logic Design", "Dr. Abrar AlAli"));
    courses.add(new Course("Discrete Mathematics", "Dr. Abeer AlShareef"));
    courses.add(new Course("General Physics", "Dr. Abeer AlShareef"));
    }
    
    // Method to display all courses
    public void displayCourses(){
        if (courses.isEmpty()){
            System.out.println("No coureses available.");
            return;
        }
        for (Course course : courses){
        System.out.println(course);
        }
    }
    
    // Method to search for courses by title or instructor
    public void searchCourse(String query){
        boolean found = false;
        for (Course course : courses){
            if (course.getcourseName().equalsIgnoreCase(query) || course.getInstructor().equalsIgnoreCase(query)){
                System.out.println(course);
                found = true;
            }
        }
        if (!found){
            System.out.println("No courses found matching the query");
        }
    }
    
    // Method to display courses by area (since area is static, this simply display all courses)
    public void displayCoursesByArea(){
        if (courses.isEmpty()){
        System.out.println("No courses available.");
        return;
        }
        System.out.println("--- All Courses in Area: Computer Science ---");
        for (Course course : courses){
            System.out.println(course);
        }
    }

    void addCourse(String title, String instructor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}




















