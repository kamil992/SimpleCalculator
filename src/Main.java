import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String login = "user";  //required login!!!
        String password = "user123"; //required password!!!
        double a;
        double b;
        String binary;
        int number;
        int base, bound;
        double[] nums;

        String menu;


        Calculator calc = new Calculator();
        System.out.println("The program is a simple calculator.");
        System.out.println("----------------------------------------------------");

        System.out.println("Enter valid login:");
        String validLogin = scanner.nextLine();

        System.out.println("Enter valid password:");
        String validPassword = scanner.nextLine();

        if (validLogin.equals(login) && validPassword.equals(password)) {
            System.out.println("Welcome " + login + " in Calculator.");

            do {
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.println("Select a function from the list:");
                System.out.println("[1] Add numbers [+]\n[2] Substract numbers [-]\n[3] Multiply numbers [*]\n" +
                        "[4] Divide two numbers [/]\n[5] Sqrt [sqrt]\n[6] Power [pow]\n[7] Convert to binary number [Bin]\n" +
                        "[8] Convert binary to number [Dec]\n[9] Calculate a median of numbers.\n" +
                        "[10] Average of numbers\n------------------------------------\n[0] Exit");
                menu = scanner.next();

                switch (menu) {

                    case "1":
                        System.out.print("Enter quantity of numbers: ");
                        bound = scanner.nextInt();
                        System.out.println("Enter the numbers: ");
                        nums = new double[bound];
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = scanner.nextDouble();
                        }
                        System.out.print("Result= ");
                        Calculator.addNumbers(nums);
                        break;
                    case "2":
                        System.out.print("Enter quantity of numbers: ");
                        bound = scanner.nextInt();
                        System.out.println("Enter the numbers: ");
                        nums = new double[bound];
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = scanner.nextDouble();
                        }
                        System.out.print("Result= ");
                        Calculator.substractNumbers(nums);
                        break;
                    case "3":
                        System.out.print("Enter quantity of numbers: ");
                        bound = scanner.nextInt();
                        System.out.println("Enter the numbers: ");
                        nums = new double[bound];
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = scanner.nextDouble();
                        }
                        System.out.print("Result= ");
                        Calculator.multiplyNumbers(nums);
                        break;
                    case "4":
                        System.out.println("Enter the number: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter the divider: ");
                        b = scanner.nextInt();
                        System.out.print("Result= ");
                        Calculator.divideNumbers(a,b);
                        System.out.println();
                        break;
                    case "5":
                        System.out.println("Enter the number: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter the rank of radical");
                        b = scanner.nextInt();
                        System.out.print("Result= ");
                        Calculator.sqrt(a,b);
                        System.out.println();
                    break;
                    case "6":
                        System.out.println("Enter the number: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter power: ");
                        b = scanner.nextDouble();
                        System.out.print("Result= ");
                        Calculator.power(a,b);
                        break;
                    case "7":
                        System.out.println("Enter the integer number");
                        number = scanner.nextInt();
                        System.out.println("Enter system:");
                        base = scanner.nextInt();
                        System.out.print("Result= ");
                        Calculator.convertToBinary(number,base);
                        break;
                    case "8":
                        System.out.println("Enter binary system number:");
                        binary = scanner.next();
                        System.out.println("Enter system:");
                        base = scanner.nextInt();
                        System.out.print("Result= ");
                        Calculator.convertBinaryToDecimal(binary,base);
                        break;
                    case "9":
                        System.out.print("Enter quantity of numbers: ");
                        bound = scanner.nextInt();
                        System.out.println("Enter the numbers: ");
                        nums = new double[bound];
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = scanner.nextDouble();
                        }
                        System.out.print("Result= ");
                        Calculator.median(nums);
                        break;
                    case "10":
                        System.out.print("Enter quantity of numbers: ");
                        bound = scanner.nextInt();
                        System.out.println("Enter the numbers: ");
                        nums = new double[bound];
                        for (int i = 0; i < nums.length; i++) {
                            nums[i] = scanner.nextDouble();
                        }
                        System.out.print("Result= ");
                        Calculator.calculateAverage(nums);
                        break;

                    case "0":
                        System.out.println("Program is closed.");
                        break;

                    default:
                        System.out.println("Incorrect data.");
                        break;
                }
            } while (!menu.equals("0"));
        }
        else
            System.out.println("You entered incorrect data.");
    }
}
