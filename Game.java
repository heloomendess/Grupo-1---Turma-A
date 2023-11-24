import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Game  {
    static Scanner input = new Scanner(System.in);
    /**
     * @return
     */

    public static float faseCadeado() throws InterruptedException {
        int resultado = 0;
        boolean verificacaoResult = false;
        String primeiraFase = "A porta fechada começa a abrir sozinha, entranho para uma masmorra algo tecnológico assim.\r\n" +
                "Quando você atravesa essa porta, você se encontra em uma jaula, repleta de barras e grades a volta.\r\n" +
                "A sua frente há uma porta trancada, desta vez com uma simples fechadura.\r\n\n" +
                "Ao se aproximar você percebe que tem uma tranca com 3 fileiras de senha para colocar.\r\n" +
                "Em cada fileira ha escrito algumas contas para resolver.\r\n" +
                "Nessa cela há também uma mesa com um papel nela, e tem alguns dizeres. \r\n\n\n" +
                "O que deseja fazer?\r\n" +
                "1- Tentar abrir cadeado\r\n" +
                "2- Olhar mesa\r\n";

        do {
            animacaoTexto(primeiraFase);
            byte opcao = input.nextByte();



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
                    System.out.println("1ª Fileira de Senha");
                    System.out.printf("{%d*%d+[%d(%d*%d)+%d+%d]-%d*%d}\n", K, L, M, N, O, P, Q, R, S);
                    System.out.println("1ª resposta: ");
                    int resultadoJogador = input.nextInt();
                    int resultado1 = (K * L + (M * (N * O) + P + Q) - R * S);
                    System.out.println("2ª Fileira de Senha");
                    System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K2, L2, M2, N2, O2, P2, Q2, R2, S2);
                    System.out.println("2ª resposta: ");
                    int segundoResultadoJogador = input.nextInt();
                    int resultado2 = (K2 * L2 + (M2 * (N2 * O2) - P2 + Q2) - R2 * S2);
                    System.out.println("3ª Fileira de Senha");
                    System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K3, L3, M3, N3, O3, P3, Q3, R3, S3);
                    System.out.println("3ª resposta: ");
                    int terceiroResultadoJogador = input.nextInt();
                    int resultado3 = (K3 * L3 + (M3 * (N3 * O3) - P3 + Q3) - R3 * S3);
                    resultado = resultado1 + resultado2 + resultado3;
                    System.out.println("Qual é a senha?");
                    int resultadoCadeado = input.nextInt();
                    if (resultadoCadeado == resultado) {
                        System.out.println("Você escuta um 'click', esta destrancada!");
                        verificacaoResult = true;
                    } else {
                        System.out.println("Nada aconteceu...");
                    }
                    break;
                case 2:
                    System.out.println("Parece que no papel há um tipo de dica");
                    System.out.println("Resolver nesta ordem:\n ( ) - Primeiro\n [ ] - Segundo\n { } - Terceiro\n Somar tudo!\r\n");
                    break;
            }
        }while (!verificacaoResult);
        return resultado;
    }

    public static void faseEquacao() {
        Random random = new Random();
        int a1 = random.nextInt(5) + 5;
        int a2 = random.nextInt(10);
        int a3 = random.nextInt(3) + 1;
        int a4 = random.nextInt(20);
        int a5 = random.nextInt(5);
        int a6 = random.nextInt(5);
        int a7 = random.nextInt(5);
        int a8 = random.nextInt(5);
        String segundaFase = "Ao destravar a tranca e abrir a porta, você percebe que há uma escadaria.\n" +
                "Ao descer essa escadaria, você se encontra em um corredor mal iluminado por tochas \n" +
                "Andando por esse corredor, no fim você encontra uma bifurcação.\n" +
                "Na parede que divide esses dois caminhos, há escrito: \r\n" +
                "Esquerda = Falso\n" +
                "Direita = Verdadeiro\n " +
                "Mais abaixo, há uma outra frase escrita: \n";
        animacaoTexto(segundaFase);

        float resposta = input.nextFloat();
        float res1 = (a1 - a3);
        float res2 = (a4 + a2);
        float res3 = (res2 / res1);


        System.out.printf("Equaçao de 1° grau: \n%dx-%d = %dx+%d\n   R = ",res3,  "\n\n(Dica: Resposta deve ser em víngula. \n", a1, a2, a3, a4);
        System.out.print("Esquerda ou Direita? ");
        if (Math.abs(res3 - resposta)<0.1) {
            System.out.println("parabens voce acertou.");
        } else {
            System.out.println("resposta errada. \nA resposta certa era : " + res3);
        }




    }


    public static void faseBinaria() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<String>();
        Random aleatorio = new Random();
        int a = aleatorio.nextInt(2);
        int b = aleatorio.nextInt(2);
        int c = aleatorio.nextInt(2);
        int d = aleatorio.nextInt(2);
        int e = aleatorio.nextInt(2);
        int f = aleatorio.nextInt(2);
        int g = aleatorio.nextInt(2);
        int h = aleatorio.nextInt(2);
        int i = aleatorio.nextInt(2);
        int j = aleatorio.nextInt(2);
        int k = aleatorio.nextInt(2);
        int l = aleatorio.nextInt(2);
        int m = aleatorio.nextInt(2);
        int n = aleatorio.nextInt(2);
        int o = aleatorio.nextInt(2);
        int p = aleatorio.nextInt(2);
        int q = aleatorio.nextInt(2);
        int r = aleatorio.nextInt(2);
        int s = aleatorio.nextInt(2);
        int t = aleatorio.nextInt(2);
        int u = aleatorio.nextInt(2);
        int rc = 11011011;
        String r0 = "" + rc;
        String r1 = "" + a + b + c + d + e + f + g + h;
        String r2 = "" + f + g + h + i + j + k + l + m;
        String r3 = "" + n + o + p + q + r + s + t + u;
        respostas.add(r0);
        respostas.add(r1);
        respostas.add(r2);
        respostas.add(r3);
        Collections.shuffle(respostas);
        Collections.shuffle(respostas);
        Collections.shuffle(respostas);
        System.out.println("Ao sair dessa cela, você ve");
        System.out.println("a sua frente vc encontra  (historia da fase...)");
        System.out.println("174 > 10101110 \n159 > 10011111 \n197 > 11000101 \n201 > 11001001 \n219 > ... \n\n");
        System.out.println("Dica... e uma dessa...\n");
        for (String Elemento : respostas) {
            System.out.println(Elemento);
        }
        System.out.print("\ndigite a resposta correta: ");
        int res = entrada.nextInt();
        if (res == rc) {
            System.out.println("parbens, voce acertou");
        } else {
            System.out.println("Resposta errada");
        }
    }

    public static void explicFaseRomana(){

    }

    public static void faseRomana() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        boolean sairDoLoop = false;

        do {
            String resultPM1;
            String resultPH1;
            String resultPM2;
            String resultPH2;
            String resultPM3;
            String resultPH3;
            String resultPM4;
            String resultPH4;
            boolean verificacaoResult = false;
            String romanaFase = "Após sair dessa caverna, você se depara com uma sala misteriosa\n " +
                    "Aparentemente você está em especie de masmorra, as paredes são estramamente velhas e escuras\n " +
                    "Nessa sala, há uma porta de ferro bem enferrujada, provavel que ninguem mexe nela há anos\n " +
                    "Mas não é só isso, nessa sala ha diversos relogios pendurados na parede, e você consegue mexer os ponteros neles\n" +
                    "O que deja fazer?\n" +
                    "1 - Olhar a parede a direita\n" +
                    "2 - Olhar a parede a esquerda\n" +
                    "3 - Tentar abrir a porta\n";

            animacaoTexto(romanaFase);

            byte opcao2  = input.nextByte();
            switch (opcao2) {
                case 1:
                    String primeiraDicaRomana = "Quando você olha a sua direita, tem algumas letras escritas na parede:\n" +
                            "Você entende que são números romanos\n" +
                            "Ponteros Grandes\n" +
                            "1º = XL + X - XIX = ?\n" +
                            "2ª = XI + XI = ?\n" +
                            "3º = XVIII * III = ?\n" +
                            "4º = XXX - XV = ?\n";

                    animacaoTexto(primeiraDicaRomana);
                    break;
                case 2:
                    String segundaDicaRomana = "Quando você olha a sua esquerda, tem algumas palabras escritas na parede:\n" +
                            "Você percebe que são algarismos romanos\n" +
                            "Ponteros Pequenos\n" +
                            "1º II + II = ?\n" +
                            "2º XI + XI = ?\n" +
                            "3º XVIII * III = ?\n" +
                            "4º XXX - XV = ?\n";

                    animacaoTexto(segundaDicaRomana);
                    break;
                case 3:
                    String relogios = "Ao lado da porta, há quatro relógios em sistema romano\n" +
                            "Você entende um pouco desse sistema:\n" +
                            "I = 1\n" +
                            "V = 5\n" +
                            "X = 10\n" +
                            "L = 50\n" +
                            "E que 4 e 9 são: IV e IX\n" +
                            "Você tenta abrir mexendo no ponteiros\n";

                    animacaoTexto(relogios);

                    String ponteiro1_H = "IV";
                    String ponteiro1_M = "XXXI";

                    String ponteiro2_H = "XI";
                    String ponteiro2_M = "XXII";

                    String ponteiro3_H = "VIII";
                    String ponteiro3_M = "LIV";

                    String ponteiro4_H = "II";
                    String ponteiro4_M = "XV";

                    System.out.println("1º relógio ");
                    System.out.println("Ponteiro Pequeno   (Dica __:31. Escreva o número em romano)");
                    resultPH1 = input.next();
                    System.out.println("Ponteiro Grande   (Dica 04:__. Escreva o número em romano)");
                    resultPM1 = input.next();
                    System.out.println("2º Relógio");
                    System.out.println("Ponteiro Pequeno: ");
                    resultPH2 = input.next();
                    System.out.println("Ponteiro Grande: ");
                    resultPM2 = input.next();
                    System.out.println("3º Relógio ");
                    System.out.println("Ponteiro Pequeno");
                    resultPH3 = input.next();
                    System.out.println("Ponteiro Grande");
                    resultPM3 = input.next();
                    System.out.println("4º Relógio");
                    System.out.println("Ponteiro Pequeno");
                    resultPH4 = input.next();
                    System.out.println("Ponteiro Grande");
                    resultPM4 = input.next();
                    if ((resultPH1.equals(ponteiro1_H)) && (resultPM1.equals(ponteiro1_M)) &&
                            (resultPH2.equals(ponteiro2_H)) && (resultPM2.equals(ponteiro2_M)) &&
                            (resultPH3.equals(ponteiro3_H)) && (resultPM3.equals(ponteiro3_M)) &&
                            (resultPH4.equals(ponteiro4_H)) && (resultPM4.equals(ponteiro4_M))

                    ) {
                        sairDoLoop = true;
                        System.out.println("Você escuta engrenagens se mexendo, parece que você acertou a sequência! ");
                    } else {
                        sairDoLoop = false;
                        System.out.println("Nada aconteceu, será que faltou algo?");
                        //return opcao2;
                    }
                    break;
            }
        } while (!sairDoLoop);
    }

    public static void faseHexadecimal() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadeado Hex. _______");
        System.out.println("sala hexa.");

        Random random = new Random();
        int a1 = 0, a2 = 0, a3 = 0;
        int a4 = 0, a5 = 0, a6 = 0;
        int a7 = 0, a8 = 0, a9 = 0;
        int a10 = 0, a11 = 0, a12 = 0;
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0;

        do {
            a1 = random.nextInt(9) + 1;
            a2 = random.nextInt(9) + 1;
            a3 = random.nextInt(9) + 1;
            q1 = a1 + a2 - a3;

        } while (q1 != 12);
        String nb1 = converterParaBinario(a1);
        String nb2 = converterParaBinario(a2);
        String nb3 = converterParaBinario(a3);

        System.out.printf("pergunta. converta de binario p decimal: %s+%s-%s\n", nb1, nb2, nb3);
        int res = entrada.nextInt();
        if (res == 12) {
            System.out.println("PARABÉNS! acertou a mizeravel...");
        } // ------------------------------------------------------------------------------
        do {
            a4 = random.nextInt(9) + 1;
            a5 = random.nextInt(9) + 1;
            a6 = random.nextInt(9) + 1;
            q2 = a4 + a5 - a6;

        } while (q2 != 10);
        String nb4 = converterParaBinario(a4);
        String nb5 = converterParaBinario(a5);
        String nb6 = converterParaBinario(a6);

        System.out.printf("Por qual o valor em decimal: %s+%s-%s\n", nb4, nb5, nb6);
        int res2 = entrada.nextInt();
        if (res2 == 10) {
            System.out.println("PARABÉNS! acertou a mizeravel...");
        } // ----------------------------------------------------------------------------------
        do {
            a7 = random.nextInt(9) + 1;
            a8 = random.nextInt(9) + 1;
            a9 = random.nextInt(9) + 1;
            q3 = a7 + a8 - a9;

        } while (q3 != 15);
        String nb7 = converterParaBinario(a7);
        String nb8 = converterParaBinario(a8);
        String nb9 = converterParaBinario(a9);

        System.out.printf("per qual o valor em decimal: %s+%s-%s\n", nb7, nb8, nb9);
        int res3 = entrada.nextInt();
        if (res3 == 15) {
            System.out.println("paraben acertou a mizeravel...");
        } // -----------------------------------------------------------------------------

        do {
            a10 = random.nextInt(9) + 1;
            a11 = random.nextInt(9) + 1;
            a12 = random.nextInt(9) + 1;
            q4 = a10 + a11 - a12;

        } while (q4 != 14);
        String nb10 = converterParaBinario(a10);
        String nb11 = converterParaBinario(a11);
        String nb12 = converterParaBinario(a12);

        System.out.printf("per qual o valor em decimal: %s+%s-%s\n", nb10, nb11, nb12);
        int res4 = entrada.nextInt();
        if (res4 == 14) {
            System.out.println("paraben acertou a mizeravel...");
        }
        System.out.println("tex explicando...\ndigite os resultados anterio em Hex.");
        System.out.println("cadeado: ");
        String res5 = entrada.next();

        if (res5.equals("CAFE") || res5.equals("cafe")) {
            System.out.println("paraben proxima fase");
        } else {
            System.out.println("resposta errada");
        }
    }

    public static String converterParaBinario(int decimal) {
        if (decimal == 0) {
            return "0000";
        }

        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int bitMenosSignificativo = decimal & 1;
            binario.insert(0, bitMenosSignificativo);
            decimal >>= 1;
        }

        while (binario.length() < 4) {
            binario.insert(0, "0");
        }

        return binario.toString();
    }

    public static int Menu() throws InterruptedException {
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
                    String Instrucoes = "1- Dê um nome ao seu personagem.\r\n" +
                            "2- O jogo é formado por fases com desafios matemáticos, portanto, esteja com uma \n calculadora por perto (ou se preferir um papel e um lápis).\r\n"
                            +
                            "3- Echos of Dungeons tem um formato de Escape Room, portanto, é necessário a escolha entre \n opções no jogo para chegar ao fim do mesmo.\r\n"
                            +
                            "- Bom Jogo! \r\n";

                    animacaoTexto(Instrucoes);
                    break;
                case 2:
                    System.out.println("Se vira para jogar");
                    espacamento();
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
        } while (!retornarLoop);
        return 0;
    }


    public static int jogo() throws InterruptedException {
        faseRomana();
        faseCadeado();
        faseBinaria();
        faseEquacao();
        faseHexadecimal();
        return 0;
    }


    public static void espacamento() {
        for (int i = 0; i < 2; i++) {
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
        String nomeUsuario = nomePersonagem();
        // prólogo do jogo-------------------
        String teste = "Em uma pequena vila perdida no meio da floresta, viviam dois irmãos. Eles eram inseparáveis. \n" +
                "Sempre se aventurando por onde iam. A irmã  mais velha, Lucy, adorava caçar desafios e diversão por onde ia, \n"
                +
                "já o irmão mais novo, " + nomeUsuario + " gostava de entender a natureza das coisas, de como elas funcionam . Lucy uma \n"
                +
                "certa vez explorando pela redondeza da vila encontrou uma caverna,  ainda não explorada por ela. \n\n...\n\n" +
                "Como de costume, quando algo novo surge,  chama seu irmão para ir junto nessa jornada. \n" +
                "Ao chegar nela entraram sem sequer pensar duas vezes, eram fascinados em mistérios e segredos. Ao entrarem \n"
                +
                "perceberam que era extremamente escuro, não iriam ficar muito tempo ali sem algo para iluminar o caminho. \n" +
                "Mas sem explicação, de alguma forma, essa caverna chamava eles, como se alguém estivesse sussurrando ou até mesmo \n"
                +
                "um sentimento de ansiedade e curiosidade que não poderiam deixar de escutar. \r\n\n...\n\n" +
                "Em um certo momento, a caverna estava tão escura que mal conseguiam enxergar um ao \n" +
                "outro, o único guia deles agora era a voz um do outro. De repente, Lucy para de falar, o/a " + nomeUsuario + "\n" +
                "chama por seu nome, porém sem sucesso. O/A " + nomeUsuario + " entra em pânico e tenta voltar do caminho que fizeram \n"
                +
                "na esperança de achar alguma luz novamente. \r\n\n...\n\n" +
                "Ele começa a ver uma luz, corre em direção daquilo que seria a saída, mas na realidade, \n" +
                "se deparou uma um ambiente que jamais imaginou existir. Estava vendo uma luz de duas tochas penduradas na \n" +
                "parede, que iluminavam diversas celas de prisão, enferrujadas e repulsivas. Se deu conta que estava em uma \n"
                +
                "macabra masmorra abandonada.\r\n\n...\n\n";

        animacaoTexto(teste);
    }



    public static String nomePersonagem() {
        Scanner input = new Scanner(System.in);
        String nomeUsuario;
        System.out.println("Digite o nome do seu personagem: ");
        nomeUsuario = input.nextLine();
        return nomeUsuario;
    }

    public static String animacaoTexto(String texto){
        String textoJogo = texto;
        for (char c : textoJogo.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return textoJogo;
    }
}
