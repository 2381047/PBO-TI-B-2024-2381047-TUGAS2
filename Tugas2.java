import java.util.Scanner;

public class Tugas2 {

        // Method to calculate the area of a square
        public static double calculateSquareArea(double side) {
            return side * side;
        }

        // Method to calculate the perimeter of square
        public static double calculateSquarePerimeter(double side) {
            return 4 * side;
        }

        // Method to calculate the area of a rectangle
        public static double calculateRectangleArea(double length, double width) {
            return length * width;
        }

        // Method to calculate the perimeter of a rectangle
        public static double calculateRectanglePerimeter(double length, double width) {
            return 2 * (length + width);
        }

        // Method to calculate the area of circle
        public static double calculateCircleArea(double radius) {
            return Math.PI * radius * radius;
        }

        // Method to calculate the circumference of a circle
        public static double calculateCircleCircumference(double radius) {
            return 2 * Math.PI * radius;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Pilih bangun datar yang ingin dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("Masukkan pilihan Anda (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // square
                    System.out.println("Masukkan panjang sisi persegi: ");
                    double side = scanner.nextDouble();
                    System.out.println("Luas Persegi: " + calculateSquareArea(side));
                    System.out.println("Keliling Persegi: " + calculateSquarePerimeter(side));
                    break;

                case 2: // Rectangle
                    System.out.println("Masukkan panjang persegi panjang: ");
                    double length = scanner.nextDouble();
                    System.out.println("Masukkan lebar persegi panjang: ");
                    double width = scanner.nextDouble();
                    System.out.println("Luas Persegi Panjang: " + calculateRectangleArea(length, width));
                    System.out.println("Keliling Persegi Panjang: " + calculateRectanglePerimeter(length, width));
                    break;

                case 3: // Circle
                    System.out.println("Masukkan jari-jari lingkaran: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Luas Lingkaran: " + calculateCircleArea(radius));
                    System.out.println("Keliling Lingkaran: " + calculateCircleCircumference(radius));
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            scanner.close();
        }
    }
