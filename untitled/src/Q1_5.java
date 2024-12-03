public class Q1_5 {
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=10;
        int result=sum(n);
        System.out.println("the sum of integers from 1 to "+n+"is:"+result);


}
}
