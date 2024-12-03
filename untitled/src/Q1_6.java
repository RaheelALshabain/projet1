public class Q1_6 {
    public static int Sum(int n){
        int sum=0;
        for( int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        int result = Sum(n);
        System.out.println("the sum of odd integers from 1 to " + n + "is:" + result);

    }}
