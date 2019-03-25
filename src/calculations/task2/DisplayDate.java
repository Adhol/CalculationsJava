package calculations.task2;
import java.time.LocalDateTime;

public class DisplayDate {
    private String name;

    public DisplayDate(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getMonth());
        System.out.println(name);
    }
}
