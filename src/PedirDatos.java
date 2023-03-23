

import javax.swing.JOptionPane;

public class PedirDatos {
    public PedirDatos() {
    }

    public static byte pedirByte(String mensaxe) {
        return Byte.parseByte(JOptionPane.showInputDialog(mensaxe));
    }

    public static short pedirShort(String mensaxe) {
        return Short.parseShort(JOptionPane.showInputDialog(mensaxe));
    }

    public static int pedirInt(String mensaxe) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static long pedirLong(String mensaxe) {
        return Long.parseLong(JOptionPane.showInputDialog(mensaxe));
    }

    public static float pedirFloat(String mensaxe) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }

    public static double pedirDouble(String mensaxe) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
    }

    public static String pedirString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }
}
