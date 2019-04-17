/**
 * Вывести на экран текущее название дня недели, название месяца и свое имя.
 * Каждое слово должно быть в отдельной строке.
 */

package calculations.task2;

public class Task2 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate("Aleksey");
        myDate.displayDate();
    }
}
