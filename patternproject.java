import javax.swing.*; 

public class patternproject { 

    void pattern1_Square() {
        System.out.println("---------- Square Pattern ----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    void pattern2_HalfPyramid() {
        System.out.println("---------- Half Pyramid Pattern ----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    void pattern3_SquareStars() {
        System.out.println("---------- Full Square Star Pattern ----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    void pattern4_InvertedHalfPyramid() {
        System.out.println("---------- Inverted Half Pyramid ----------");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    void pattern5_RightAlignedHalfPyramid() {
        System.out.println("---------- Right-Aligned Half Pyramid ----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }

    void pattern6_TrianglePyramid() {
        System.out.println("---------- Triangle Pyramid ----------");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }

    void pattern7_Diamond() {
        System.out.println("---------- Diamond Pattern ----------");
        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) { 
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern8_H() {
        System.out.println("---------- 'H' Pattern ----------");
        int n = 7; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }

    void pattern9_X() {
        System.out.println("---------- 'X' Pattern ----------");
        int n = 7; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }

    void pattern10_S() {
        System.out.println("---------- 'S' Pattern ----------");
        int n = 7; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0) || 
                    (i == n / 2 && j > 0 && j < n - 1) || 
                    (i == n - 1 && j < n - 1) ||
                    (i < n / 2 && j == 0) || 
                    (i > n / 2 && j == n - 1)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
    }

    void pattern11_ChristmasTree() {
        System.out.println("---------- Christmas Tree Pattern ----------");
        int height = 5; 
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < height - 1; j++) { 
                System.out.print(" ");
            }
            System.out.println("*"); 
        }
    }

    void pattern12_AlphabetPyramid() {
        System.out.println("---------- Alphabet Pyramid Pattern ----------");
        for (int i = 1; i <= 5; i++) {
            char ch = 'A'; 
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(ch); 
                if (k < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println(); 
        }
    }

    void pattern13_HollowSquare() {
        System.out.println("---------- Hollow Square ----------");
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void pattern14_HollowHalfPyramid() {
        System.out.println("---------- Hollow Half Pyramid ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void pattern15_InvertedTrianglePyramid() {
        System.out.println("---------- Inverted Triangle Pyramid ----------");
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern16_RightTriangleNumbers() {
        System.out.println("---------- Right Triangle with Numbers ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void pattern17_HalfPyramidNumbers() {
        System.out.println("---------- Half Pyramid with Numbers ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern18_PascalsTriangle() {
        System.out.println("---------- Pascal's Triangle ----------");
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    void pattern19_ButterflyPattern() {
        System.out.println("---------- Butterfly Pattern ----------");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern20_Rhombus() {
        System.out.println("---------- Rhombus Pattern ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern21_HollowRhombus() {
        System.out.println("---------- Hollow Rhombus ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows; k++) {
                if (i == 1 || i == rows || k == 1 || k == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void pattern22_HollowDiamond() {
        System.out.println("---------- Hollow Diamond ----------");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern23_NumberTriangle() {
        System.out.println("---------- Number Triangle ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern24_RightTriangleAlphabet() {
        System.out.println("---------- Right Triangle with Alphabet ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    void pattern25_Sandglass() {
        System.out.println("---------- Sandglass Pattern ----------");
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern26_PalindromicNumberPyramid() {
        System.out.println("---------- Palindromic Number Pyramid ----------");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void pattern27_RightArrow() {
        System.out.println("---------- Right Arrow Pattern ----------");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Fix 1: Change the class name to projectpattern
        projectpattern patternGenerator = new projectpattern();

        String choice; 
        do {
            choice = JOptionPane.showInputDialog(
                "Pattern Generator\n\n" +
                "1. Square Pattern (X)\n" +
                "2. Half Pyramid\n" +
                "3. Full Square Star\n" +
                "4. Inverted Half Pyramid\n" +
                "5. Right-Aligned Half Pyramid\n" +
                "6. Triangle Pyramid\n" +
                "7. Diamond Pattern\n" +
                "8. 'H' Pattern\n" +
                "9. 'X' Pattern\n" +
                "10. 'S' Pattern\n" +
                "11. Christmas Tree\n" +
                "12. Alphabet Pyramid\n" +
                "13. Hollow Square\n" +
                "14. Hollow Half Pyramid\n" +
                "15. Inverted Triangle Pyramid\n" +
                "16. Right Triangle with Numbers\n" +
                "17. Half Pyramid with Numbers\n" +
                "18. Pascal's Triangle\n" +
                "19. Butterfly Pattern\n" +
                "20. Rhombus\n" +
                "21. Hollow Rhombus\n" +
                "22. Hollow Diamond\n" +
                "23. Number Triangle\n" +
                "24. Right Triangle with Alphabet\n" +
                "25. Sandglass Pattern\n" +
                "26. Palindromic Number Pyramid\n" +
                "27. Right Arrow Pattern\n\n" +
                "Enter your choice (1-27) or type 'exit' to quit:"
            );

            // Fix 2: Check for null first, which is returned when the user clicks Cancel or closes the dialog
            if (choice == null || choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Pattern Generator. Goodbye!");
                break; // Exit the loop
            }

            switch (choice) {
                case "1":
                    patternGenerator.pattern1_Square();
                    break;
                case "2":
                    patternGenerator.pattern2_HalfPyramid();
                    break;
                case "3":
                    patternGenerator.pattern3_SquareStars();
                    break;
                case "4":
                    patternGenerator.pattern4_InvertedHalfPyramid();
                    break;
                case "5":
                    patternGenerator.pattern5_RightAlignedHalfPyramid();
                    break;
                case "6":
                    patternGenerator.pattern6_TrianglePyramid();
                    break;
                case "7":
                    patternGenerator.pattern7_Diamond();
                    break;
                case "8":
                    patternGenerator.pattern8_H();
                    break;
                case "9":
                    patternGenerator.pattern9_X();
                    break;
                case "10":
                    patternGenerator.pattern10_S();
                    break;
                case "11":
                    patternGenerator.pattern11_ChristmasTree();
                    break;
                case "12":
                    patternGenerator.pattern12_AlphabetPyramid();
                    break;
                case "13":
                    patternGenerator.pattern13_HollowSquare();
                    break;
                case "14":
                    patternGenerator.pattern14_HollowHalfPyramid();
                    break;
                case "15":
                    patternGenerator.pattern15_InvertedTrianglePyramid();
                    break;
                case "16":
                    patternGenerator.pattern16_RightTriangleNumbers();
                    break;
                case "17":
                    patternGenerator.pattern17_HalfPyramidNumbers();
                    break;
                case "18":
                    patternGenerator.pattern18_PascalsTriangle();
                    break;
                case "19":
                    patternGenerator.pattern19_ButterflyPattern();
                    break;
                case "20":
                    patternGenerator.pattern20_Rhombus();
                    break;
                case "21":
                    patternGenerator.pattern21_HollowRhombus();
                    break;
                case "22":
                    patternGenerator.pattern22_HollowDiamond();
                    break;
                case "23":  
                    patternGenerator.pattern23_NumberTriangle();
                    break;
                case "24":
                    patternGenerator.pattern24_RightTriangleAlphabet();
                    break;
                case "25":
                    patternGenerator.pattern25_Sandglass();
                    break;
                case "26":
                    patternGenerator.pattern26_PalindromicNumberPyramid();
                    break;
                case "27":
                    patternGenerator.pattern27_RightArrow();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 27, or 'exit'.");
            }
            System.out.println("\n"); 

        } while (true); 
    }
}