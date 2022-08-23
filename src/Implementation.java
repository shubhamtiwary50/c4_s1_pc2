import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String[] AgeRange1= {"35","26","32","44"};
        String[] AgeRange2= {"35","26","thirty-two","44"};
        AverageAge averageage = new AverageAge();
        String s = averageage.averageAgeCalculator(AgeRange1);
        System.out.println("Average age - " + s);
        String s2= averageage.averageAgeCalculator(AgeRange2);
        System.out.println(s2);
      //  System.out.println(averageage.averageAgeCalculator(AgeRange2));
    }
}
