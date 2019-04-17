/**
 * Вычислите значение выражения e^(x−2)+|sin(x)|−x^4⋅cos1/x при x=3.6 Ответ: -156.1276
 */
package calculations.task12;

public class Task12 {
    public static void main(String[] args) {
        Result res = new Result(3.6);
        System.out.printf("%.4f", res.displayResult());
    }
}
