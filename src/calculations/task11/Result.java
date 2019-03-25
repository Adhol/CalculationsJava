package calculations.task11;

import static java.lang.Math.*;

public class Result {
    private double x;

    public Result(double x) {
        this.x = x;
    }

    public double result() {
        double res = ((abs(x - 5) - sin(x)) / 3) + (sqrt(pow(x, 2) + 2014) * cos(2 * x) - 3);
        return res;
    }
}
