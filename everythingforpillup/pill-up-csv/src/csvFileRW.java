import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;

/**
 * Created by thomas on 11/5/16.
 */
public class csvFileRW extends JFrame{
    private JPanel mainPanel;
    private JLabel IDLabel;
    private JLabel Monday;
    private JLabel Tuesday;
    private JLabel Wednesday;
    private JLabel Thursday;
    private JLabel Friday;
    private JLabel Saturday;
    private JLabel Sunday;
    private JComboBox<String> m7Select;
    private JComboBox<String> PatientNameSelectionBox;
    private JComboBox comboBox1;
    private JComboBox mHour;
    private JComboBox mMinute;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;

    private Patient patient1;
    private Patient patient2;
    private Patient patient3;
    private int patientChoice = 1;

    private final String[] typeMedication = {
            "yellow", "red", "blue"};

    public csvFileRW() {
        super("Patient Management");
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        m7Select = new JComboBox<String>(typeMedication);
        m7Select.setMaximumRowCount(3);
        m7Select.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        if(itemEvent.getStateChange() == ItemEvent.SELECTED) {
                            switch (patientChoice) {
                                case 1:
                                    patient1.setMedicationTypes(typeMedication[m7Select.getSelectedIndex()]);
                                    break;
                                case 2:
                                    patient2.setMedicationTypes(typeMedication[m7Select.getSelectedIndex()]);
                                    break;
                                case 3:
                                    patient3.setMedicationTypes(typeMedication[m7Select.getSelectedIndex()]);
                                    break;
                            }
                        }
                    }
                }
        );


        setVisible(true);

    }

    private void initializeData() {

    }
    private void getData(){

    }
    private void parseData() {

    }
}
