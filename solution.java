/*
  Ödev
  Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a num: ");
        num = input.nextInt();
        
        isPrime(num, 2);
    }
    
    
    static void isPrime(int num, int i) {
        if (i == num) {
            System.out.print(num + " is a prime number.");
            return;
        } else if (num%i == 0) {
            System.out.print(num + " is not a prime number.");
            return;
        }
        
        isPrime(num, i + 1);
    }
    
}
