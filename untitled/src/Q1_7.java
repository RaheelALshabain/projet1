public class Q1_7 {
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=4;
        int result=Sum(n);
        System.out.println("the sum of squares integers from 1 to "+n+"is:"+result);
    }

}

