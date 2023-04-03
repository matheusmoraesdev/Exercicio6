import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
    // Declaração das variáveis
        int raio;
        double area;
        
    //Passo 1: fazer a entrada dos dados
        Scanner reader = new Scanner (System.in);
    System.out.print("Qual o raio de seu círculo ? ");
        raio = reader.nextInt();

    // Passo 2: Calcular a area
    area = 3.14 * (raio * raio);

    
    // Passo 3: exibir a resposta para o usuário

    System.out.println("A área total de seu círculo é de: " + area);
    


    }
    
}
