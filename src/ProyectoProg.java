import BlackJack.Apuestas;
import BlackJack.Cartas;
import BlackJack.Mano;
import BlackJack.Mazo;
import Usuarios.Manual;
import Usuarios.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;


public class ProyectoProg {


    public static void main(String[] args) throws IOException {

        Manual obj = new Manual();
        obj.manual();

        File obxf = new File("fichero.txt");
        Usuario obxU = new Usuario();

        Apuestas game = new Apuestas(10000); // Creamos un juego con un saldo inicial de $10000

        double num=0;
        obxU.nombreUsuario(obxf);


        do{
            Mazo d = new Mazo();
            d.crearCartas();

            Mano cartaOponente = new Mano();
            Mano cartaPropias = new Mano();


            game.placeBet(); // Realizamos una apuesta
            System.out.println("Cantidad apostada: " + game.getBetAmount());



            cartaOponente.añadirCarta(d.getCartas());
            cartaOponente.añadirCarta(d.getCartas());

            cartaPropias.añadirCarta(d.getCartas());
            cartaPropias.añadirCarta(d.getCartas());

            while (cartaOponente.getValue() <= 17) {
                cartaOponente.añadirCarta(d.getCartas());
            }

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);


            System.out.println("Tus cartas " + cartaPropias.toString() + "La suma de tus cartas son: " + cartaPropias.getValue());
            System.out.println("Que deseas hacer otra[o] carta o plantarse[p]");

            String teclado = "";
            while ((teclado = br.readLine()) != null) {

                if (teclado.equalsIgnoreCase("o")) {
                    cartaPropias.añadirCarta(d.getCartas());
                    System.out.println("Tus cartas son " + cartaPropias.toString() + "La suma de tus cartas son: " + cartaPropias.getValue());
                } else break;

            }

            System.out.println("Las cartas del crupier son " + cartaOponente.toString() + "Las cartas del crupier " + cartaOponente.getValue());


            if (cartaOponente.getValue() < cartaPropias.getValue() && cartaPropias.getValue() <= 21) {
                System.out.println("Ganaste");
            } else if (cartaOponente.getValue() > cartaPropias.getValue() && cartaOponente.getValue() <= 21)
                System.out.println("Perdiste");
            else if(cartaOponente.getValue()>=22)
                System.out.println("Ganaste");



            num = Double.parseDouble(JOptionPane.showInputDialog("¿Quieres seguir jugando?" ));

        }while(num != 0);


    }
}
