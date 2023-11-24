import java.util.Scanner;

public class media1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        media = (double) (  A  * 3.5 +  B  * 7.5)/11; 

        System.out.printf(String.format("MEDIA = %.5f", media)  );
        System.out.println();
    }
}