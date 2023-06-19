package model;

public class ComplexNumber {

    protected double real;
    protected double image;
    
    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

}
