import javax.swing.*;
import java .awt.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class paneldeControlTojpanel extends JFrame
{
    private JTextField nombre,apellido;
    private JButton guardar;
    private JButton añonacido;
    {
    setLayout(null);
    guardar = new JButton("Guardar");
    guardar.setBounds(50,210,200,45);
    add(guardar);
    nombre = new JTextField();
    apellido = new JTextField();
    nombre.setBounds(50, 50, 200, 60);
    apellido.setBounds(50, 150, 200, 60);
    add(nombre);
    add(apellido);
    add(añonacido);
    }
}    
