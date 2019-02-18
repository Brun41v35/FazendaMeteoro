package meteoros;

//Importações de biblioteca
import java.util.Scanner;

/*

PROBLEMA A RESOLVER:
 - Sua tarefa é escrever um programa que determine quantos meteoritos caíram dentro da fazenda.
  (incluindo meteoritos que caíram exatamente sobre as linhas que delimitam a fazenda).

INFORMAÇÕES:
 - Coordenadas de um retângulo que DELIMITA uma fazenda.
 - Uma lista de pontos no PLANO CARTESIANO, onde cada ponto corresponde à posição onde caiu um meteorito.
 - As linhas que delimitam a fazenda são paralelas aos eixos cartesianos.

 */
public class Meteoros {

    public static void main(String[] args) {

        //Declaração do Scanner
        Scanner teclado = new Scanner(System.in);

        //Declaração do Array
        String ListaMeteoros[] = new String[9];

        //Variaveis
        int numeroX1 = 1;
        int numeroY1 = 1;
        int numeroX2 = 1;
        int numeroY2 = 1;
        int numeroMeteoros;
        int contadorMeteoros;
        int teste;
        int coordenaX;
        int coordenaY;

        //Iniciando
        teste = 1;

        while (numeroX1 + numeroY1 + numeroX2 + numeroY2 > 0) {

            //Entrada de dados
            System.out.println("Digite o primeiro limite da Fazenda: ");
            numeroX1 = teclado.nextInt();

            System.out.println("Digite o segundo limite da Fazenda: ");
            numeroY1 = teclado.nextInt();

            System.out.println("Digite o terceiro limite da Fazenda: ");
            numeroX2 = teclado.nextInt();

            System.out.println("Digite o quarto limite da Fazenda: ");
            numeroY2 = teclado.nextInt();

            if (numeroX1 + numeroY1 + numeroX2 + numeroY2 > 0) {
                System.out.println("Agora, digite o numero de meteoritos que caiu: ");
                numeroMeteoros = teclado.nextInt();

                contadorMeteoros = 0;

                for (int i = 1; i <= numeroMeteoros; i++) {
                    System.out.println("Digite as coordenadas: " + i);
                    coordenaX = teclado.nextInt();
                    coordenaY = teclado.nextInt();

                    if (numeroX1 <= coordenaX && coordenaX <= numeroX2 && numeroY1 >= coordenaY && coordenaY >= numeroY2) {
                        contadorMeteoros++;
                    }
                }
                if (contadorMeteoros > 1) {   
                    System.out.println("Teste: " + teste + "\nCairam " + contadorMeteoros + " meteoros na fazenda.\n\n");
                } else 
                    if (contadorMeteoros == 1) {
                        System.out.println("Teste: " + teste + "\nCaiu " + contadorMeteoros + " meteoro na fazenda.\n\n");
                } else {                    
                    System.out.println("Teste: "  + teste + "\nNao caiu meteoro na fazenda.\n\n");
                }
                teste++;
            }
        }

    }

}
                