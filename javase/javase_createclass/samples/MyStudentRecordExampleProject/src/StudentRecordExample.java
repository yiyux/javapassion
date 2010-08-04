public class StudentRecordExample {
    
    /** Creates a new instance of StudentRecordExample */
    public StudentRecordExample() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an object instance of StudentRecord class.
        StudentRecord annaRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create another object instance of StudentRecord class.
        StudentRecord beahRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Create the 3rd object instance of StudentRecord class.
        StudentRecord crisRecord =new StudentRecord();
        
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
        
        // Set the names of the students.
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
        
        // Print anna's name.
        System.out.println("Name = " + annaRecord.getName());
        
        // Print number of students.
        System.out.println("Student Count = "+StudentRecord.getStudentCount());
        
        // Set Anna's grades
        annaRecord.setName("Anna");
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);
        
        // Invoke overloaded methods
        annaRecord.myprint();
        annaRecord.myprint(annaRecord.getName());
        annaRecord.myprint(annaRecord.getName(), annaRecord.getAverage());
        
    }
    
}
