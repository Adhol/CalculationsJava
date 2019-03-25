package calculations.task10;

public class Result {
    private double x;

    public Result(double x) {
        this.x = x;
    }

    public double result() {
        double res = Math.pow((x + 1), 2) + 3 * (x + 1);
        return res;
    }
}
