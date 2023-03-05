package game;

import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Game
{

    public static void main(String[] args) throws UnsupportedEncodingException, IOException, InterruptedException
    {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner sc = new Scanner(System.in);
        CleanConsole clean = new CleanConsole();

        System.out.println("Bem vindo, Digite seu nome: ");
        String nome = sc.next();
        clean.limparComFor();
        clean.clearConsole();

        System.out.println(String.format("\nT=====================T"
                + "\n| Vamos la " + nome + "!" + " "
                + "\nT=====================T")); // \033[1;4;30m%s\033[0m |

        Jogador jogador = new Jogador(nome);
        Loja loja = new Loja();
        Inventario inventario = new Inventario();

        int inicial = 1;
        while (inicial == 1)
        {

            System.out.println("\nT=====================T\n"
                    + " Escolha a sua opcao: "
                    + "\nT=====================T"
                    + " \n [ 1 ] Combate\n [ 2 ] Ver Status"
                    + "\n [ 3 ] Loja\n [ 4 ] Inventario\n [ 5+ ] Finalizar"
                    + "\nT=====================T\n");

            int escolhaGeral = sc.nextInt();

            if (escolhaGeral == 1)
            {
                clean.limparComFor();
                clean.clearConsole();
                int batalhar = 1;
                while (batalhar == 1)
                {

                    System.out.println("\nT===================================T\n"
                            + "Escolha um monstro para batalhar:"
                            + "\nT===================================T\n"
                            + "[ 1 ] Slime\t   [ 2 ] Zumbi\n"
                            + "[ 3 ] CaoFeroz\t   [ 4 ] Vampiro\n"
                            + "[ 5 ] Lobisomen\t   [ 6 ] Golem\n"
                            + "[ 7 ] Megalodon\t   [ 8 ] Manticora\n"
                            + "T===================================T");
                    int escolhaMonstro = sc.nextInt();

                    switch (escolhaMonstro)
                    {

                        case 1:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro slime = new Monstro("Slime", 3, 2, 8, 14, 4, 3);
                            while (jogador.getHp() > 0 && slime.getHp() > 0)
                            {
                                if (slime.getHp() > 0)
                                {
                                    jogador.atacar(slime);
                                }
                                if (jogador.getHp() > 0 && slime.getHp() > 0)
                                {
                                    slime.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && slime.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 2:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro zumbi = new Monstro("Zumbi", 8, 5, 5, 18, 8, 5);
                            while (jogador.getHp() > 0 && zumbi.getHp() > 0)
                            {
                                if (zumbi.getHp() > 0)
                                {
                                    jogador.atacar(zumbi);
                                }
                                if (jogador.getHp() > 0 && zumbi.getHp() > 0)
                                {
                                    zumbi.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && zumbi.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 3:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro caoFeroz = new Monstro("CaoFeroz", 13, 4, 10, 26, 18, 8);
                            while (jogador.getHp() > 0 && caoFeroz.getHp() > 0)
                            {
                                if (caoFeroz.getHp() > 0)
                                {
                                    jogador.atacar(caoFeroz);
                                }
                                if (jogador.getHp() > 0 && caoFeroz.getHp() > 0)
                                {
                                    caoFeroz.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && caoFeroz.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 4:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro vampiro = new Monstro("Vampiro", 18, 8, 8, 79, 28, 7);
                            while (jogador.getHp() > 0 && vampiro.getHp() > 0)
                            {
                                if (vampiro.getHp() > 0)
                                {
                                    jogador.atacar(vampiro);
                                }
                                if (jogador.getHp() > 0 && vampiro.getHp() > 0)
                                {
                                    vampiro.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && vampiro.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 5:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro lobisomem = new Monstro("Lobisomem", 40, 10, 20, 145, 42, 20);
                            while (jogador.getHp() > 0 && lobisomem.getHp() > 0)
                            {
                                if (lobisomem.getHp() > 0)
                                {
                                    jogador.atacar(lobisomem);
                                }
                                if (jogador.getHp() > 0 && lobisomem.getHp() > 0)
                                {
                                    lobisomem.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && lobisomem.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 6:
                            clean.limparComFor();
                            clean.clearConsole();
                            Monstro golem = new Monstro("Gólem", 20, 36, 4, 400, 82, 22);
                            while (jogador.getHp() > 0 && golem.getHp() > 0)
                            {
                                if (golem.getHp() > 0)
                                {
                                    jogador.atacar(golem);
                                }
                                if (jogador.getHp() > 0 && golem.getHp() > 0)
                                {
                                    golem.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && golem.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                            }
                            break;

                        case 7:
                            clean.limparComFor();
                            clean.clearConsole();
                            if (jogador.getNivel() >= 25)
                            {
                                Monstro megalodon = new Monstro("Megalodon", 112, 30, 16, 360, 142, 35);
                                while (jogador.getHp() > 0 && megalodon.getHp() > 0)
                                {
                                    if (megalodon.getHp() > 0)
                                {
                                    jogador.atacar(megalodon);
                                }
                                if (jogador.getHp() > 0 && megalodon.getHp() > 0)
                                {
                                    megalodon.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && megalodon.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor...\nBatalha finalizada!\n");
                                }
                                }
                            }
                            System.out.println("\nDesculpe seu nivel nao e suficiente\n");
                            break;

                        case 8:
                            clean.limparComFor();
                            clean.clearConsole();
                            if (jogador.getNivel() >= 35)
                            {
                                Monstro Manticora = new Monstro("Manticora", 442, 120, 50, 782, 350, 70);
                                while (jogador.getHp() > 0 && Manticora.getHp() > 0)
                                {
                                    if (Manticora.getHp() > 0)
                                {
                                    jogador.atacar(Manticora);
                                }
                                if (jogador.getHp() > 0 && Manticora.getHp() > 0)
                                {
                                    Manticora.atacar(jogador);
                                }
                                if (jogador.getHp() > 0 && Manticora.getHp() < 0){
                                    System.out.println("Ataque bonus do vencedor vencedor...\nBatalha finalizada!\n");
                                }
                                }
                            }
                            System.out.println("\nDesculpe seu nivel nao e suficiente\n");
                            break;

                        default:
                            System.out.println("Invalido!");
                            break;
                    }
                    System.out.println("Deseja voltar a selecao de monstros e tentar novamente?\nSIM: 1\nNAO: 2+");
                    batalhar = sc.nextInt();
                    clean.limparComFor();
                    clean.clearConsole();

                }

            }

            if (escolhaGeral == 2)
            {
                clean.limparComFor();
                clean.clearConsole();
                System.out.println(jogador.verStatusAtual() + "\n");
                System.out.println(jogador.xpRestanteParaProximoNivel() + "\n");
                System.out.println(jogador.getArmaduraFull() + "\n");
            }

            if (escolhaGeral == 3)
            {
                clean.limparComFor();
                clean.clearConsole();
                System.out.println("\nT===================================T\n"
                        + "Você esta na loja: "
                        + "\nT===================================T\n"
                        + "[ 1 ] Armaduras\n[ 2 ] Armas\n[ 3 ] Misc\n[ 4+ ] Sair\n"
                        + "T===================================T\n");
                int escolhaCompra = sc.nextInt();

                if (escolhaCompra == 1)
                {
                    clean.limparComFor();
                    clean.clearConsole();
                    System.out.println("[ 1 ] Elmo De Couro Reforcado | [PRECO: 12Gold] \n"
                            + "[ 2 ] Peitoral De Couro Reforcado | [PRECO: 20Gold] \n"
                            + "[ 3 ] Perneira De Couro Reforcado | [PRECO: 162Gold] \n"
                            + "[ 4 ] Bota De Couro Reforcado | [PRECO: 12Gold] \n");

                    System.out.println("[ 5 ] Elmo Escaravelho Dourado | [PRECO: 20Gold] \n"
                            + "[ 6 ] Peitoral Escaravelho Dourado | [PRECO: 45Gold] \n"
                            + "[ 7 ] Permeira Escaravelho Dourado | [PRECO: 38Gold] \n"
                            + "[ 8 ] Bota Escaravelho Dourado | [PRECO: 20Gold] \n");

                    System.out.printf("Digite o numero de qual peça deseja adquirir: ");
                    int compraArmadura = sc.nextInt();
                    clean.limparComFor();
                    clean.clearConsole();

                    switch (compraArmadura)
                    {
                        case 1:
                            loja.venderElmoCouroReforcado(jogador, inventario);
                            break;
                        case 2:
                            loja.venderPeitoralCouroReforcado(jogador, inventario);
                            break;
                        case 3:
                            loja.venderPerneirasCouroReforcado(jogador, inventario);
                            break;
                        case 4:
                            loja.venderBotasCouroReforcado(jogador, inventario);
                            break;
                        case 5:
                            loja.venderElmoEscaravelhoDourado(jogador, inventario);
                            break;
//                        case 6:
//                            loja.venderElmoCouroReforcado(jogador, inventario);
//                            break;
//                        case 7:
//                            loja.venderElmoCouroReforcado(jogador, inventario);
//                            break;
//                        case 8:
//                            loja.venderElmoCouroReforcado(jogador, inventario);
//                            break;

                        default:
                            System.out.println("Invalido!\n");
                    }
                }

                if (escolhaCompra == 2)
                {
                    clean.limparComFor();
                    clean.clearConsole();

                    // ARMAS
                }

                if (escolhaCompra == 3)
                {
                    clean.limparComFor();
                    clean.clearConsole();

                    // MISC
                }
            }

            if (escolhaGeral == 4)
            {
                clean.limparComFor();
                clean.clearConsole();
                System.out.println("Esses sao os itens que foram adquiridos durante toda a sua jornada:");
                inventario.percorrerEquipamentos();
                System.err.println("\nInventario somente para visualização...\n");

            }

        }

        sc.close();
    }
}
