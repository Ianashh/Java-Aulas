package CadastroDeJogadores;
import java.util.Scanner;



public class Jogador {
    String firstname; 
    String lastname;
    int shirt;
    int jogadores;
    int n;
    public Jogador(){
    Scanner input = new Scanner(System.in);
    System.out.println("Quantos jogadores deseja criar: ");
    jogadores = input.nextInt();

    for (n=1; n <= jogadores+1 ; n++){
    System.out.printf("\nCadastre o nome do jogador %d: ",n);
    firstname = input.next();
    System.out.printf("\nCadastre o último nome do jogador %d: ",n);
    lastname = input.next();
    System.out.printf("\nCadastre o número da camiseta do jogador %d: ",n);
    shirt = input.nextInt();
    System.out.printf("\n\nO jogador %s %s foi criado com sucesso!!\nSua camisa é a número %d", firstname,lastname,shirt);
    }
    input.close();
}
}