package main.it.sevenbits;

import java.lang.Math;


public class Section {
    // Can I use something like a list here? It makes sense?
    private int x1;
    private int y1;
    private int z1;

    private int x2;
    private int y2;
    private int z2;

    public Section(){
    }

    public Section(Point p1, Point p2){
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.z1 = p1.getZ();

        this.x2 = p2.getX();
        this.y2 = p2.getY();
        this.z2 = p2.getZ();
    }

    // I didn't understand where to use Math.abs()
    public double getLength(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }
}
