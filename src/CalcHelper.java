public class CalcHelper {
    public static double calcValues(double d1, double d2, char operator) {
        return (
                switch (operator) {
                    case '*':
                        yield d1 * d2;
                    case '/':
                        yield d1 / d2;
                    case '+':
                        yield d1 + d2;
                    case '-':
                        yield d1 - d2;
                    default:
                        yield 0;
                }
        );
    }
}
