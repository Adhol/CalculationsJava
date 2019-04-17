/**
 * Вычислите |x|+x^5, если x=−2. Ответ: -30
 */
package calculations.task9;

public class Task9 {
    public static void main(String[] args) {
        int x = -2;
        int result = (int) (Math.abs(x) + Math.pow(x, 5));
        System.out.println(result);
    }


}
