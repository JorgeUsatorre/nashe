package BlackJack;

import java.util.Scanner;


public class Apuestas {

    private int betAmount;
    private int playerBalance;

    // Constructor
    public Apuestas(int initialBalance) {
        this.playerBalance = initialBalance;
    }

    // Método para realizar la apuesta
    public void placeBet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Su saldo actual es de: " + playerBalance);
        System.out.print("Ingrese la cantidad que desea apostar: ");
        betAmount = input.nextInt();
        while (betAmount > playerBalance) {
            System.out.print("No tiene suficiente saldo para esa apuesta. Ingrese una cantidad menor: ");
            betAmount = input.nextInt();
        }

        playerBalance -= betAmount;

    }

    // Método para obtener la cantidad apostada
    public int getBetAmount() {
        return betAmount;
    }

    // Método para obtener el saldo actual del jugador
    public int getPlayerBalance() {
        return playerBalance;
    }
    public void win() {
        playerBalance += (betAmount * 2); // Se devuelve la apuesta más el doble de la apuesta original
    }

    public void push() {
        playerBalance += betAmount; // Se devuelve la apuesta original
    }

    public void lose() {
        // No se suma ni se resta nada, ya que el saldo del jugador ya fue ajustado durante la apuesta
    }
}

