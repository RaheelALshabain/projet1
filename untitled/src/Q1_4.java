public class Q1_4 {
    public static boolean isEven(int i){
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(5));
    }

}

