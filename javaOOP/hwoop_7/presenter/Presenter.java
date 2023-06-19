package presenter;

import model.ComplexNumber;
import model.Model;
import view.View;

public class Presenter {
    
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void startCalc() {
        double r1 = view.getValue("Введите вещественную часть первого комплексного числа: ");
        double i1 = view.getValue("Введите мнимую часть первого комплексного числа: ");
        double r2 = view.getValue("Введите вещественную часть второго комплексного числа: ");
        double i2 = view.getValue("Введите мнимую часть второго комплексного числа: ");
        ComplexNumber num1 = new ComplexNumber(r1, i1);
        ComplexNumber num2 = new ComplexNumber(r2, i2);

        model.setComplexNumber1(num1);
        model.setComplexNumber2(num2);

        ComplexNumber result = model.result();
        view.print(result, "Ответ: ");

    }

}
