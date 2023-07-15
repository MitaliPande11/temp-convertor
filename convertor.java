import java.util.Scanner;
class convertor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int choice;
        double f, c;
        
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        choice = ob.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit Temperature");
                f = ob.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Temperature in Celsius is = " + c);
                break;
            case 2:
                System.out.println("Enter Celsius Temperature");
                c = ob.nextDouble();
                f = (c * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit is = " + f);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        ob.close();
    }
}

