
import static java.lang.System.out;
import java.time.LocalDate;
import java.time.Period;


public class NewMain {
 
    public static void main(String args[]) throws InterruptedException {
 
     
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1996, 10, 22);
         int year = Period.between(birth,today).getYears();
         int Month = Period.between(birth,today).getMonths();
         int day = Period.between(birth,today).getDays();
             System.out.print(year +" "+Month +" "+day);
       }
    }
    
    
