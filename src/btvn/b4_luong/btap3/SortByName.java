/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong.btap3;

import java.util.Comparator;

/**
 *
 * @author kien vu
 */
public class SortByName implements Comparator<User>{

    @Override
    public int compare(User t, User t1) {
        return t.getUser().compareToIgnoreCase(t1.getUser());
    } 
}
