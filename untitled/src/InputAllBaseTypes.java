import java.util.Scanner;
public class InputAllBaseTypes {
        public static void inputAllBaseTypes() {
            Scanner scanner = new Scanner(System.in);

            // Input and print byte
            System.out.print("Enter a byte value: ");
            byte byteValue = scanner.nextByte();
            System.out.println("Byte value: " + byteValue);

            // Input and print short
            System.out.print("Enter a short value: ");
            short shortValue = scanner.nextShort();
            System.out.println("Short value: " + shortValue);

            // Input and print int
            System.out.print("Enter an int value: ");
            int intValue = scanner.nextInt();
            System.out.println("Int value: " + intValue);

            // Input and print long
            System.out.print("Enter a long value: ");
            long longValue = scanner.nextLong();
            System.out.println("Long value: " + longValue);

            // Input and print float
            System.out.print("Enter a float value: ");
            float floatValue = scanner.nextFloat();
            System.out.println("Float value: " + floatValue);

            // Input and print double
            System.out.print("Enter a double value: ");
            double doubleValue = scanner.nextDouble();
            System.out.println("Double value: " + doubleValue);

            // Input and print char
            System.out.print("Enter a char value: ");
            char charValue = scanner.next().charAt(0);
            System.out.println("Char value: " + charValue);

            // Input and print boolean
            System.out.print("Enter a boolean value: ");
            boolean booleanValue = scanner.nextBoolean();
            System.out.println("Boolean value: " + booleanValue);
        }

        public static void main(String[] args) {
            inputAllBaseTypes();
        }
    }

