import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    private static final String LOGIN = "user";
    private static final String PASSWORD = "user123";
    String result;

    public static void main(String[] args) {
        Main main = new Main();


        System.out.println("The program is a simple calculator.");
        System.out.println("----------------------------------------------------");

            main.enterThePassword();
            main.showOptions();

        }



    public boolean enterThePassword(){
        System.out.println("Enter valid login:");
        String validLogin = scanner.nextLine();
        System.out.println("Enter valid password:");
        String validPassword = scanner.nextLine();
        if(validLogin.equals(LOGIN) && validPassword.equals(PASSWORD)){
            showMenu();
            return true;
        }
        else{
            return false;
        }
    }
    public void showMenu(){
        System.out.println("Select a function from the list:\n[1] Add numbers [+]\n[2] Substract numbers [-]\n[3] Multiply numbers [*]\n" +
                "[4] Divide two numbers [/]\n[5] Sqrt [sqrt]\n[6] Power [pow]\n[7] Convert to binary number [Bin]\n" +
                "[8] Convert binary to number [Dec]\n[9] Calculate a median of numbers.\n" +
                "[10] Average of numbers\n------------------------------------\n[0] Exit");
    }

    public void showOptions(){
        double a;
        double b;
        String binary;
        int number;
        int base, bound;
        double[] nums;

        String menu;
        do {
            System.out.println();
            System.out.println("----------------------------------------------------");
            showMenu();
            menu = scanner.next();
            String result;
            switch (menu) {

                case "1":
                    System.out.print("Enter quantity of numbers: ");
                    bound = scanner.nextInt();
                    System.out.println("Enter the numbers: ");
                    nums = new double[bound];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextDouble();
                    }
                    result = calculator.addNumbers(nums);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Summary result = "+result+"\r\n");
                    break;
                case "2":
                    System.out.print("Enter quantity of numbers: ");
                    bound = scanner.nextInt();
                    System.out.println("Enter the numbers: ");
                    nums = new double[bound];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextDouble();
                    }
                    result = calculator.substractNumbers(nums);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Substract result = "+result+"\r\n");
                    break;
                case "3":
                    System.out.print("Enter quantity of numbers: ");
                    bound = scanner.nextInt();
                    System.out.println("Enter the numbers: ");
                    nums = new double[bound];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextDouble();
                    }
                    result = calculator.multiplyNumbers(nums);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Multiply result = "+result+"\r\n");
                    break;
                case "4":
                    System.out.println("Enter the number: ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the divider: ");
                    b = scanner.nextInt();
                    result = calculator.divideNumbers(a,b);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Divide result = "+result+"\r\n");
                    break;
                case "5":
                    System.out.println("Enter the number: ");
                    a = scanner.nextDouble();
                    System.out.println("Enter the rank of radical");
                    b = scanner.nextInt();
                    result = calculator.sqrt(a,b);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Root result = "+result+"\r\n");
                    break;
                case "6":
                    System.out.println("Enter the number: ");
                    a = scanner.nextDouble();
                    System.out.println("Enter power: ");
                    b = scanner.nextDouble();
                    result = calculator.power(a,b);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Power result = "+result+"\r\n");
                    break;
                case "7":
                    System.out.println("Enter the integer number");
                    number = scanner.nextInt();
                    System.out.println("Enter system:");
                    base = scanner.nextInt();
                    result = calculator.convertToBinary(number,base);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Binary result = "+result+"\r\n");
                    break;
                case "8":
                    System.out.println("Enter binary system number:");
                    binary = scanner.next();
                    System.out.println("Enter system:");
                    base = scanner.nextInt();
                    result = calculator.convertBinaryToDecimal(binary,base);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Convert result = "+result+"\r\n");
                    break;
                case "9":
                    System.out.print("Enter quantity of numbers: ");
                    bound = scanner.nextInt();
                    System.out.println("Enter the numbers: ");
                    nums = new double[bound];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextDouble();
                    }
                    result = calculator.median(nums);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Median result = "+result+"\r\n");
                    break;
                case "10":
                    System.out.print("Enter quantity of numbers: ");
                    bound = scanner.nextInt();
                    System.out.println("Enter the numbers: ");
                    nums = new double[bound];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = scanner.nextDouble();
                    }
                    result =calculator.calculateAverage(nums);
                    System.out.println("Result = "+ result);
                    saveTextInFile("Average result = "+result+"\r\n");
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


    public static void saveTextInFile(String txt) {
        File file = new File("C:\\Users\\Kamil\\IdeaProjects\\Calculator\\Calculator Results\\calc.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file,true);// append: true, czyli zamiast nadpisywać dołącza do istniejącego
            fileOutputStream.write(txt.getBytes());// do pliku możemy zapisac tlyko bajty

            fileOutputStream.flush();//zamyka strumień przy zapisie danych do pliku
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.flush();//zamyka strumień przy zapisie danych do pliku
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
