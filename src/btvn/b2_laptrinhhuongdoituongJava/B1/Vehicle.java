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
public abstract class Vehicle {

    public abstract void move(int x, int y);

    public abstract void setSize(int width, int height);

    public abstract void setColor(Color color);
}
