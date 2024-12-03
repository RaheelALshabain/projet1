public class Q1_2 {
    int score;

    public Q1_2(int score) {
        this.score = score;
    }
    public static void main(String[] args) {
        Q1_2[] A = new Q1_2[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = new Q1_2(i * 100);
        }

        Q1_2[] B = A.clone();

        A[4].score = 550;
        System.out.println("B[4].score = " + B[4].score);


    }}

