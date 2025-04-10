import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for salary
        System.out.print("Enter your annual salary: ");
        double salary = scanner.nextDouble();
        
        double tax = calculateTax(salary);
        
        System.out.println("Your income tax is: " + tax);
        
        scanner.close();
    }
    
    public static double calculateTax(double salary) {
        double tax = 0;
        
        if (salary <= 250000) {
            tax = 0;  // No tax for income up to 2,50,000
        } else if (salary <= 500000) {
            tax = 0.05 * (salary - 250000);  // 5% tax on income between 2,50,001 - 5,00,000
        } else if (salary <= 1000000) {
            tax = 0.05 * 250000 + 0.2 * (salary - 500000);  // 20% tax on income between 5,00,001 - 10,00,000
        } else {
            tax = 0.05 * 250000 + 0.2 * 500000 + 0.3 * (salary - 1000000);  // 30% tax on income above 10,00,000
        }
        
        return tax;
    }
}
