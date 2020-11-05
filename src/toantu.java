import java.util.Scanner;

public class toantu {
    public static void main (String[] args) {
        float width ;
        float heigth ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wight :");
        width = sc.nextFloat();
        System.out.println();
        System.out.println("Enter height:");
        heigth = sc.nextFloat();
        float area = width*heigth ;
        System.out.println("Area is :" + area);
    }
}
