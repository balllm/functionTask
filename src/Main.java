public class Main {
    public static void main(String[] args) {
        int number = 123;

        System.out.println("Количество четных чисел: " + findValue(number));

    }
    // функция которая считает все четные числа; например 214 овет 2 (2 и 4)
    public static int findValue(int n){
        int res = 0;
        while(n > 0){
            int newN = n % 10; // 1)newN=3; 2)newN=2 3)newN=1
            if(newN % 2 == 0){
                res ++;
            }
            n = n / 10;
        }
        return res;
    }
}
