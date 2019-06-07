package spring.hero.bank;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class RegisterStage extends Stage {

    private GridPane gridPane;
    private Label labelUsername;
    private Label labelPassword;
    private TextField txtUsername;
    private PasswordField pwdField;
    private Label confirmPwd;
    private PasswordField pwdConfirm;

    private Button btnRegister;
    private Button btnReset;

    public RegisterStage(int i, MainApplication mainApplication) {
        initComponent();
    }

    private void initComponent() {
        this.gridPane = new GridPane();
        this.labelUsername = new Label("Username");
        this.labelPassword = new Label("Password");
        this.confirmPwd = new Label("Confirm password");
        this.txtUsername = new TextField();
        this.pwdField = new PasswordField();
        this.pwdConfirm= new PasswordField();
        this.btnRegister = new Button("Register");
        this.btnReset = new Button("Reset");
        btnRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (txtUsername.getText().isEmpty()){
                }
            }
        });
        btnReset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                txtUsername.clear();
                pwdField.clear();
                pwdConfirm.clear();
            }
        });
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(labelUsername, 0, 0);
        gridPane.add(txtUsername, 1, 0);
        gridPane.add(labelPassword, 0, 1);
        gridPane.add(pwdField, 1, 1);
        gridPane.add(confirmPwd,0,2);
        gridPane.add(pwdConfirm,1,2);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnRegister, btnReset);
        hBox.setSpacing(10);
        gridPane.add(hBox, 1, 3);
        Scene scene = new Scene(gridPane, 600, 300);
        this.setScene(scene);
    }



}

