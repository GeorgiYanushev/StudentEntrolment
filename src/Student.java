import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int uniYear;
    private int studentID;
    private String courses="";
    private int studentDebt;
    private static int costOfCourse= 600;
    private static int idCounter=0;

    public Student(String firstName, String lastName, int uniYear) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.uniYear=uniYear;
        setStudentID();
        idCounter++;
    }
    private void setStudentID(){
        studentID=uniYear*10_000+idCounter;
    }
    public void enroll(){
        Scanner in= new Scanner(System.in);
        String course;
        while (true) {
            System.out.print("Enter course to enroll(Q to quit): ");
            course = in.nextLine();
            if(course.equals("Q"))break;
                courses += "\n" + course;
                studentDebt += costOfCourse;
        }
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("You must pay: "+ studentDebt);
    }
    public void viewDebt(){
        System.out.println("Your remaining Debt is: "+studentDebt);
    }
    public void payDebt(){
        System.out.print("Enter your payment: ");
        Scanner in= new Scanner(System.in);
        int payment= in.nextInt();
        if(studentDebt-payment<0){
            System.out.println("Payment amount is too much\nYour change is $"+(payment-studentDebt));
            studentDebt=0;
        }
        else{
            studentDebt-=payment;
            System.out.println("Thank you for your payment of $"+payment);
        }
        viewDebt();
    }
    public void showInfo(){
        System.out.println("Name: "+ firstName+" "+ lastName);
        System.out.print("Grade Level:");
        switch (uniYear){
            case 1:
                System.out.print("Freshman");
                break;
            case 2:
                System.out.print("Sophomore");
                break;
            case 3:
                System.out.print("Junior");
                break;
            case 4:
                System.out.print("Senior");
                break;
        }
        System.out.println("StudentID: "+studentID);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: "+ studentDebt);
    }
}
