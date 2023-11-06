import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner input = new Scanner(System.in);

    /**
     * @return
     */
    public static float primeiraFase() throws InterruptedException {

        System.out.println("Após sair da caverna, você se depara em uma cela fechada.\r\n" + 
                "A parede quebrada na qual você entrou tinha um formato peculiar,  como se uma \n" +
                "pessoa tivesse fugido do local, quebrando a parede. \r\n");

        System.out.println("A sua frente há uma porta trancada.\r\n" +
                "Ao se aproximar você percebe que tem um cadeado com alguns números nele.\r\n" +
                "Tem uma sequência de três fileiras de números do 0 ao 9.\r\n" +
                "Deseja abrir o cadeado:\r\n" +
                "1- Tentar Abrir?\r\n" +
                "2- Voltar\r\n");      
        byte opcao = input.nextByte();
        int resultado = 0;

        switch (opcao) {
            case 1:
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
            
        resultado = resultado1 + resultado2;
        System.out.printf("Resultado: %d \n", resultado);
        if (resultado == resultadoJogador){
            System.out.println("Acertou!");
        }else{
            System.out.println("CORNO");
        }
        
        break;
            case 2: 
                primeiraFase();
            break;        
        }
        return resultado;
        
        }
        
        public static void segundaFase(){
            Random random = new Random();
            int a1 = random.nextInt(5)+5;
            int a2 = random.nextInt(10);
            int a3 = random.nextInt(3)+1;
            int a4 = random.nextInt(20);
            int a5 = random.nextInt(5);
            int a6 = random.nextInt(5);
            int a7 = random.nextInt(5);
            int a8 = random.nextInt(5);
        
            System.out.printf("Equaçao de 1° grau: \n%dx-%d = %dx+%d ", a1, a2, a3, a4);
            System.out.print("Resposta: ");
            float resposta = input.nextFloat();
            float res1 = (a1 - a3 );
            float res2 = (a4 + a2 );
            float res3 = (res2 / res1);
        
            if (res3 == resposta){
              System.out.println("parabens voce acertou.");
            }else{
              System.out.println("resposta errada. \na resposta certa era : "+res3);
            }
          }

        
    public static int Menu() throws InterruptedException{
        boolean retornarLoop = false;
        Scanner input = new Scanner(System.in);

        System.out.printf("Bem-vindo ao Echos of Dungeons! \n");
        System.out.printf("Escolha uma opção abaixo:");

        do {
            System.out.printf("\n1 - Instruções\n"
                    + "2 - Jogar\n"
                    + "3 - Créditos\n"
                    + "4 - Sair\n");
            byte resposta = input.nextByte();

            switch (resposta) {
                case 1:
                    System.out.println("- Instruções do jogo:\r\n" + 
                            "1- Dê um nome ao seu personagem.\r\n" + 
                            "2- O jogo é formado por fases com desafios matemáticos, portanto, esteja com uma \n calculadora por perto (ou se preferir um papel e um lápis).\r\n" + 
                            "3- Echos of Dungeons tem um formato de Escape Room, portanto, é necessário a escolha entre \n opções no jogo para chegar ao fim do mesmo.\r\n" + 
                            "- Bom Jogo! \r\n");
                    break;
                case 2:
                    System.out.println("Se vira para jogar");
                    espacamento();
                    nomePersonagem();
                    prologo();
                    jogo();
                    break;
                case 3:
                    System.out.println("Criado por:\r\n" + 
                            "- Filipe Angelo de Oliveira\r\n" +
                            "- Heloisa Mendes do Nascimento Barbosa\r\n" +
                            "- Kevin Stenio Fernandes Lacerda Duarte\r\n" + 
                            "- Renan França de Jorge\r\n");
                    break;
                case 4:
                    System.out.println("Volte logo!");
                    retornarLoop = true;
                    break;
                default:
                    System.out.println("Tente outro código!");
            }
        }while(!retornarLoop);
        return 0;
    }

    public static int jogo() throws InterruptedException{
        primeiraFase();
        segundaFase();
        return 0;
    }
    public static void espacamento(){
        for (int i = 0; i < 2; i++){
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int op = Menu();
    }
    public static void prologo() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
     //prólogo do jogo-------------------
     System.out.println("Em uma pequena vila perdida no meio da floresta, viviam dois irmãos. Eles eram inseparáveis. \n"
     + "Sempre se aventurando por onde iam. A irmã  mais velha, Lucy, adorava caçar desafios e diversão por onde ia, \n"
     +  "já o irmão mais novo, *personagem* gostava de entender a natureza das coisas, de como elas funcionam . Lucy uma \n" 
     + "certa vez explorando pela redondeza da vila encontrou uma caverna,  ainda não explorada por ela.");
     
     System.out.println("...");
     Thread.sleep(15000);

     System.out.println("Como de costume, quando algo novo surge,  chama seu irmão para ir junto nessa jornada. \n" +
     "Ao chegar nela entraram sem sequer pensar duas vezes, eram fascinados em mistérios e segredos. Ao entrarem \n" + 
     "perceberam que era extremamente escuro, não iriam ficar muito tempo ali sem algo para iluminar o caminho. \n" +
     "Mas sem explicação, de alguma forma, essa caverna chamava eles, como se alguém estivesse sussurrando ou até mesmo \n" +
    "um sentimento de ansiedade e curiosidade que não poderiam deixar de escutar. \r\n");

    System.out.println("...");
    Thread.sleep(10000);

    System.out.println("Em um certo momento, a caverna estava tão escura que mal conseguiam enxergar um ao \n" +
    "outro, o único guia deles agora era a voz um do outro. De repente, Lucy para de falar, o *personagem* \n" + 
    "chama por seu nome, porém sem sucesso. O *personagem* entra em pânico e tenta voltar do caminho que fizeram \n" +
    "na esperança de achar alguma luz novamente. \r\n");

    System.out.println("...");
    Thread.sleep(15000);

    System.out.println("Ele começa a ver uma luz, corre em direção daquilo que seria a saída, mas na realidade, \n" +
    "se deparou uma um ambiente que jamais imaginou existir. Estava vendo uma luz de duas tochas penduradas na \n" +
    "parede, que iluminavam diversas celas de prisão, enferrujadas e repulsivas. Se deu conta que estava em uma \n" +
    "macabra masmorra abandonada.\r\n");
   }
    public static void nomePersonagem() {
        Scanner input = new Scanner(System.in);
        String nomeUsuario;
        System.out.println("Digite o nome do seu personagem: ");
        nomeUsuario = input.nextLine();
    }

    
    }
