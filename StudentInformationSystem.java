public class StudentInformationSystem {

    public static void main(String[] args) {
        String StudentName = "Muhammad Amal Irfan";
        String studentID = "S87136";

        int mark1 = 75;
        int mark2 = 90;
        int total = mark1 + mark2;

        System.out.println("Student Name: " + StudentName);
        System.out.println("Student ID: " + studentID);

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        if (total >= 160) {
            System.out.println("Result: Excellent");
        } 
        else if (total >= 120) {
            System.out.println("Result: Good");
        }
        else {
            System.out.println("Result: Need Improvement");
        }
    }
}