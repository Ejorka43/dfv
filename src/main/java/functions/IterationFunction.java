package functions;

public class IterationFunction implements MathFunction {
    private MathFunction g;
    public IterationFunction(MathFunction g) {
        this.g = g;
    }

    @Override
    public double apply(double x) {
        return g.apply(x);
    }
}
