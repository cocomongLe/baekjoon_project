import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sumOfSquares = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sumOfSquares += num * num;
        }
        int result = sumOfSquares % 10;
        System.out.println(result);

        sc.close();
    }
}