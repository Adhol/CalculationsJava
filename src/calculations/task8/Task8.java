/**
 * Вычислите значение выражения (a+4b)(a−3b)+a^2 при a=2 и b=3. Ответ:  -94
 */
package calculations.task8;

public class Task8 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int x = (a + 4 * b) * (a - 3 * b) + a * a;
        System.out.println(x);
    }
}
