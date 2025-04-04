public class Arraylist_Student_marks {
    public static void main(String[] args) {
        // Create a Student object
        Student stu = new Student();
        
        // Assign names to student variables
        stu.Student1 = "ankit";
        stu.Student2 = "aman";
        stu.Student3 = "mahendra";
        stu.Student4 = "raj";
        
        // Call the method to print names
        stu.names();
    }
}

// Corrected class with proper name
class Student {
    String Student1;
    String Student2;
    String Student3;
    String Student4;

    // Method to print student names
    public void names() {
        System.out.println(this.Student1);
        System.out.println(this.Student2);
        System.out.println(this.Student3);
        System.out.println(this.Student4);
    }
}
