import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Game  {

    public static void espacamento() {
        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
        }
    }

    public static void prologo() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }

        // ------------------------------------------------------------------------------

        String nomeUsuario = nomePersonagem();

        // Prologo------------------------------------------------------------------------------

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
        for (char letra : textoJogo.toCharArray()) {
            System.out.print(letra);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return textoJogo;
    }


    public static float faseCadeado() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int resultado = 0;
        boolean verificacaoResult = false;

        // ------------------------------------------------------------------------------

        String primeiraFase = "A porta fechada começa a abrir sozinha, entranho para uma masmorra algo tecnológico assim.\r\n" +
                "Quando você atravesa essa porta, você se encontra em uma jaula, repleta de barras e grades a volta.\r\n" +
                "A sua frente há uma porta trancada, desta vez com uma simples fechadura.\r\n\n" +
                "Ao se aproximar você percebe que tem uma tranca com 3 fileiras de senha para colocar.\r\n" +
                "Em cada fileira ha escrito algumas contas para resolver.\r\n" +
                "Nessa cela há também uma mesa com um papel nela, e tem alguns dizeres. \r\n\n\n" +
                "O que deseja fazer?\r\n" +
                "1- Tentar abrir cadeado\r\n" +
                "2- Olhar mesa\r\n\n";

        // ------------------------------------------------------------------------------

        do {
            animacaoTexto(primeiraFase);
            byte opcao = input.nextByte();

            switch (opcao) {
                case 1:
                    //VARIAVEIS
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

                    // ------------------------------------------------------------------------------

                    System.out.println("*_* 1ª Fileira de Senha *_*");
                    System.out.printf("{%d*%d+[%d(%d*%d)+%d+%d]-%d*%d}\n", K, L, M, N, O, P, Q, R, S);
                    System.out.println("1ª resposta: ");
                    int resultadoJogador = input.nextInt();

                    // ------------------------------------------------------------------------------

                    int resultado1 = (K * L + (M * (N * O) + P + Q) - R * S);
                    System.out.println("*_* 2ª Fileira de Senha *_*");
                    System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n", K2, L2, M2, N2, O2, P2, Q2, R2, S2);
                    System.out.println("2ª resposta: ");
                    int segundoResultadoJogador = input.nextInt();

                    // ------------------------------------------------------------------------------

                    int resultado2 = (K2 * L2 + (M2 * (N2 * O2) - P2 + Q2) - R2 * S2);
                    System.out.println("*_* 3ª Fileira de Senha *_*");
                    System.out.printf("{%d*%d+[%d(%d*%d)-%d+%d]-%d*%d}\n\n", K3, L3, M3, N3, O3, P3, Q3, R3, S3);
                    System.out.println("3ª resposta: ");
                    int terceiroResultadoJogador = input.nextInt();

                    // ------------------------------------------------------------------------------

                    int resultado3 = (K3 * L3 + (M3 * (N3 * O3) - P3 + Q3) - R3 * S3);
                    resultado = resultado1 + resultado2 + resultado3;
                    System.out.println("Qual é a senha?");
                    int resultadoCadeado = input.nextInt();

                    // ------------------------------------------------------------------------------

                    if (resultadoCadeado == resultado) {
                        System.out.println("Você escuta um 'click', está destrancada!");
                        verificacaoResult = true;
                    } else {
                        System.out.println("Nada aconteceu...");
                    }
                    break;

                // ------------------------------------------------------------------------------

                case 2:
                    espacamento();
                    System.out.println("Parece que no papel há um tipo de dica");
                    System.out.println("Resolver nesta ordem:\n ( ) - Primeiro\n [ ] - Segundo\n { } - Terceiro\n Somar tudo!\r\n");
                    break;
            }
        }while (!verificacaoResult);
        return resultado;
    }


    public static void faseEquacao() {
        Scanner input = new Scanner(System.in);
        boolean condicao = false;


        // Primeira Parede----------------------------------------------------------------------
        do {
            Random random = new Random();
            int a1 = random.nextInt(5) + 5;
            int a2 = random.nextInt(10);
            int a3 = random.nextInt(3) + 1;
            int a4 = random.nextInt(20);
            int a5 = random.nextInt(5);

            String segundaFase = "\n\nVocê acorda assustado, está muito escuro.\n" +
                    "Aquele sentimento de solidão volta a te prencher, será que verei minha irmã novamente? \n" +
                    "Mas esse pensamento passa rápido em sua mente após perceber o que houve.\n" +
                    "Você acorda molhado e percebe que caiu em uma antiga fossa, talvez seja isso que amorteceu a queda\n" +
                    "Você levanta e começa a tatear a parede, no intuito de encontrar algo\n" +
                    "Na distância você encontra uma tocha, familiar, mas algo de cara chama sua atenção\n\n" +
                    "A tocha ilumina uma bifurcação, e embaixo da tocha na parede há algo escrito \r\n\n" +
                    "Resposta Falsa = Esquerda\n" +
                    "Resposta Correta = Direita\n\n" +
                    "Mais abaixo, há uma outra frase escrita: \n\n";
            animacaoTexto(segundaFase);

            float res1 = (a1 - a3);
            float res2 = (a4 + a2);
            float res3 = (res2 / res1);

            System.out.printf("Equaçao de 1° grau: \n\n%dx-%d = %dx+%d\nResposta = %.2f \n\n", a1, a2, a3, a4, res3);
            System.out.println("1 - Esquerda\n2 - Direita ");
            byte resposta = input.nextByte();
            if (resposta == 2) {
                System.out.println("Você vira a direita começa a andar\n" +
                                    "Você sente um sentimento de aperto, como se algo estivesse aproximando mas não exatamente o que\n");
                condicao = true;
            } else {
                System.out.printf("Você vira a esquerda e começa a andar\n" +
                                    "Você vê uma luz no fim, será finalmente a saída?\n" +
                                    "Um nevoa aparece, e você começa a ficar tonto, não aguenta e desmaia.....\n");
                condicao = false;
            }
        }while (!condicao);


        // Segunda Parede----------------------------------------------------------------------
        do {
            Random random = new Random();
            int a1 = random.nextInt(5) + 5;
            int a2 = random.nextInt(10);
            int a3 = random.nextInt(3) + 1;
            int a4 = random.nextInt(20);
            int a5 = random.nextInt(5);

            float res1 = (a1 - a3);
            float res2 = (a4 + a2);
            float res3 = (res2 / res1) + 1;

            System.out.printf("\n\nDepois de caminhar um pouco, você se depara com outra bifurcação\n" +
                                "Na parede, a o mesmo tipo de mensagem, mas com numero diferentes\n" +
                                "Equaçao de 1° grau: \n\n%dx-%d = %dx+%d\nResposta = %.2f \n\n", a1, a2, a3, a4, res3);
            System.out.println("1 - Esquerda\n2 - Direita\n");
            byte resposta = input.nextByte();
            if (resposta == 1) {
                System.out.println("Ao virar a esquerda você começa a subir uma escada\n" +
                                    "No alto da escadaria você escuta algo sussurrando, algo que não consegue ver direito \n" +
                                    "Ao se aproximar, você não encontra nada");
                condicao = true;
            } else {
                System.out.printf("Você vira a direita e começa a descer uma escada\n" +
                                  "A distância, você escuta alguem gritando\n" +
                                  "Você, em desespero querendo ajudar, tropeça e escorra da escada\n" +
                                   "Você começa a ficar tonto, sente que alguma silhueta está chegando mas você desmaia antes\r\n");
                condicao = false;
            }
        }while (!condicao);


        // Terceira Parede----------------------------------------------------------------------
        do {
            Random random = new Random();
            int a1 = random.nextInt(5) + 5;
            int a2 = random.nextInt(10);
            int a3 = random.nextInt(3) + 1;
            int a4 = random.nextInt(20);
            int a5 = random.nextInt(5);

            float res1 = (a1 - a3);
            float res2 = (a4 + a2);
            float res3 = (res2 / res1) -1 ;

            System.out.printf("\n\nO lugar começa a ficar mais claro, com mais tochas e menos podre\n" +
                    "Chegando perto de uma outra bifurcação, algo diferente acontece\n" +
                    "Você escuta algo vindo dos corredores 'nãoconfienaproximaperguta'.....\n" +
                    "Equaçao de 3° grau: \n\n%dx-%d = %dx+%d\nResposta = %.2f \n\n", a1, a2, a3, a4, res3);
            System.out.println("2 - Esquerda -->\n1 - Direita <--\n");
            byte resposta = input.nextByte();

            // Verificação------------------------------------------------------------------------
            if (resposta == 1) {
                System.out.println("Você escolhe a esquerda e se sente cansado\n" +
                                    "Não aguenta mais esses calculos\n" +
                                    "Começa a sentira falta de sua irmã\n" +
                                    "Com certeza ela encontraria outro caminho mais facil quebrando algo...\r\n" +
                                    "Para alívio, você vê algo que não via a um tempo, luz do sol\r\n");
                condicao = true;
            } else {
                System.out.printf("Você fica confuso com essas perguntas e escolhe a direita\n" +
                                  "Você começa andar e percebe que.............\n\n\n" +
                                    "Você capota de sono\n\n");
                condicao = false;
            }
        }while (!condicao);
    }


    public static void faseBinaria() {
        Scanner input = new Scanner(System.in);
        boolean condicao = false;


        do {
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

            // ------------------------------------------------------------------------------

            respostas.add(r0);
            respostas.add(r1);
            respostas.add(r2);
            respostas.add(r3);
            Collections.shuffle(respostas);
            Collections.shuffle(respostas);
            Collections.shuffle(respostas);

            espacamento();
            System.out.println("Ao sair dessa cela, você vê outras celas trancadas, mas ninguém esta nelas\n" +
                    "Olhando em volta, há um imenso corredor que provelmente leva ao fim desse lugar\n" +
                    "Depois de alguns minutos caminhando, você encontra um portão de madeira\n" +
                    "Com pouco esforço, você abre o portão, mas... algo esta estranho.....\n\n" +
                    "Você está no mesmo corredor, no qual você veio, seria isso um loop?\n" +
                    "Você começa a correr para tentar escapar disso, mas sem sucesso\n" +
                    "Depois de correr por muito tempo, você se sente cansado e para um pouco\n" +
                    "Quando você para, percebe que no chão há algumas escrituras:\n");

            System.out.println("154 > 10 01 10 10 \n199 > 11 00 01 11 \n200 > 11 00 10 00 \n209 > 11 01 00 01 \n219 > ?? ?? ?? ?? \n\n");
            System.out.println("Ao lado, no outro piso, há um tipo de dispositivo grudado no chão com teclas de 0 e 1, e esta escrito algo..\n" +
                                "Números Binarios, escolha sabiamente!\n");
            for (String Elemento : respostas) {
                System.out.println(Elemento);
            }
            System.out.print("\nColoque o numero completo: ");
            int res = input.nextInt();
            if (res == rc) {
                System.out.println("Você escuta e sente o chão inteiro tremendo, derrepente o não há mais chão, tudo começa a desabar e você cai nesse buraco\r\r");
                condicao = true;
            } else {
                System.out.println("Nada ocorreu, o dispositivo parace que reiniciou...");
                condicao = false;
            }
        }while(!condicao);
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

            // Texto Explicativo---------------------------------------------------------------------

            String romanaFase = "Após sair dessa caverna, você se depara com uma sala misteriosa\n" +
                    "Aparentemente você está em especie de masmorra, as paredes são estramamente velhas e escuras\n" +
                    "Nessa sala, há uma porta de ferro bem enferrujada, provável que ninguem mexe nela há anos\n" +
                    "Mas não é só isso, nessa sala ha diversos relogios pendurados na parede, e você consegue mexer os ponteros neles\n" +
                    "O que deja fazer?\n" +
                    "1 - Olhar a parede a direita\n" +
                    "2 - Olhar a parede a esquerda\n" +
                    "3 - Tentar abrir a porta\n\n";
            animacaoTexto(romanaFase);
            byte opcao2  = input.nextByte();

            // ------------------------------------------------------------------------------

            switch (opcao2) {
                case 1:
                    String primeiraDicaRomana = "Quando você olha a sua direita, tem algumas letras escritas na parede:\n" +
                            "Você entende que são números romanos...\n\n" +
                            "*_* PONTEIROS MINUTOS *_*\n" +
                            "1º = XL + X - XIX = ?\n" +
                            "2ª = XI + XI = ?\n" +
                            "3º = XVIII * III = ?\n" +
                            "4º = XXX - XV = ?\n\n\n";
                    animacaoTexto(primeiraDicaRomana);
                    break;

                // ------------------------------------------------------------------------------

                case 2:
                    String segundaDicaRomana = "Quando você olha a sua esquerda, tem algumas palavras escritas na parede:\n" +
                            "Você percebe que são algarismos romanos... \n\n" +
                            "*_* PONTEIROS HORAS *_*\n" +
                            "1º II + II = ?\n" +
                            "2º XI + XI = ?\n" +
                            "3º X - II = ?\n" +
                            "4º XXX - XV = ?\n\n\n";
                    animacaoTexto(segundaDicaRomana);
                    break;

                // ------------------------------------------------------------------------------

                case 3:
                    String relogios = "Ao lado da porta, há quatro relógios em sistema romano\n" +
                            "Você entende um pouco desse sistema:\n" +
                            "I = 1\n" +
                            "V = 5\n" +
                            "X = 10\n" +
                            "L = 50\n" +
                            "E que 4 e 9 são: IV e IX\n" +
                            "Você tenta abrir mexendo no ponteiros.\n\n\n";
                    animacaoTexto(relogios);

                    String ponteiro1_H = "IV";
                    String ponteiro1_M = "XXXI";

                    String ponteiro2_H = "XI";
                    String ponteiro2_M = "XXII";

                    String ponteiro3_H = "VIII";
                    String ponteiro3_M = "LIV";

                    String ponteiro4_H = "II";
                    String ponteiro4_M = "XV";

                    System.out.println("*_* 1º relógio *_*");
                    System.out.println("Ponteiro Horas (Dica 04:__. Escreva o número em romano)");
                    resultPH1 = input.next();
                    System.out.println("Ponteiro Minutos: ");
                    resultPM1 = input.next();
                    System.out.println("*_* 2º Relógio *_*");
                    System.out.println("Ponteiro Horas: ");
                    resultPH2 = input.next();
                    System.out.println("Ponteiro Minutos: ");
                    resultPM2 = input.next();
                    System.out.println("*_* 3º Relógio *_*");
                    System.out.println("Ponteiro Horas:");
                    resultPH3 = input.next();
                    System.out.println("Ponteiro Minutos:");
                    resultPM3 = input.next();
                    System.out.println("*_* 4º Relógio *_*");
                    System.out.println("Ponteiro Horas:");
                    resultPH4 = input.next();
                    System.out.println("Ponteiro Minutos:");
                    resultPM4 = input.next();
                    if ((resultPH1.equals(ponteiro1_H)) && (resultPM1.equals(ponteiro1_M)) &&
                            (resultPH2.equals(ponteiro2_H)) && (resultPM2.equals(ponteiro2_M)) &&
                            (resultPH3.equals(ponteiro3_H)) && (resultPM3.equals(ponteiro3_M)) &&
                            (resultPH4.equals(ponteiro4_H)) && (resultPM4.equals(ponteiro4_M))

                    ) {
                        sairDoLoop = true;
                        espacamento();
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


    //faseHexadecimal
    public static void faseHexadecimal() {
        Scanner entrada = new Scanner(System.in);
        boolean condicao = false;

        do {
            System.out.println("Sala hexa.");
            System.out.println("Cadeado Hex. _______");

            Random random = new Random();
            int a1 = 0, a2 = 0, a3 = 0;
            int a4 = 0, a5 = 0, a6 = 0;
            int a7 = 0, a8 = 0, a9 = 0;
            int a10 = 0, a11 = 0, a12 = 0;
            int q1 = 0, q2 = 0, q3 = 0, q4 = 0;

            // ------------------------------------------------------------------------------

            do {
                a1 = random.nextInt(9) + 1;
                a2 = random.nextInt(9) + 1;
                a3 = random.nextInt(9) + 1;
                q1 = a1 + a2 - a3;

            } while (q1 != 12);
            String nb1 = converterParaBinario(a1);
            String nb2 = converterParaBinario(a2);
            String nb3 = converterParaBinario(a3);

            System.out.printf("Converta de binario p decimal: %s+%s-%s\n", nb1, nb2, nb3);
            int res = entrada.nextInt();
            if (res == 12) {
                System.out.println("Parabéns, você acertou!");
            }

            // ------------------------------------------------------------------------------

            do {
                a4 = random.nextInt(9) + 1;
                a5 = random.nextInt(9) + 1;
                a6 = random.nextInt(9) + 1;
                q2 = a4 + a5 - a6;

            } while (q2 != 10);
            String nb4 = converterParaBinario(a4);
            String nb5 = converterParaBinario(a5);
            String nb6 = converterParaBinario(a6);

            System.out.printf("Qual o valor em decimal: %s+%s-%s\n", nb4, nb5, nb6);
            int res2 = entrada.nextInt();
            if (res2 == 10) {
                System.out.println("Parabéns, você acertou!");
            }

            // ----------------------------------------------------------------------------------

            do {
                a7 = random.nextInt(9) + 1;
                a8 = random.nextInt(9) + 1;
                a9 = random.nextInt(9) + 1;
                q3 = a7 + a8 - a9;

            } while (q3 != 15);
            String nb7 = converterParaBinario(a7);
            String nb8 = converterParaBinario(a8);
            String nb9 = converterParaBinario(a9);

            System.out.printf("Qual o valor em decimal: %s+%s-%s\n", nb7, nb8, nb9);
            int res3 = entrada.nextInt();
            if (res3 == 15) {
                System.out.println("Parabéns, você acertou!");
            }

            // ------------------------------------------------------------------------------

            do {
                a10 = random.nextInt(9) + 1;
                a11 = random.nextInt(9) + 1;
                a12 = random.nextInt(9) + 1;
                q4 = a10 + a11 - a12;

            } while (q4 != 14);
            String nb10 = converterParaBinario(a10);
            String nb11 = converterParaBinario(a11);
            String nb12 = converterParaBinario(a12);

            System.out.printf("Qual o valor em decimal: %s+%s-%s\n", nb10, nb11, nb12);
            int res4 = entrada.nextInt();
            if (res4 == 14) {
                System.out.println("Parabéns, você acertou!");
            }
            System.out.println("Já que você desvendou as runas,\ndigite os resultados anteriores somados em Hexadecimal.");
            System.out.println("Cadeado: ");
            String res5 = entrada.next();

            if (res5.equals("CAFE") || res5.equals("cafe") || res5.equals("café") || res5.equals("Cafe") || res5.equals("Café") || res5.equals("CAFÉ")) {
                System.out.println("Parabéns, você desbloqueou a próxima fase!");
                condicao = true;
            } else {
                System.out.println("Resposta errada");
                condicao = false;
            }
        }while(!condicao);
    }


    //faseBinária
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

        // ------------------------------------------------------------------------------

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

                // ------------------------------------------------------------------------------

                case 2:
                    System.out.println("Se vira para jogar");
                    espacamento();
                    prologo();
                    jogo();
                    espacamento();
                    break;

                // ------------------------------------------------------------------------------

                case 3:
                    System.out.println("Criado por:\r\n" +
                            "- Filipe Angelo de Oliveira\r\n" +
                            "- Heloisa Mendes do Nascimento Barbosa\r\n" +
                            "- Kevin Stenio Fernandes Lacerda Duarte\r\n" +
                            "- Renan França de Jorge\r\n");
                    break;

                // ------------------------------------------------------------------------------

                case 4:
                    System.out.println("Volte logo!");
                    retornarLoop = true;
                    break;

                // ------------------------------------------------------------------------------

                default:
                    System.out.println("Tente outro código!");
            }
        } while (!retornarLoop);
        return 0;
    }


    public static int jogo() throws InterruptedException {
        faseRomana();
        faseCadeado();
        espacamento();
        faseBinaria();
        espacamento();
        faseEquacao();
        espacamento();
        faseHexadecimal();
        return 0;
    }


    public static void main(String[] args) throws InterruptedException {
        int op = Menu();
    }

}
