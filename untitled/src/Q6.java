import java.util.Scanner;
public class Q6 {


        public static void main(String[] args) {
            int arr[] = new int[5];

            printAll(arr);

        }

        public static void printAll(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }

        public static void inputall(int[] arr) {
            Scanner in = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }
    }

