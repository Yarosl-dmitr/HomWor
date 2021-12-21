public class HomeWorkApp {
    public static void main(String[] args) {

        //Fruit
       printThreeWords ();

        System.out.println("/////////////////");

        if (checkSumSign(35, 86) >= 0) {
            System.out.println("Positive value");
        } else {
            System.out.println("Negative value");
        }

        System.out.println("/////////////////");
        System.out.println(printColor(120));
        System.out.println(printColor(23));

        System.out.println("/////////////////");
        System.out.println(compareNumbers(35, 86));
    }

    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static int checkSumSign (int a, int b) {
        return a + b;
    }

        public static String printColor (int value) {
            if (value <= 0) {
                return "Red";
            } else if (value > 0 && value <= 100) {
                return "Yellow";
            } else {
                return "Green";
            }
        }

        public static String compareNumbers (int a, int b) {
            if (a >= b) {
                return  "a >= b";
            } else {
                return  "a < b";
            }
        }

    }

