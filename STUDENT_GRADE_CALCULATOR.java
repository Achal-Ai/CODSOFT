package CodSoft;

import java.util.*;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Marks");
        int a ,b ,c ,d,e;
        a = sc.nextInt();
        System.out.println("Enter Second Marks");
        b = sc.nextInt();
        System.out.println("Enter Third Marks");
        c = sc.nextInt();
        System.out.println("Enter Fourth Marks");
        d = sc.nextInt();
        System.out.println("Enter Fifth Marks");
        e = sc.nextInt();
//        Sum of total Marks
        int Total_Marks = a+b+c+d+e;
        System.out.println("total marks is:"+Total_Marks);
//        Percentage value
        float per = Total_Marks * 100/(500.0f);
        System.out.println("Percentage is :"+ per);
//        Grade obtained
        char grade;
        if (per >= 90) {
            System.out.println("Your Grade is A");
        } else if (per >= 80) {
            System.out.println("Your Grade is B");
        } else if (per>=70) {
            System.out.println("Your Grade is C");
        } else if (per>=60) {
            System.out.println("Your Grade is D");
        } else if (per>=50) {
            System.out.println("Your Grade is E");
        }else if(per>=36){
            System.out.println("Your Grade is F");
        }
    }
}