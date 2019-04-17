/**
 * Вычислите значение выражения ((abs(x - 5) - sin(x)) / 3) + (sqrt(pow(x, 2) + 2014) * cos(2 * x) - 3).
 * Ответ: -1.76911
 */
package calculations.task11;

public class Task11 {
    public static void main(String[] args) {
        Result res = new Result(-2.34);
        System.out.printf("%.5f", res.displayResult());
    }

}
