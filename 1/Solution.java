import java.util.Scanner;

public class Solution {
    /*
     *  Дано n - число уровней. Построить треугольник из символов #.
     *  Пример для n = 4:
     *	   #
     *	  ##
     *	 ###
     *	####
     */

    static void func1(int n) {

        int c = n - 1;
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                System.out.print(c <= t ? "#" : " ");
            }
            System.out.println();
            c--;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        func1(n);
    }
}