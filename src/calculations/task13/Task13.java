/**
 * Вычислите значение выражения pow((pow(x, 2) + b), 1.0 / 5.0) - ((pow(b, 2) * pow(sin(x + a), 3)) / x)
 * при a=0.1, b=0.2 и x=1
 * Ответ: 1.0088
 */
package calculations.task13;

public class Task13 {
    public static void main(String[] args) {
        Result res = new Result(0.1, 0.2, 1.0);
        System.out.printf("%.4f", res.displayResult());
    }
}
