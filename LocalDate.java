import java.time.LocalDateTime;
import java.time.LocalDate;
class LocalDates{
    public static void main(String[] args){
    
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}