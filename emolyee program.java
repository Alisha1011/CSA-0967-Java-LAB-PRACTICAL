import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade;
        double salary, bonus, total;

        System.out.print("Enter the grade of the employee: ");
        grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        salary = scanner.nextDouble();

        if (grade == 'A') {
            bonus = salary * 0.05;
            total = salary + bonus;
        } else if (grade == 'B') {
            bonus = salary * 0.1;
            total = salary + bonus;
        } else {
            System.out.println("Invalid grade. Only A or B are allowed");
            return;
        }

        if (salary < 10000) {
            bonus += salary * 0.02;
            total = salary + bonus;
        }

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total to be paid: " + total);
    }
}
