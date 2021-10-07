import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        System.out.println("Input y");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try{
            int sum = x + y;
            int minus = x - y;
            int multiple = x * y;
            int divide = x / y;
            System.out.println("Sum of x and y equal " + sum);
            System.out.println("Minus of x and y equal " + minus);
            System.out.println("Multiple of x and y equal " + multiple);
            System.out.println("Divide of x and y equal " + divide);
        }catch (Exception e){

            System.err.println("Exception occurs" + e.getMessage());
        }
    }
}
