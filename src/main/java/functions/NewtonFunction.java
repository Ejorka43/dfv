package functions;

public class NewtonFunction implements MathFunction {
    private MathFunction f;
    private MathFunction fDerivative;

    public NewtonFunction(MathFunction f, MathFunction fDerivative) {
        this.f = f;
        this.fDerivative = fDerivative;
    }

    @Override
    public double apply(double x) {
        return x - f.apply(x) / fDerivative.apply(x);
    }
}
