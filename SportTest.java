// import scanner
import java.util.Scanner;
public class SportTest {


    public static void main(String[] args) {

        // create scanner object
        Scanner in = new Scanner(System.in);

        // introduce user to progra,
        System.out.println("\n-- Welcome to Nick's athletic information system! --\n\n");

        // ask user to input data or quit
        System.out.print("Press 1 to enter a student's information and 0 to quit: ");
        int control = in.nextInt();
        in.nextLine(); // input won't work unless this is here.

        // loop
        while(control == 1) {

            // get user input and loop until done
            System.out.print("\nEnter the student's name: ");
            String name = in.nextLine();

            System.out.print("Enter the student's sport: ");
            String sport = in.nextLine().toLowerCase();

            System.out.print("Enter the student's age: ");
            int age = in.nextInt();
            in.nextLine();
            
            System.out.print("Enter the student's grade (Sophomore, Junior, etc.): ");
            String grade = in.nextLine();

            System.out.print("Enter the student's school: ");
            String school = in.nextLine();

            System.out.print("Enter the student's sport position: ");
            String position = in.nextLine();

            System.out.print("Enter the student's major: ");
            String major = in.nextLine();

            System.out.print("Enter the student's school ID (six numbers): ");
            int id = in.nextInt();

            // assign the variables to the constructor
            Sport student = new Sport(name, sport, grade, school, position, major, age, id);

            // final output.
            // if statements to display different outputs for different inputs.
            System.out.printf("\nStudent name:          %s\n", student.getName());

            // if user enters a grade a special message returns
            if(grade.equals("senior") || grade.equals("Senior")) {
               System.out.printf("Student grade:         %s (WOOH SENIOR!)\n", student.getGrade()); 
            } else if(grade.equals("Junior") || grade.equals("junior")) {
                System.out.printf("Student grade:         %s (Nice, junior!!)\n", student.getGrade());
            } else if(grade.equals("Sophomore") || grade.equals("sophomore")) {
                System.out.printf("Student grade:         %s (eh sophomore)\n", student.getGrade());
            } else if(grade.equals("Freshman") || grade.equals("freshman")) {
                System.out.printf("Student grade:         %s (I'm sorry you're a freshman)\n", student.getGrade());
            } else {
                System.out.printf("Student grade:         %s\n", student.getGrade());
            }

            // if age is 21 or over display message, under 21 display different message
            if(age >= 21) {
                System.out.printf("Student age            %d (You can drink!)\n", student.getAge());
            } else if(age < 20){
                System.out.printf("Student age            %d (You can't drink.)\n", student.getAge());
            } else {
                System.out.println("No number entered.");
            }
            System.out.printf("Student school:        %s\n", student.getSchool());
            
            // if user enteres a specified sport 
            if(sport.equals("football")) {
               System.out.printf("Student sport:         %s (FOOTBALL SEASON)\n", student.getSport()); 
            } else if(sport.equals("soccer")) {
                System.out.printf("Student sport:         %s (ew soccer)\n", student.getSport()); 
            } else if(sport.equals("track") || sport.equals("cross country") || sport.equals("track and field")) {
                System.out.printf("Student sport:         %s (greatest sport)\n", student.getSport()); 
            } else if(sport.equals("tennis")) {
                System.out.printf("Student sport:         %s (Ayyy tennis!)\n", student.getSport()); 
            } else {
                System.out.printf("Student sport:         %s\n", student.getSport()); 
            }
            System.out.printf("Student position:      %s\n", student.getPosition());
            System.out.printf("Student ID:            %d\n", student.getSchoolIdNumber());


            // ask to repeat loop
            System.out.println("\nPress 1 to enter another student's information and 0 to quit.\n");
            control = in.nextInt();
            in.nextLine();
        }
        // if quit, display goodbye message
        System.out.println("\n\n        Thank you for using my program :)\n");
    } // end main function
} // end class
