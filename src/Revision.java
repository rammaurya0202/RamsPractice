import java.util.*;
public class Revision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int n=sc.nextInt();
//        if(marks>=90){
//            System.out.println(" Excellent");
//        }else if(marks>=80){
//            System.out.println("ver good");
//        } else if (marks>=70) {
//            System.out.println("good");
//        } else if (marks>=60) {
//            System.out.println("can do better");
//        } else if (marks>=50) {
//            System.out.println("average");
//        } else if (marks>=40) {
//            System.out.println("below average");
//        }
//        else{
//            System.out.println("fail");
//
//    }

        if(n>99 && n<1000) {
            System.out.println("Three digit number");
        }else{
            System.out.println("Not three digit");
        }

}
}
