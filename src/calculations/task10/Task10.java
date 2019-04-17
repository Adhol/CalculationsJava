/**
 * (x+1)^2+3(x+1) при а) x=1.7; б) x=3. Ответ: а) 15.39 б) 28
 */
package calculations.task10;

public class Task10 {
    public static void main(String[] args) {
        Result res = new Result(1.7);
        System.out.printf("%.2f\n", res.displayResult());
        Result res1 = new Result(3.0);
        System.out.println(res1.displayResult());
    }
}
