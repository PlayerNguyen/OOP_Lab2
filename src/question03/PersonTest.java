package question03;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class PersonTest {

    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();

        personList.add(new Student("Johnny Dang",
                "92 Brook Stress, CA, USA",
                "DB",
                2019,
                12000f
                ));

        personList.add(new Student("Khoa Pubg",
                "345 Austria Highway, CA, USA",
                "DB",
                2012,
                4000f
        ));

        personList.add(new Staff(
                "Vuong Pham",
                "NaN",
                "HCMIU",
                12000F
        ));


        for (Person person : personList) {
            System.out.println(person);
        }

        // Create input interface
        System.out.println("");
        System.out.println("Starting insert mode...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of people to insert: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Select type of person [Student/Staff]: ");
            String mode = scanner.nextLine();
            Person person;
            if (mode.equalsIgnoreCase("Student")) {
                System.out.println("What name he/her is: ");
                String name = scanner.nextLine();

                System.out.println("Where he/her is living (address): ");
                String address = scanner.nextLine();

                System.out.println("Program studying: ");
                String program = scanner.nextLine();

                System.out.println("Year number: ");
                int year = scanner.nextInt();

                System.out.println("Fee: ");
                double fee = scanner.nextDouble();
                person = new Student(name, address, program, year, fee);
            } else {
                System.out.println("What name he/her is: ");
                String name = scanner.nextLine();

                System.out.println("Where he/her is living (address): ");
                String address = scanner.nextLine();

                System.out.println("What school he/her is teaching: ");
                String school = scanner.nextLine();

                System.out.println("Salary pay: ");
                double pay = scanner.nextDouble();

                person = new Staff(name, address, school, pay);
            }

            System.out.println(person);
            personList.add(person);
        }


    }

}
