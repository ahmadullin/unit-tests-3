package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean isStartOrEndWith6(int[] numbers) {
        if (numbers.length == 0) {
            return false;
        }
        return numbers[0] == 6 || numbers[numbers.length - 1] == 6;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculateDiscount(double purchaseAmount) {
        if (purchaseAmount > 1000) {
            return purchaseAmount * 0.1;
        } else {
            return 0;
        }
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int sumWithout13(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
        }
        if (b != 13) {
            sum += b;
        }
        if (c != 13) {
            sum += c;
        }
        return sum;
    }

    /**
     * 1. Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
     */
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * 2. Метод проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет.
     */
    public boolean isInRange(int number) {
        return number > 25 && number < 100;
    }

}