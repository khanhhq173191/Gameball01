package game.obj;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BIG CAT
 */
public class Player {
    public int X;
    public int Y;
   
    public Player(final int x, final int y) {
        this.X = x;
        this.Y = y;
    }

    public void draw(final Graphics g) {

    }

    public void setX(final int playX) {
        this.X = playX;
    }

    public void setY(final int playY) {
        this.Y = playY;
    }
}
