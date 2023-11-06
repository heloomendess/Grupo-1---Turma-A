import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner input = new Scanner(System.in);

    public static float primeiraFase(){
        Random random = new Random();

        int K = random.nextInt(10);
        int L = random.nextInt(10);
        int M = random.nextInt(10);
        int O = random.nextInt(10);
        int N = random.nextInt(10);
        int P = random.nextInt(10);
        int Q = random.nextInt(10);
        int R = random.nextInt(10);
        int S = random.nextInt(10);

        int K2 = random.nextInt(10);
        int L2 = random.nextInt(10);
        int M2 = random.nextInt(10);
        int O2 = random.nextInt(10);
        int N2 = random.nextInt(10);
        int P2 = random.nextInt(10);
        int Q2 = random.nextInt(10);
        int R2 = random.nextInt(10);
        int S2 = random.nextInt(10);
        int T2 = random.nextInt(10);
        int U2 = random.nextInt(10);
        int V2 = random.nextInt(10);

        int K3 = random.nextInt(10);
        int L3 = random.nextInt(10);
        int M3 = random.nextInt(10);
        int O3 = random.nextInt(10);
        int N3 = random.nextInt(10);
        int P3 = random.nextInt(10);
        int Q3 = random.nextInt(10);
        int R3 = random.nextInt(10);
        int S3 = random.nextInt(10);
        int T3 = random.nextInt(10);
        int U3 = random.nextInt(10);
        int V3 = random.nextInt(10);


        System.out.printf("{%d*%d+[%d(%d*%d)+%d+%d]-%d*%d}\n", K, L, M, N, O, P, Q,R,S);
        int resultadoJogador = input.nextInt();
        int resultado1 = (K*L+(M*(N*O)+P+Q)-R*S);

        System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K2, L2, M2, N2, O2, P2, Q2, R2, S2);
        int segundoResultadoJogador = input.nextInt();
        int resultado2 = (K2*L2+(M2*(N2*O2)-P2+Q2)-R2*S2);

        System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K3, L3, M3, N3, O3, P3, Q3, R3, S3);
        int terceiroResultadoJogador = input.nextInt();
        int resultado3 = (K3*L3+(M3*(N3*O3)-P3+Q3)-R3*S3);

        int resultado = resultado1 + resultado2 + resultado3;
        System.out.printf("Resultado: %d \n", resultado);
        if (resultado == resultadoJogador){
            System.out.println("Acertou!");
        }else{
            System.out.println("CORNO");
        }
        return resultado;
    }
    public static int Menu(){
        boolean retornarLoop = false;
        Scanner input = new Scanner(System.in);

        System.out.printf("Bem-vindo ao Echos of Dungeons! \n");
        System.out.printf("Escolha umA opção abaixo:");

        do {
            System.out.printf("\n1 - Instruções\n"
                    + "2 - Jogar\n"
                    + "3 - Créditos\n"
                    + "4 - Sair\n");
            byte resposta = input.nextByte();

            switch (resposta) {
                case 1:
                    System.out.println("Só joga!");
                    break;
                case 2:
                    System.out.println("Se vira para jogar");
                    espacamento();
                    jogo();
                    break;
                case 3:
                    System.out.println("PERDIDOS FC");
                    break;
                case 4:
                    System.out.println("TCHAU!");
                    retornarLoop = true;
                    break;
                default:
                    System.out.println("Tente outro código!");
            }
        }while(!retornarLoop);
        return 0;
    }

    public static int jogo(){
        float fase1 = primeiraFase();
        return 0;
    }
    public static void espacamento(){
        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int op = Menu();
    }
}
