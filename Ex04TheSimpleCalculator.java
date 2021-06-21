import java.util.Scanner;

public class Ex04TheSimpleCalculator{

public static void main(String[] args){
System.out.printf("Hello, World!!%nThis is a simple new calculation program that I created in my Java labs. %nI hope you like it !!\n\n");
System.out.printf("Olá Mundo!!%nEste é um novo programa de cálculo simples que criei em meus laboratórios de Java. %nEspero que você goste!!\n\n");
    
    Scanner keyboard = new Scanner(System.in);
    int languages = 0;
    double n1 = 0;
    double n2 = 0;
    String calc = "";
    
    System.out.print("If you want continue in English, please, press 1 \n\nSe prefere continuar em português, por favor, digite 2: ");
    languages = keyboard.nextInt();
    
        if (languages == 1){
            System.out.print("Press the first number to calculate: ");
            n1  = keyboard.nextInt();
            System.out.print("Press the second number to calculate: ");
            n2  = keyboard.nextInt();
            System.out.print("[+] For Sum Press +\n[-] For Minus Press -\n[*] For Multiply Press *\n[/] For Divide Press /\n[f] For finish this program press f \n---> : ");
            calc = keyboard.next();
            
            }
        
            if (calc.equals("+")){
            System.out.println("\nThe sum of number "+ n1 +" with number " + n2 + " is equal to "+ (n1+n2) +" !!\n");
            }
            else if (calc.equals("-")){
            System.out.println("\nThe subtraction of number "+ n1 +" by number " + n2 + " is equal to "+ (n1-n2) +" !!\n");
            }
            else if (calc.equals("*")){
                System.out.println("\nThe multiply of number "+ n1 +" by number " + n2 + " is equal to "+ (n1*n2) +" !!\n");
            }
            else if (calc.equals("/")){
            System.out.println("\nThe division of number "+ n1 +" by number " + n2 + " is equal to "+ (n1/n2) +" !!\n");
            }
            else if ((calc.equals("f")) || (calc.equals("F"))){
                System.out.print("The program has benn finalized!!\n");
            }
        
        else if (languages == 2){
            System.out.print("Digite o primeiro número: ");
            n1  = keyboard.nextInt();
            System.out.print("Digite o primeiro número: ");
            n2  = keyboard.nextInt();
            System.out.print("[+] Para Somar digite +\n[-] Para Subtrair digite -\n[*] Para Multiplicar digite *\n[/] Para dividir digite /\n[f] Para Finalizar o programa digite f \n---> :");
            calc = keyboard.next();        
            if (calc.equals("+")){
                System.out.println("\nA soma dos números "+ n1 +" e " + n2 + " é igual a "+ (n1+n2) +" !!\n");
                }
            else if (calc.equals("-")){
                System.out.println("\nA subtração do número "+ n1 +" por " + n2 + " é igual a "+ (n1-n2) +" !!\n");
                }
            else if (calc.equals("*")){
                System.out.println("\nA multiplicação do número "+ n1 +" por " + n2 + " é igual a "+ (n1*n2) +" !!\n");
                }
            else if (calc.equals("/")){
                System.out.println("\nA divisão do número "+ n1 +" por " + n2 + " é igual a "+ (n1/n2) +" !!\n");
                }
            else if ((calc.equals("f")) || (calc.equals("F"))) {
                System.out.print("O programa foi finalizado!!");
                }
                }
    
keyboard.close();    
System.out.print("The END\n\n");
System.out.print("FIM\n\n");
}
}