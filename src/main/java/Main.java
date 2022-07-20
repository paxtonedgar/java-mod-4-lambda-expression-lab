import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        OddOrEven test = (x)->{
            if ((x % 2) == 0) {
                return x+1;
            } else {
                return x+2;
            }
        };

        System.out.println(test.nextOdd(num)); // 7
        System.out.println(test.nextOdd(num2)); // 11
    }

    interface OddOrEven {
        int nextOdd(int input);
    }
}
