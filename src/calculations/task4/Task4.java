/**
 * Вывести на экран прямоугольник, заполненный буквами А.
 * Количество строк в прямоугольнике равно 5, количество столбцов равно 8.
 */
package calculations.task4;

public class Task4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.displayRectangle();
    }
}
