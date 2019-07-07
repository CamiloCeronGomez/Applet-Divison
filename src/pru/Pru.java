/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pru;

/**
 *
 * @author camilo
 */

import java.awt.*; 
import java.applet.*; 
// <applet width="200" height="200" code="Pru"></applet> 
public class Pru extends Applet {
public void paint(Graphics g) { 
    int x; 
    float y;
    x = 2 / 3; 
    g.drawString("2 / 3 = "+x, 100, 100); 
    
    y = (float) (2/3.0);
    g.drawString("2.0 / 3.0 ="+y , 200, 200);
    
} 
}