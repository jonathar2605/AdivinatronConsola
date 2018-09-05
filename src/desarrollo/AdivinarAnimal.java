package desarrollo;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class AdivinarAnimal {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Bienvenid@ "+ nombre + " Por favor piense en uno de estos animales"
                + "\n1. Loro\n2. Aguila\n3. Perro\n4. Tigre\n5. Pez\n6. Tiburón", "Pensar en un animal", 
                JOptionPane.INFORMATION_MESSAGE);
        String[] opcion = {"Si", "No"};
        Icon icon = null;
        
        int domestico = JOptionPane.showOptionDialog(null, "¿Su animal es doméstico?", "Adivinar Animal", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opcion, opcion[0]);
        
        if (domestico == 0) {
            int pelo = JOptionPane.showOptionDialog(null, "¿Su animal tiene pelos?", "Adivinar Animal", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opcion, opcion[0]);
            
            if (pelo == 0) {
                int pelo1 = JOptionPane.showOptionDialog(null, "¿Su animal es doméstico?", "Adivinar Animal", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opcion, opcion[0]);
            }else{
            }
        }else{
            int salvaje = JOptionPane.showOptionDialog(null, "¿Su animal es salvaje?", "Adivinar Animal", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opcion, opcion[0]);
        }

    }

}
