package calculations.task13;

import static java.lang.Math.*;

public class Result {

    private double a, b, x;

    public Result(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public double displayResult() {
        double res = pow((pow(x, 2) + b), 1.0 / 5.0) - ((pow(b, 2) * pow(sin(x + a), 3)) / x);
        return res;
    }
}
