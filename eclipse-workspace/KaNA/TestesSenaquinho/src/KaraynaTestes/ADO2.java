package KaraynaTestes;

import java.util.Scanner;

public class ADO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = 100, energia = 100, xp = 50;

        while (hp > 0) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.println("\nInstruções:");
                System.out.println("Explore para ganhar experiência ( +20 XP ).");
                System.out.println("Descanse para recuperar energia e HP.");
                System.out.println("Cuidado! Explorar custa -10 HP.");
                System.out.println("Se seu HP chegar a 0, você morre e o jogo acaba.");
            }
            else if (op == 2) {
                boolean jogando = true;
                while (jogando && hp > 0) {
                    System.out.println("\n--- O QUE FAZER? ---");
                    System.out.println("HP: " + hp + " | Energia: " + energia + " | Experiência: " + xp);
                    System.out.println("1 - Explorar");
                    System.out.println("2 - Descansar");
                    System.out.println("3 - Voltar");
                    System.out.print("Escolha: ");
                    int acao = sc.nextInt();

                    if (acao == 1) {
                        System.out.println("\nVocê saiu explorando...");
                        hp -= 10;      // Nova regra
                        xp += 20;      // Nova regra
                        System.out.println("-10 HP | +20 XP");
                    }
                    else if (acao == 2) {
                        System.out.println("\nVocê descansou...");
                        energia += 30;
                        hp += 15;
                        if (energia > 100) energia = 100;
                        if (hp > 100) hp = 100;
                        System.out.println("Recuperou um pouco de HP e energia.");
                    }
                    else if (acao == 3) {
                        jogando = false;
                        System.out.println("Voltando ao menu principal...");
                    }

                    if (hp <= 0) {
                        System.out.println("\nSeu HP chegou a 0...");
                        System.out.println("Você morreu... Fim de jogo!");
                    }
                }
            }
            else if (op == 3) {
                System.out.println("\nCréditos:");
                System.out.println("OBRIGADO POR JOGAR NOSSO JOGO");
            }
            else if (op == 4) {
                System.out.println("\nAté a próxima");
                break;
            }
        }

        sc.close();
    }
}
