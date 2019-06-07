package spring.hero.bank;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class editStage extends Stage {

    private String accountName = "xuanhung";
    private int accountBalance = 50000;

    private GridPane gridPane;
    private Label labelUsername;
    private Label labelPassword;
    private TextField txtUsername;
    private PasswordField pwdField;
    private Label lblBalance;
    private Label lblBalanceValue;
    private Label labelEmail;
    private TextField txtEmail;
    private Label labelPhone;
    private TextField txtPhone;
    private Button btnSave;
    private Button btnCancel;

    public editStage(int i, MainApplication mainApplication) {
        initComponent();
    }

    private void initComponent(){
        this.gridPane = new GridPane();

        this.labelUsername = new Label(this.accountName);
        this.labelPassword = new Label("Password");
        this.lblBalance = new Label("Balance");
        this.labelEmail = new Label("Email");
        this.labelPhone = new Label("Phone");
        this.txtUsername = new TextField();
        this.pwdField = new PasswordField();
        this.lblBalanceValue = new Label(String.valueOf(this.accountBalance));
        this.txtEmail= new TextField();
        this.txtPhone= new TextField();
        this.btnSave = new Button("Save");
        this.btnCancel = new Button("Cancel");

        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
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
        gridPane.add(lblBalance,0,2);
        gridPane.add(lblBalanceValue,1,2);
        gridPane.add(labelEmail,0,3);
        gridPane.add(txtEmail,1,3);
        gridPane.add(labelPhone,0,4);
        gridPane.add(txtPhone,1,4);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnSave, btnCancel);
        hBox.setSpacing(10);
        gridPane.add(hBox, 1, 5);
        Scene scene = new Scene(gridPane, 600, 300);
        this.setScene(scene);
    }
}
