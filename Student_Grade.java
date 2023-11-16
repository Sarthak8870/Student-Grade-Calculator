import java.util.*;
public class Student_Grade {
    public static void main(String args[]){
        int sum=0;
        char grade;
        System.out.print("Enter the total number of subjects: ");
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks obtained in subject "+ (i+1)+ ": ");
            array[i]= sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int totalsum=100*n;
        }


        for (int i = 0; i < n; i++) {
            sum=sum+array[i];
        }

        int average=sum/n;

        if(average>=90){
            grade= 'A';
        }
        else if (average<90 && (average>80 || average>=80)) {
            grade = 'B';
        }
        else if (average<80 && (average>70 || average>=70)) {
            grade = 'C';
        }
        else if (average<70 && (average>60 || average>=60)) {
            grade='D';
        }
        else if(average<60 && (average>50 || average>=50)){
            grade='E';
        }
        else{
            grade='F';
        }


        System.out.println("total marks obtainer are: "+sum);
        System.out.println("Average Percenage: "+average+" %");
        System.out.println("Grade: "+grade);
    }
}
