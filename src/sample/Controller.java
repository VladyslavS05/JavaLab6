package sample;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btn=new Button();
    @FXML
    private TextField textFieldR =new TextField();
    @FXML
    private TextField textFieldH =new TextField();
    @FXML
    private Label label =new Label();
    @FXML
    private Label label_2=new Label();
    @FXML
    private Button btn_2=new Button();
    @FXML
    private TextField textFieldAge =new TextField();


    public void click_first(ActionEvent e)
    {
        try
        {
            double V= Math.PI * Math.pow(Double.valueOf(textFieldR.getText()), 2) * Double.valueOf(textFieldH.getText());
            double S= 2 * Math.PI * Double.valueOf(textFieldR.getText()) * Double.valueOf(textFieldH.getText());
            label.setText("Об'єм V: "+Math.round(V) + "\nПлоща бічної поверхні S: " + Math.round(S)); //label.setText("S: "+S);
            JOptionPane.showMessageDialog(null,"Об'єм V: "+Math.round(V) + "\nПлоща бічної поверхні S: " + Math.round(S));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Сталася помилка: "+ex.getMessage());
        }

    }

    public void click_second(ActionEvent ex)
    {
        try
        {
            int age=Integer.valueOf(textFieldAge.getText());
            switch((1 <= age && age <= 10) ? 1 :
                    (11 <= age && age <= 15) ? 2 :
                            (16 <= age && age <= 20) ? 3 :
                                    (21 <= age && age <= 30) ? 4 :
                                            (31 <= age && age <= 100) ? 5 : 6) {
                case 1: label_2.setText("Ви дитина!");JOptionPane.showMessageDialog(null, "Ви дитина!");;break;
                case 2: label_2.setText("Ви підліток!");JOptionPane.showMessageDialog(null,"Ви підліток!"); ;break;
                case 3: label_2.setText("Ви юнак!");JOptionPane.showMessageDialog(null,"Ви юнак!"); break;
                case 4: label_2.setText("Ви молода людина!");JOptionPane.showMessageDialog(null, "Ви молода людина!");break;
                case 5: label_2.setText("Ви доросла людина!");JOptionPane.showMessageDialog(null,"Ви доросла людина!"); break;
                case 6: label_2.setText("Неправильно введений вік!");JOptionPane.showMessageDialog(null,"Неправильно введений вік!"); break;
            }
        }
        catch(Exception e) {JOptionPane.showMessageDialog(null, "Сталася помилка: "+e);}

    }
}
