package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요! ");
        int fisrtNum = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요! ");
        int secondNum = scanner.nextInt();
        int result = fisrtNum * secondNum;

        System.out.println("두 수를 곱한 결과는: " + result);
    }
}
