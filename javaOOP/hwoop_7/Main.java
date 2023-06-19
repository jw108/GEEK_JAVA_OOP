import java.util.Scanner;
import model.MultiplicationModel;
import model.SubtractionModel;
import model.SumModel;
import presenter.Presenter;
import view.View;

/**
 * Создать проект калькулятора комплексных чисел
 * (достаточно сделать сложение, умножение и деление).
 * Применить при создании программы архитектурные паттерны,
 * добавить логирование калькулятора.
 * Соблюдать принципы SOLID, паттерны проектирования.
 */
public class Main {
    public static void main(String[] args) {
       
        System.out.println("\nВведите цифру, соответствующую дейтствию, которое" +
        " вы хотите выполнить с двумя комплексными числами:" + 
        "\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n0 - выход из программы");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int chois = scanner.nextInt();
            switch (chois) {
                case 1:
                    Presenter s = new Presenter(new SumModel(), new View());
                    s.startCalc();
                    flag = false;
                    break;
                case 2:
                    Presenter p = new Presenter(new SubtractionModel(), new View());
                    p.startCalc();
                    flag = false;
                    break;
                case 3:
                    Presenter r = new Presenter(new MultiplicationModel(), new View());
                    r.startCalc();
                    flag = false;
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    break;
                
            }

        }
        scanner.close();
        
    }
    
}