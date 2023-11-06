import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {2,4,6,7,9,10,7,12};
        int n = array.length;
        System.out.println("Enter");
        int x =  scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < n; i++){
            if ( array[i] == x){
                index_del = i;
                break;
            }
        }
        if(index_del != -1){
            for (int i = index_del; i < n -1; i++){
                array[i] = array[i+ 1];
            }
            n--;
            System.out.println("Deleted : " + x);
        } else {
            System.out.println(x + "No in Array");
        }

        System.out.print(" new Array : ");
        for ( int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
