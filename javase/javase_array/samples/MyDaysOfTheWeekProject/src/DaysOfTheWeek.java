
public class DaysOfTheWeek {
     
    public static void main(String[] args) {
        
        // Declare and initialize String array of the days of the week
        String[] days = {"Sunday","Monday","Tuesday","Wednesday",
        "Thursday","Friday","Saturday"};
        
        // Display days of the week using while loop
        System.out.println("Display days of week using while loop");
        int counter = 0;
        while(counter < days.length){
            System.out.println(days[counter]);
            counter++;
        }
        
        // Display days of the week using do-while loop
        System.out.println("Display days of week using do-while loop");
        counter = 0;
        do{
            System.out.println(days[counter]);
            counter++;
        } while(counter < days.length);
        
        // Display days of the week using for loop
        System.out.println("Display days of week using for loop");
        for(counter = 0; counter < days.length; counter++){
            System.out.println(days[counter]);
        }
        
    }
    
}
