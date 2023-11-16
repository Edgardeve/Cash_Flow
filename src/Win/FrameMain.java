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
public class FrameMain extends JFrame{
    private static final int ANCHOF = 800,ALTOF = 600;
    
    public FrameMain ()
    {
        super("Cash Flow");
        setResizable(false);
        setLocation(400,200);
        Titulo tit = new Titulo();

        BorderLayout bord = new BorderLayout(25,25);
        JButton bot1 = new JButton("Comenzar");
        bot1.setBounds(235,110,160,20);
        add(bot1);
        add(tit,bord.CENTER);
        setSize(ANCHOF,ALTOF);
    }
    
    

}
