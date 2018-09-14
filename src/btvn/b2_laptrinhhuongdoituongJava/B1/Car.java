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
public abstract class Car extends Vehicle {

    @Override
    public abstract void move(int x, int y);

    @Override
    public void setSize(int width, int height) {
        System.out.println("Method [setSize] from class [Car]");
    }

    @Override
    public void setColor(Color color) {
        System.out.println("Method [setColor] from class [Car]");
    }

}
