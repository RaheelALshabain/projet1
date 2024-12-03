import java.util.Scanner;
public class Q7 {



        int id;
        String name;
        String major;

        public Q7(int id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMajor(String major) {
            this.major = major;
        }
        public String toString(){
            return "student("+"name:"+name+"id:"+id+"major"+major+")";
        }
        public static void main(String[] args) {


            Scanner in= new Scanner(System.in);
            System.out.println("enter your id,name,major 3 times:");
            Q7 arr[]= new Q7[4];
            for(int i=0; i<arr.length;i++){
                arr[i]=new Q7(in.nextInt(),in.next(),in.next());
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

        }

    }

