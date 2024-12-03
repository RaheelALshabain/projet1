import java.util.Scanner;
public class Q5 {
        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            int arr[]= new int[5];
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=in.nextInt();
            }
            printAll(arr);

        }

        public static void printAll(int [] arr) {
            for (int j : arr) {
                System.out.print(j + " ");
            }

        }
    }



