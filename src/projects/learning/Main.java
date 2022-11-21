package projects.learning;

public class Main{
    public static void main(String[] args) {
        SumOfEvenDigits sumOfEvenDigits = new SumOfEvenDigits();
        System.out.println(sumOfEvenDigits.getEvenDigitSum(1));
        System.out.println(sumOfEvenDigits.getEvenDigitSum(2468));
        System.out.println(sumOfEvenDigits.getEvenDigitSum(123456789));
        System.out.println(sumOfEvenDigits.getEvenDigitSum(1221));
        System.out.println(sumOfEvenDigits.getEvenDigitSum(6253848));
    }
}
