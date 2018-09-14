/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B1;

/**
 *
 * @author kien vu
 */
public class Ferrary extends Car{

    @Override
    public void move(int x, int y) {
        System.out.println("Method [move] from class [Ferrary]");
    }
    
    @Override
    public void setSize(int width, int height){
        System.out.println("Method [setSize] from class [Ferrary]");
    }
    
    public void moveRelative(int x, int y){
        System.out.println("Method [moveRelative] from class [Ferrary]");
    }
}
