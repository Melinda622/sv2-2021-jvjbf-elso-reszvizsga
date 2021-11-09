package numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number) {
        int sum = 0;
        boolean result = false;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();

        System.out.println(perfectNumbers.isPerfectNumber(6)); //true
        System.out.println(perfectNumbers.isPerfectNumber(8128)); //true
        System.out.println(perfectNumbers.isPerfectNumber(7246)); //false
        System.out.println(perfectNumbers.isPerfectNumber(9)); //false
    }
}
