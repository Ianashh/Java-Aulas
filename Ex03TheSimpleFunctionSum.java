
public class Ex03TheSimpleFunctionSum {

public static void main(String[] args) {
    sum(7,5);
    sum(3,12);
    sum(5,55);
    sum(57,43);
    sum2(7,5);
    sum2(3,12);
    sum2(5,55);
    sum2(57,43);
}
static void sum (int number1, int number2) {
    System.out.println("\nThe sum of "+ number1 +" with " + number2 + " is equal to "+ (number1+number2) +" !!");
    }
static void sum2 (int number1, int number2) {
    System.out.println("\nA soma dos números "+ number1 +" e " + number2 + " é igual a "+ (number1+number2) +" !!");
    }
}