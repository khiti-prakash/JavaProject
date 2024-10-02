package Oct.ex_02102024;

class ATBStudent {
    Long mobNum;
    String address;
    String firstName;
    String lastName;
    String section;
    boolean isMale;

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Mobile Number: " + mobNum);
        System.out.println("Address: " + address);
        System.out.println("Section: " + section);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
        System.out.println();
    }
}

public class CreateATB8X {
    public static void main(String[] args) {
        // Create 5 ATBStudent objects
        ATBStudent student1 = new ATBStudent();
        student1.mobNum = 7205565941L;
        student1.address = "Bhubaneswar, Odisha";
        student1.firstName = "Khiti";
        student1.lastName = "Rout";
        student1.section = "ATB8X";
        student1.isMale = true;

        ATBStudent student2 = new ATBStudent();
        student2.mobNum = 7205565942L;
        student2.address = "Bhubaneswar, Odisha";
        student2.firstName = "Rahul";
        student2.lastName = "Mehta";
        student2.section = "ATB8X";
        student2.isMale = true;

        ATBStudent student3 = new ATBStudent();
        student3.mobNum = 7205565943L;
        student3.address = "Bhubaneswar, Odisha";
        student3.firstName = "Priya";
        student3.lastName = "Sen";
        student3.section = "ATB8X";
        student3.isMale = false;

        ATBStudent student4 = new ATBStudent();
        student4.mobNum = 7205565944L;
        student4.address = "Bhubaneswar, Odisha";
        student4.firstName = "Aditi";
        student4.lastName = "Rout";
        student4.section = "ATB8X";
        student4.isMale = false;

        ATBStudent student5 = new ATBStudent();
        student5.mobNum = 7205565945L;
        student5.address = "Bhubaneswar, Odisha";
        student5.firstName = "Nikhil";
        student5.lastName = "Das";
        student5.section = "ATB8X";
        student5.isMale = true;

        // Display details of each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
    }
}