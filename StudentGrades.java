import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] grades = new int[100]; // store up to 100 grades
        int count = 0;               // number of grades added
        int choice;

        do {
            System.out.println("\n--- Student Grades Menu ---");
            System.out.println("1. Add a grade");
            System.out.println("2. Calculate average");
            System.out.println("3. Find highest grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("\nEnter grade (0-100): ");
                    int grade = sc.nextInt();
                    if (grade < 0 || grade > 100) {
                        System.out.println("\nInvalid grade! Try again.");
                        continue; // skip to next menu iteration
                    }
                    grades[count++] = grade;
                    System.out.println("\nGrade added successfully to array.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("\nNo grades added yet.");
                        break;
                    }
                    int sum = 0;
                    for (int i = 0; i < count; i++) {
                        sum += grades[i];
                    }
                    double average = (double) sum / count;
                    System.out.println("\nAverage grade = " + average);
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("\nNo grades added yet.");
                        break;
                    }
                    int max = grades[0];
                    for (int i = 1; i < count; i++) {
                        if (grades[i] > max) {
                            max = grades[i];
                        }
                    }
                    System.out.println("\nHighest grade = " + max);
                    break;

                case 4:
                    System.out.println("\nExiting...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        } while(choice != 4);

        sc.close();
    }
}
