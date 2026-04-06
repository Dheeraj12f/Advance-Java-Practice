import java.util.Scanner;

public class Q14 {

    // Method to calculate bonus based on experience
    public static float calculateBonus(float salary, short experience) {
        if (experience >= 30) {
            return salary * 0.30f;
        } else if (experience >= 20) {
            return salary * 0.20f;
        } else if (experience >= 10) {
            return salary * 0.10f;
        } else {
            return salary * 0.05f;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Section
        System.out.print("Enter employee name: ");
        String empName = sc.nextLine();

        System.out.print("Enter employee's basic salary: ");
        float salary = sc.nextFloat();

        System.out.print("Enter employee's experience (in years): ");
        short experience = sc.nextShort();

        // Allowances
        float da = 0.085f * salary;
        float ta = 0.10f * salary;
        float hra = 0.125f * salary;
        float pf = 0.15f * salary;

        // Bonus Calculation
        float bonus = calculateBonus(salary, experience);

        // Salary Calculation
        float totalSalary = salary + da + ta + hra + bonus;
        float netSalary = totalSalary - pf;

        // Output Section
        System.out.println("\n+--------------------------------------------------------------+");
        System.out.println("|                         PAYSLIP                              |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Employee Name : " + empName);
        System.out.println("| Experience    : " + experience + " years");
        System.out.println("| Basic Salary  : " + salary);
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| DA  (8.5%)  : " + da);
        System.out.println("| TA  (10%)   : " + ta);
        System.out.println("| HRA (12.5%) : " + hra);
        System.out.println("| PF  (15%)   : " + pf);
        System.out.println("| Bonus       : " + bonus);
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Total Salary : " + totalSalary);
        System.out.println("| Net Salary   : " + netSalary);
        System.out.println("+--------------------------------------------------------------+");

        sc.close();
    }
}
