/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphred.shapes;

import java.util.ArrayList;

/**
 *
 * @author George
 */
public class Line extends BaseShape{
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    
    public void addCoordinate(int x, int y){
        this.x.add(x);
        this.y.add(y);
    }
    
}
