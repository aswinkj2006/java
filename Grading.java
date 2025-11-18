class Grading {

    public static void main(String[] args) {

        int marks = Integer.parseInt(args[0]);

	if ((marks > 100) || (marks<0)) System.out.println(" Value ERROR ! ");
        else if (marks >= 90) System.out.println("Grade A");
        else if (marks >= 75) System.out.println("Grade B");
        else if (marks >= 50) System.out.println("Grade C");
        else System.out.println("Fail");

    }
}
