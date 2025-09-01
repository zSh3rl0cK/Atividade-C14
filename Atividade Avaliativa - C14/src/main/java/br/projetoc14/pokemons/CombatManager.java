package br.projetoc14.pokemons;
import br.projetoc14.trainers.Trainer;
import java.util.Random;
import java.util.Scanner;
import static br.projetoc14.front.Cores.*;

public abstract class CombatManager {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void iniciarBatalha(Trainer jogador, Trainer oponente) {
        System.out.println(ANSI_BLUE + "\n--- A batalha Pokémon começou! ---" + ANSI_RESET);

        Pokemon ativoJogador = jogador.escolherPokemonInicial();
        Pokemon ativoOponente = oponente.escolherPokemonInicial();

        int turno = 1;
        boolean batalha = true;

        while (batalha) {
            System.out.println(ANSI_BLUE + "\n--- Turno " + turno + " ---" + ANSI_RESET);

            // Jogador escolhe ação
            if (ativoJogador.getHp() > 0) {
                executarTurnoJogador(ativoJogador, ativoOponente);
            }

            // Verifica se o oponente foi derrotado
            if (ativoOponente.getHp() <= 0) {
                System.out.println(ANSI_GREEN + ativoOponente.getName() + " desmaiou!" + ANSI_RESET);
                ativoOponente = oponente.escolherProximoPokemon();
                if (ativoOponente == null) {
                    System.out.println(ANSI_GREEN + "Você venceu a batalha!" + ANSI_RESET);
                    batalha = false;
                    break;
                }
            }

            // Oponente age
            if (ativoOponente.getHp() > 0) {
                executarTurnoOponente(ativoOponente, ativoJogador);
            }

            // Verifica se o jogador foi derrotado
            if (ativoJogador.getHp() <= 0) {
                System.out.println(ANSI_RED + ativoJogador.getName() + " desmaiou!" + ANSI_RESET);
                ativoJogador = jogador.escolherProximoPokemon();
                if (ativoJogador == null) {
                    System.out.println(ANSI_RED + "Você perdeu a batalha!" + ANSI_RESET);
                    batalha = false;
                    break;
                }
            }

            turno++;
        }

        System.out.println(ANSI_BLUE + "--- Batalha Encerrada ---" + ANSI_RESET);
    }

    private static void executarTurnoJogador(Pokemon atacante, Pokemon defensor) {
        System.out.println(ANSI_CYAN + "\nÉ a vez de " + atacante.getName() + "!" + ANSI_RESET);
        System.out.println("Escolha uma ação:");
        System.out.println("1 - Usar golpe básico");
        System.out.println("2 - Usar habilidade especial");

        String escolha = scanner.nextLine();
        boolean usarHabilidade = escolha.equals("2");

        atacante.atacar(defensor, usarHabilidade);
    }

    private static void executarTurnoOponente(Pokemon atacante, Pokemon defensor) {
        System.out.println(ANSI_PURPLE + "\nÉ a vez de " + atacante.getName() + " (oponente)!" + ANSI_RESET);
        boolean usarHabilidade = random.nextBoolean();

        atacante.atacar(defensor, usarHabilidade);
    }
}
