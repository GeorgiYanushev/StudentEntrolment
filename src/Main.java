import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb;
        int year;
        String firstName;
        String lastName;
        System.out.print("How many students do you wish to enter: ");
        Scanner in= new Scanner(System.in);
        numb=Integer.parseInt(in.nextLine());
        Student[] students= new Student[numb];
        for (int i=0;i<numb;i++){
            System.out.print("Please Enter\nFirst Name:");
            firstName=in.nextLine();
            System.out.print("Last Name:");
            lastName=in.nextLine();
            System.out.print("1. Freshman\n2.Sophomore\n3.Junior\n4.Senior\nChose student grade level: ");
            year=Integer.parseInt(in.nextLine());
            students[i]=new Student(firstName,lastName,year);
            students[i].enroll();
        }
        for (int i=0;i<numb;i++){
            students[i].showInfo();
        }
        students[0].payDebt();
    }
}