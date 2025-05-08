package org.example;

public abstract class Animal {
    private String color;
    private String eye;
    public abstract String attack();
    public abstract String move();
    public abstract String run();
    public abstract String fly();


    // lay ve thong tin color => ban chat la read color
    public String getColor() {
        return color;
    }
    // ghi du lieu vao bien color => ban chat la write color
    public void setColor(String color) {
        this.color = color;
    }


    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }
}
