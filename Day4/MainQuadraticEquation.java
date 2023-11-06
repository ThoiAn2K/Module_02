import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter value of c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double discriminant = equation.getDiscrimitnant();

        if (discriminant > 0){
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println(" pt co 2 nghiem ");
            System.out.println("nghiem 1 : " + root1);
            System.out.println("nghiem 2 : " + root2);
        } else if (discriminant == 0){
            double root = equation.getRoot1();
            System.out.println("pt co 1 nghiem duy nhat : " + root);
        } else {
            System.out.println("pt vo nghiem ");
        }
    }
}
