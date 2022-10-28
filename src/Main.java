//Xinyi Wu
//Section: 08
//Lab 6
//this project is using GUI to allow users input the three attributes and calculate them by the end
import javax.swing.*;



public class Main {
    public static void main(String[] args) {

        GraphicWeight graphic = new GraphicWeight();
        WeightGrade grade = new WeightGrade();
        JFrame frame = new JFrame("Weight Calculator");
        frame.setSize(600, 430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);
        graphic.placeComponents(panel);
        frame.setVisible(true);


    }


}
