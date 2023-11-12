import java.util.Scanner;

public class Konwersja
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Zmienne
        int integerVariable;
        double doubleVariable;
        char charVariable;
        boolean booleanVariable;

        // Wprowadzenie danych
        System.out.print("Podaj wartość dla int: ");
        integerVariable = scanner.nextInt();

        System.out.print("Podaj wartość dla double: ");
        doubleVariable = scanner.nextDouble();

        System.out.print("Podaj wartość dla char: ");
        charVariable = scanner.next().charAt(0);

        System.out.print("Podaj wartość true lub false: ");
        booleanVariable = scanner.nextBoolean();

        // Konwersja
        double convertedFromInt = (double) integerVariable;
        int convertedFromDouble = (int) doubleVariable;
        int convertedFromChar = (int) charVariable;
        String convertedFromBoolean = Boolean.toString(booleanVariable);

        // Wyniki
        System.out.println("1. Double na int: " + convertedFromInt);
        System.out.println("2. Int na double: " + convertedFromDouble);
        System.out.println("3. Char na int: " + convertedFromChar);
        System.out.println("4. Boolean na String: " + convertedFromBoolean);
    }
}