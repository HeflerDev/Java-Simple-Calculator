package calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to HeflerDev Calculator. How can I Help ?");
        char operator = Dialog.getOperator();
        double d1 = Dialog.getNumber();
        double d2 = Dialog.getNumber();
        double result = CalcHelper.calcValues(d1, d2, operator);
        System.out.println(result);
    }
}