package CadastroDeJogadores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Jogador {
    public int n;
    public int c;
    public List<String> firstname = new ArrayList<>(); 
    public List<String> lastname = new ArrayList<>();
    public int shirt;
    public int jogadores;
    private String Liga = "UEFA Champions League";
    private String Sexo = "Masculino";

    public Jogador(){
    Scanner input = new Scanner(System.in);
    System.out.print("Quantos jogadores deseja criar: ");
    jogadores = input.nextInt();

    for (n=1; n < jogadores+1 ; n++){
    System.out.printf("\nCadastre o nome do jogador 0%d: ",n);
    firstname.add(input.next().trim().toUpperCase());
    System.out.printf("\nCadastre o último nome do jogador 0%d: ",n);
    lastname.add(input.next().trim().toUpperCase());
    lastname.addAll(Arrays.asList());
    System.out.printf("\nCadastre o número da camisa do jogador 0%d: ",n);
    shirt = input.nextInt();
    System.out.printf("\n\nO jogador %s %s foi criado com sucesso!!\nSua camisa é a número %d.\n\n", firstname.get(n-1),lastname.get(n-1),shirt);
    }
    input.close();
    }
    public void status(){
        for (c=0; c < jogadores ; c++){
        System.out.printf("\nNome do jogador: %s %s", firstname.get(c), this.lastname);
        System.out.printf("\nNúmero da camisa do jogador: %d", this.shirt);
        System.out.printf("\nNome da Liga do jogador: %s", this.Liga);
        System.out.printf("\nLiga do sexo: %s", this.Sexo);
        }
}
}