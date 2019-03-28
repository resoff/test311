import java.util.Scanner;

public class Solution {
	static Object object;
	/*
	 * сделать обьект и выполнять его из отдельного потока
	 * лябмда функция
	 * обьект
	 */
	public static void main(String[] args) {
		
		object = new Object();
	}
   
}

class MyThread extends Thread {
    public void run() {
    	Object object = new Object();
    }
}

class Object 
{
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
	
	public Object() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        func1(n);
    }
}

