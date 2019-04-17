package calculations.task2;
import java.time.LocalDateTime;

public class MyDate {
    private String name;

    public MyDate(String name) {
        this.name = name;
    }

    public void displayDate() {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getMonth());
        System.out.println(name);
    }
}
