package projects.learning;

public class SumOfEvenDigits {
    public static int getEvenDigitSum(int number){
        int sumOfEvenDigits = 0;
        if(number < 0){
            return -1;
        }
        if(number < 10 && number % 2 == 0){
            sumOfEvenDigits = number;
        }else{
            while(number >= 10){
                if(number % 2 == 0){
                    sumOfEvenDigits += number % 10;
                }
                number /= 10;
            }
            if(number % 2 == 0){
                sumOfEvenDigits += number % 10;
            }
        }
        return sumOfEvenDigits;
    }
}
