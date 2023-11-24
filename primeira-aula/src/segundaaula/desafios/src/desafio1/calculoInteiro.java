package desafio1;

import java.util.Scanner;

public class calculoInteiro {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int A, B, PROD;

        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = A*B;

        System.out.println("PROD = " + PROD);
    }
}

