package jacademy;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.HashMap;
import java.util.Map;


public class Controller {
    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private TextArea textArea;
    private Map<String,String> userLoginPassword;



    public void initialize() {
        userLoginPassword = new HashMap<>();
        userLoginPassword.put("Sroczyk","Krzysiek");
        userLoginPassword.put("Dzioba","Krzysiek");
        userLoginPassword.put("Harenczyk","Adrian");
        userLoginPassword.put("Sadkowski","Szymon");
        userLoginPassword.put("Jakubowski","Przemek");
        userLoginPassword.put("Kosmider","Bartek");
        userLoginPassword.put("Jaszczynski","Rafal");
        userLoginPassword.put("Pedlewska","Agnieszka");
        userLoginPassword.put("Seidler","Tomasz");
        userLoginPassword.put("Muca","Damian");
        userLoginPassword.put("Slaby","Jaroslaw");
        userLoginPassword.put("Gargas","Asia");
        userLoginPassword.put("Gacik","Kuba");

    }

    @FXML
    private void submit() {
        if (password.getText().equalsIgnoreCase("java")) {
            String name = userLoginPassword.get(login.getText());
            textArea.setText("Masz na imię "+name+"?");
        } else {
            textArea.setText("Podaj swoje nazwisko bez polskich znaków jako login i hasło.");
        }
    }



}
