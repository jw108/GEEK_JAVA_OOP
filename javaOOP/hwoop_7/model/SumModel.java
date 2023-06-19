package model;

public class SumModel extends CalcModel {
    
    // public SumModel() {
        
    // }

    @Override
    public ComplexNumber result() {
        double newReal = real1 + real2;
        double newImage = image1 + image2;
        ComplexNumber res = new ComplexNumber(newReal, newImage);
        return res;
    }

    @Override
    public void setComplexNumber1(ComplexNumber number) {
        real1 = number.real;
        image1 = number.image;
    }

    @Override
    public void setComplexNumber2(ComplexNumber number) {
        real2 = number.real;
        image2 = number.image;
    }

}
