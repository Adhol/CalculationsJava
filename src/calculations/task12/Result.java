package calculations.task12;

import static java.lang.Math.*;

public class Result {

    private double x;

    public Result(double x) {
            this.x = x;
        }

    public double result() {
        double res = pow(E, x - 2) + abs(sin(x)) - pow(x, 4) * cos(1 / x);
        return res;
    }
}
