/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B1;

import java.awt.Color;

/**
 *
 * @author kien vu
 */
public class Boat extends Vehicle{

    @Override
    public void move(int x, int y) {
        System.out.println("Method [move] from class [Boat]");
    }

    @Override
    public void setSize(int width, int height) {
        System.out.println("Method [setSize] from class [Boat]");
    }

    @Override
    public void setColor(Color color) {
        System.out.println("Method [setColor] from class [Boat]");
    }
    
}
