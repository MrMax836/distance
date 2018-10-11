package main.it.sevenbits;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(){
    }

    public Point(int _x, int _y, int _z){
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }

    // I don't know if this is needed
    public Point(int _x, int _y){
        this.x = _x;
        this.y = _y;
        this.z = 0;
    }

    public Point(int _x){
        this.x = _x;
        this.y = 0;
        this.z = 0;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }
}
