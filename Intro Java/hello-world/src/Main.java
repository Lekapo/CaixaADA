import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "Lekapo";
        System.out.println("Hello " + name + "!");

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        int a = 3;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println("soma: " + soma);
        System.out.println("subtração: " + subtracao);
        System.out.println("multiplicação: " + multiplicacao);
        System.out.println("divisão: " + divisao);


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();


        boolean isWeekend = true;
        boolean isSunny = true;
        boolean goToBeach = isWeekend && isSunny;
        String response = goToBeach ?
                "Let's go to the beach!" : "We're not going to the beach.";
        System.out.println(response);


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        int nota = 75;

        if (nota >= 70) {
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed!");
        }


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();


        // A=80 B=70 C=60 D=0
        String grade;
        System.out.print("Grade: ");
        if (nota >= 80) {
            System.out.println("A");
            grade = "A";
        }
        else if (nota < 80 && nota >= 70) {
            System.out.println("B");
            grade = "B";
        }
        else if (nota < 70 && nota >= 60) {
            System.out.println("C");
            grade = "C";
        }
        else if (nota < 60 && nota >= 0) {
            System.out.println("D");
            grade = "D";
        }
        else {
            System.out.println("Invalid input!");
            grade = "";
        }

        switch (grade) {
            case "A":
            case "B":
                System.out.println("Passed!");
                break;
            case "C":
            case "D":
                System.out.println("Failed!");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        name = "Lekapo";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

         String otherName = "lekapo";
        System.out.println(name.equalsIgnoreCase(otherName));


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(today);
        Locale brasil = new Locale("pt", "BR");
        String weekday = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        System.out.println(weekday);
        String greeting;
        LocalDateTime now = LocalDateTime.now();

        if (now.getHour() < 12) {
            greeting = "bom dia";
        } else if (now.getHour() < 18) {
            greeting = "boa tarde";
        } else {
            greeting = "boa noite";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", name, weekday, greeting.toUpperCase());


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%02d x %02d = %02d  |  ", j, i, j*i);
            }
            System.out.println("");
        }


        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



        String[] letras = {"A", "B", "C", "J", "X"};

        System.out.println();
        System.out.println(Arrays.toString(letras));

        int[] moreNumbers = {9, 10, 12, 25, 2};
        int highest = moreNumbers[0];
        int lowest = moreNumbers[0];
        float mean = 0;

        for (int i = 0; i < moreNumbers.length; i++) {
            mean += (float)moreNumbers[i];
            if (moreNumbers[i] > highest) {
                highest = moreNumbers[i];
            } else if (moreNumbers[i] < lowest) {
                lowest = moreNumbers[i];
            }
        }
        mean = mean / moreNumbers.length;
        System.out.println();
        System.out.println();
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Mean: " + mean);

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println();

      greet(name);

      int result = sum(2,3);
        System.out.println(result);

    }
    public static void greet(String name) {
        System.out.printf("Hello, %s.\n", name);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}