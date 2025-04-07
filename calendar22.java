import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class calendar22 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df); // Corrected method name: format instead of fromat
        System.out.println(myDate);
    }
}