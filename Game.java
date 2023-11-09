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
                "Ao se aproximar você percebe que tem uma tranca com 3 fileiras de senha para colocar.\r\n" +
                "Em cada fileira ha escrito algumas contas para resolver.\r\n" +
                "Nessa cela há também uma mesa com um papel nela, e tem alguns dizeres. \r\n" +
                "O que deseja fazer?\r\n" +
                "1- Tentar abrir cadeado\r\n" +
                "2- Olhar mesa\r\n");
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

                System.out.println("1ª Fileira de Senha");
                System.out.printf("{%d*%d+[%d(%d*%d)+%d+%d]-%d*%d}\n", K, L, M, N, O, P, Q,R,S);
                System.out.println("1ª resposta: ");
                int resultadoJogador = input.nextInt();
                int resultado1 = (K*L+(M*(N*O)+P+Q)-R*S);

                System.out.println("2ª Fileira de Senha");
                System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K2, L2, M2, N2, O2, P2, Q2, R2, S2);
                System.out.println("2ª resposta: ");
                int segundoResultadoJogador = input.nextInt();
                int resultado2 = (K2*L2+(M2*(N2*O2)-P2+Q2)-R2*S2);

                System.out.println("3ª Fileira de Senha");
                System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K3, L3, M3, N3, O3, P3, Q3, R3, S3);
                System.out.println("3ª resposta: ");
                int terceiroResultadoJogador = input.nextInt();
                int resultado3 = (K3*L3+(M3*(N3*O3)-P3+Q3)-R3*S3);

                resultado = resultado1 + resultado2 + resultado3;
                System.out.println("Qual é a senha?");
                int resultadoCadeado = input.nextInt();

                if (resultadoCadeado == resultado){
                    System.out.println("Você escuta um 'click', esta destrancada!");
                }else{
                    System.out.println("Nada aconteceu...");
                }

                break;
            case 2:
                System.out.println("Parece que no papel há um tipo de dica");
                System.out.println("Resolver nesta ordem:\n ( ) - Primeiro\n [ ] - Segundo\n { } - Terceiro");
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

        System.out.println("A sua direita há um corredor que leva a uma porta de ferro entreaberta.\n" +
                "Ao se aproximar dessa porta, você percebe que alguém acabou de passar por ali.\n" +
                "A maçaneta não tinha poeira como o restante da porta, já que tudo estava abandonado.\n" +
                "Ao abrir a porta você se depara com um grande salão, com um grande portão de grades de ferro.\n" +
                "Atrás desse portão, você sente uma brisa estranha, um vento que vinha da completa escuridão que havia ali.\n" +
                        "Ao chegar nesse portão enferrujado, há um nota grudada nele dizendo:");

                System.out.printf("Equaçao de 1° grau: \n%dx-%d = %dx+%d ", a1, a2, a3, a4);
        System.out.print("Resposta: ");
        float resposta = input.nextFloat();
        float res1 = (a1 - a3 );
        float res2 = (a4 + a2 );
        float res3 = (res2 / res1);

        if (res3 == resposta){
            System.out.println("parabens voce acertou.");
        }else{
            System.out.println("resposta errada. \nA resposta certa era : "+res3);
        }
    }


    public static int Menu() throws InterruptedException{
        boolean retornarLoop = false;
        Scanner input = new Scanner(System.in);

        System.out.printf("Bem-vindo ao Echos of Dungeons! \n");
        System.out.printf("Escolha uma opção abaixo: \n");

        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
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
                    espacamento();
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
        String teste = "Em uma pequena vila perdida no meio da floresta, viviam dois irmãos. Eles eram inseparáveis. \n" +
                "Sempre se aventurando por onde iam. A irmã  mais velha, Lucy, adorava caçar desafios e diversão por onde ia, \n" +
                "já o irmão mais novo, *personagem* gostava de entender a natureza das coisas, de como elas funcionam . Lucy uma \n" +
                "certa vez explorando pela redondeza da vila encontrou uma caverna,  ainda não explorada por ela. \n\n...\n\n" +
                "Como de costume, quando algo novo surge,  chama seu irmão para ir junto nessa jornada. \n" +
                "Ao chegar nela entraram sem sequer pensar duas vezes, eram fascinados em mistérios e segredos. Ao entrarem \n" +
                "perceberam que era extremamente escuro, não iriam ficar muito tempo ali sem algo para iluminar o caminho. \n" +
                "Mas sem explicação, de alguma forma, essa caverna chamava eles, como se alguém estivesse sussurrando ou até mesmo \n" +
                "um sentimento de ansiedade e curiosidade que não poderiam deixar de escutar. \r\n\n...\n\n" +
                "Em um certo momento, a caverna estava tão escura que mal conseguiam enxergar um ao \n" +
                "outro, o único guia deles agora era a voz um do outro. De repente, Lucy para de falar, o *personagem* \n" +
                "chama por seu nome, porém sem sucesso. O *personagem* entra em pânico e tenta voltar do caminho que fizeram \n" +
                "na esperança de achar alguma luz novamente. \r\n\n...\n\n" +
                "Ele começa a ver uma luz, corre em direção daquilo que seria a saída, mas na realidade, \n" +
                "se deparou uma um ambiente que jamais imaginou existir. Estava vendo uma luz de duas tochas penduradas na \n" +
                "parede, que iluminavam diversas celas de prisão, enferrujadas e repulsivas. Se deu conta que estava em uma \n" +
                "macabra masmorra abandonada.\r\n\n...\n\n";

        for (char c : teste.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void nomePersonagem() {
        Scanner input = new Scanner(System.in);
        String nomeUsuario;
        System.out.println("Digite o nome do seu personagem: ");
        nomeUsuario = input.nextLine();
    }


}

    
    }
