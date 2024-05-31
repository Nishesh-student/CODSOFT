package CodSoft;
//Task - 2 of CodSoft

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float m1,m2,m3,m4,m5,total,percentage;
        char grade;
        System.out.println("Enter marks obtained in each subject out of 100 : ");
        m1 = sc.nextFloat();
        m2 = sc.nextFloat();
        m3 = sc.nextFloat();
        m4 = sc.nextFloat();
        m5 = sc.nextFloat();

        total = m1+m2+m3+m4+m5;

        percentage = total/5;

       if (percentage<=100 && percentage>=90){
           grade = 'A';
       }
       else if (percentage<90 && percentage >=80){
           grade = 'B';
       }
       else if (percentage<80 && percentage>=70){
           grade = 'C';
       }
       else if (percentage<70 && percentage>=60){
           grade = 'D';
       }
       else if (percentage<60 && percentage>=33){
           grade = 'E';
       }
       else{
           grade = 'F';
       }
        System.out.println("|--------------------------------------");
        System.out.println("| Your Total marks obtained  : "+total);
        System.out.println("| Your average percentage is : "+percentage);
        System.out.println("| Your Grade                 : "+grade);
        System.out.println("|--------------------------------------");
    }
}
