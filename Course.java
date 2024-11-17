// Course.java
package main.java;

public class Course {
    private String title;
    private String instructor;
    private static final String area = "Computer Scince"; // Static and final, common for all courses
             
    // Constructor
    public Course(String title, String instructor){
        this.title = title;
        this.instructor = instructor;
    }

    // Getter and Setter methods
    public String getcourseName(){
        return title;
    }

    public void setcourseName(String title){
        this.title = title;
    }

    public String getInstructor(){
        return instructor;
    }

    public void setInstructor(String instructor){
        this.instructor = instructor;
    }

    public static String getArea(){
        return area;
    }

    @Override
    public String toString(){
        return "Title: " + title + ", Instructor: " + instructor + ", Area: " + area;
    }
}