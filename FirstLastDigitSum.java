public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int firstDigit, lastDigit = 0;
        firstDigit = number % 10;

        if(number < 10) {
            firstDigit = number;
            lastDigit = number;
            return firstDigit + lastDigit;
        }

        while(number > 0) {

            lastDigit = number;
            number = number / 10;

        }

        return firstDigit + lastDigit;
    }
}