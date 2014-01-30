package com.periskal.manageMaps;

public class Tile {

    private int leftNr;
    private int rightNr;
    private String name;
    
    public Tile(leftNr, rightNr, name) {
    	this.leftNr = leftNr;
    	this.rightNr = rightNr;
    	this.name = name;
    }
    
    public int getLeftNr() {
        return leftNr;
    }
    
    public void setLeftNr(int leftNr) {
        this.leftNr = leftNr;
     }
    
    public int getRightNr() {
        return rightNr;
    }
    
    public void setRightNr(int rightNr) {
        this.rightNr = rightNr;
     }

    public void setName(String name) {
       this.name = name;
    }

    public String getName() {
       return name;
    }
    
}
