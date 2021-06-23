
public class hw2 {
    public static void main(String[] args) {

    }

    public static boolean number(int a, int b) {
        int sum = a + b;
        if (sum >= 10) {
            if (sum <= 20) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void number1(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицытельное");
        }
    }


    public static boolean number2(int a) {
        if (a < 0) {
            return true;
        } else {
        }
        return false;
    }

    public static void number3(String home, int i){
        for (int j = 0; j < i; j++) {
            System.out.println("home");
        }


    }
}