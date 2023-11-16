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
public class Titulo extends JPanel{
    
    public Titulo ()
    {
        setSize(400,300);
    }
        public void paint(Graphics g){
        Font tipoLetra = new Font("Serif",Font.BOLD,18);
        g.setFont(tipoLetra);
        g.drawString("Cash Flow", 160, 80);
        g.fillOval(160,80, 80 + 225, 80);
    }
}
