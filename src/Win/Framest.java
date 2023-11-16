/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Win;
import javax.swing.*; 
import java.awt.*;

/**
 *
 * @author edgar
 */
public class Framest extends JFrame{
    private static final int ANCHOF = 800,ALTOF = 600;
    private JPanel p0,p1,p2,p3;
    public Framest()
    {
        super("Cash Flow");
        setResizable(false);
        setLocation(400,200);
        setLayout(new GridLayout(2,2,25,25));
        p0 = new JPanel();
        p0.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        JTextField text = new JTextField("Ingreso ");
        text.setColumns(ALLBITS);
        text.setEditable(true);
        p0.add(text);
        p0.add(new JButton("Guardar"));
        String [] opc = {"Nomina", "Pasivo", " Extra"}; 
        p1.add(new JLabel ("Tipo de ingreso", JLabel.RIGHT));
        p1.add(new JList(opc));
        p2.add(new JCheckBox("Box ",false));
        p2.add(new JLabel ("Calendario", JLabel.CENTER)); 
        p2.add(new JRadioButton("Bot Radio", true)); 
        add(p0);
        add(p1);
        add(p2);
        setSize(800,600);

    }
}
