
public class DummyClass {
    
    /** Creates a new instance of DummyClass */
    public DummyClass() {
    }
    
    void mymethod1(){
        
        // Note that mymethod2() and this.mymethod2() are the same thing.
        String s1 = mymethod2("Sang Shin");
        String s2 = this.mymethod2("Sang Shin");
        
        System.out.println("s1 = " + s1 + " s2 = " + s2);
        
        // Pass the current object instance as a parameter
        String s3 = this.mymethod3(this);
        System.out.println("s3 = " + s3);
    }
    
    String mymethod2(String name){
        return "Hello " + name;
    }
    
    String mymethod3(Object o1){
        return o1.getClass().getName();
    }
    
}
