import java.time.LocalDateTime;
import java.format.DateTimeFormatter;
class calendar22{
    public static void main(String[] args){
        LocalDateTime dt=LocalDateTime.now();
        

        DateTimeFormatter df= DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.fromat(df);
        System.out.println(myDate);
    }
}