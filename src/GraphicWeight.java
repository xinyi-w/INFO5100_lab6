import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicWeight extends JFrame{

    public void placeComponents(JPanel panel){
        WeightGrade grade = new WeightGrade();
        panel.setLayout(null);
        //get the total grade input from users
        JLabel totalPointsLabel = new JLabel("Enter the total points: ");
        totalPointsLabel.setBounds(10,20,180,25);
        panel.add(totalPointsLabel);

        JTextField totalPointsText = new JTextField(20);
        totalPointsText.setBounds(150,20,165,25);
        panel.add(totalPointsText);


        //get the earned points from users
        JLabel earnedPointsLabel = new JLabel("Enter the earned points: ");
        earnedPointsLabel.setBounds(10,60,180,25);
        panel.add(earnedPointsLabel);

        JTextField earnedPointsText = new JTextField(20);
        earnedPointsText.setBounds(170,60,165,25);
        panel.add(earnedPointsText);


        //get the assignment percent input from user
        JLabel assignmentPercentLabel = new JLabel("Enter the assignment percentage: ");
        assignmentPercentLabel.setBounds(10,100,220,25);
        panel.add(assignmentPercentLabel);

        JTextField assignmentPercentText = new JTextField(20);
        assignmentPercentText.setBounds(230,100,165,25);
        panel.add(assignmentPercentText);

        //button for user to click for calculation

        JButton clickButton = new JButton("click to Calculate Score");
        clickButton.setBounds(10, 140, 180, 25);
        panel.add(clickButton);



        JLabel totalGradeLabel = new JLabel("Weight Score");
        totalGradeLabel.setBounds(10,180,180,25);
        panel.add(totalGradeLabel);

        //showing the result
        JLabel resultText = new JLabel();
        resultText.setBounds(100,180,165,25);

        panel.add(resultText);

        clickButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                grade.setPointTotal(Double.valueOf(totalPointsText.getText()).doubleValue());
                grade.setEarnedPoints(Double.valueOf(earnedPointsText.getText()).doubleValue());
                grade.setAssignmentPercent(Double.valueOf(assignmentPercentText.getText()).doubleValue());
                grade.getTotalGrade();
                resultText.setText(String.valueOf(grade.getTotalGrade()));
            }

        });


        ;

    }


}
