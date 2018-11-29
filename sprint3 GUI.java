package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Main extends Application {
	//Initialize tabs
	TabPane tp = new TabPane();
	BorderPane brdPane = new BorderPane();
	
	int height = 1000;
	int length = 250;

	// define all GUI controls as data fields
	Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnExponent, btnLoad;
	Label lbl1, lbl2, lbl3;
	TextField txfValue1, txfValue2;
	TextArea txa;
	TabPane tabs;

	Scene scene1, scene2, scene3;
	GridPane gp1, gp2;

	//Runs the GUI
		public static void main(String[] args) {
			launch(args);
		}

	@Override
	public void start(Stage primaryStage) {
		Pane grdRootPane = buildGuiPane();

        //Page 1
		Tab memTab = new Tab();		
			gp1 = new GridPane();
			gp1.setHgap(10);
			gp1.setVgap(10);
			
			scene1 = new Scene(gp1, 240, 100);

			//Text Field
			TextField txf1 = new TextField();
			
			//Button1
			Button b1 = new Button("Create Account");
			
			gp1.add(b1, 1, 0, 2, 1);
			gp1.add(txf1, 0, 0);
			
		//Page 2
		Tab groupTab = new Tab();
			gp2 = new GridPane();
			gp2.setHgap(10);
			gp2.setVgap(10);
			
			scene2 = new Scene(grdRootPane, 240, 100);
			
		tabs.getTabs().addAll(memTab, groupTab);
			
		primaryStage.

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Title here");
        primaryStage.show();

/*
		Scene scene = new Scene(grdRootPane,475, 275);
		primaryStage.setScene(scene);
		primaryStage.setTitle("MyLittleCalculator");
		*/
		primaryStage.show();
	}

	
	private Pane buildGuiPane() {
		//Create all necessary buttons and text fields/areas
		btnAdd = new Button("add");
		btnSubtract = new Button("subtract");
		btnMultiply= new Button("multiply");
		btnDivide = new Button("divide");
		btnLoad = new Button("load");
		btnExponent = new Button("exp");
		lbl1 = new Label("Operand 1: ");
		lbl2 = new Label("Operand 2: ");
		lbl3 = new Label("Result: ");
		txfValue1 = new TextField();
		txfValue2 = new TextField();
		txa = new TextArea();
		txa.setEditable(false);
		txa.setPrefColumnCount(30);
		txa.setPrefRowCount(5);
		//We use gridPane1 to implement the first row of the calculator
		GridPane gridPane1 = new GridPane();
		gridPane1.setAlignment(Pos.CENTER);
		gridPane1.setHgap(200);
		gridPane1.setVgap(5);
		gridPane1.add(lbl1, 0, 0);
		gridPane1.add(lbl2, 0, 1);
		gridPane1.add(txfValue1, 1, 0);
		gridPane1.add(txfValue2, 1, 1);
		//We use gridPane2 to implement the second row of the calculator
		GridPane gridPane2 = new GridPane();
		gridPane2.setAlignment(Pos.CENTER);
		gridPane2.setHgap(20);
		//Add GUI controls to gridPane2
		gridPane2.add(btnAdd, 0, 0);
		gridPane2.add(btnSubtract, 1, 0);
		gridPane2.add(btnMultiply, 2, 0);
		gridPane2.add(btnDivide, 3, 0);
		gridPane2.add(btnLoad, 4, 0);
		gridPane2.add(btnExponent, 5, 0);
		//We use gridPane3 to implement the last row of the calculator
		GridPane gridPane3 = new GridPane();
		gridPane3.setAlignment(Pos.CENTER);
		gridPane3.setHgap(10);
		//Add GUI controls to gridPane3
		gridPane3.add(lbl3, 0, 0);
		gridPane3.add(txa, 1, 0);
		// We create our top-level pane here.
		GridPane topPane = new GridPane();
		topPane.setAlignment(Pos.CENTER);
		topPane.setVgap(20);
		//Here we add gridPane1, gridPane2 and gridPane3 to our topPane, which is our final layout
		topPane.add(gridPane1, 0, 0);
		topPane.add(gridPane2, 0, 1);
		topPane.add(gridPane3, 0, 2);
		//Register all the buttons to the same event handler function named "calculate"
		btnAdd.setOnAction(e -> {calculate(e);});
		btnSubtract.setOnAction(e -> {calculate(e);});
		btnMultiply.setOnAction(e -> {calculate(e);});
		btnDivide.setOnAction(e -> {calculate(e);});
		btnLoad.setOnAction(e -> {calculate(e);});
		btnExponent.setOnAction(e -> {calculate(e);});
		return topPane;
	}
	//Method used to execute actions for respective buttons
	public void calculate(ActionEvent e){
		double num1 = Double.parseDouble(txfValue1.getText());
		double num2 = Double.parseDouble(txfValue2.getText());
		double tot = 0;
		//Implements the button-clicking event handler
		if(e.getSource() == btnAdd){
			tot = num1 + num2;
			txa.setText(String.format("%.2f", tot));
		}
		else if(e.getSource() == btnSubtract){
			tot = num1 - num2;
			txa.setText(String.format("%.2f", tot));
		}
		else if(e.getSource() == btnMultiply){
			tot = num1 * num2;
			txa.setText(String.format("%.2f", tot));
		}
		else if(e.getSource() == btnDivide){
			tot = num1 / num2;
			txa.setText(String.format("%.2f", tot));
		}
		else if(e.getSource() == btnLoad){
			txfValue1.setText(txa.getText());
			txa.setText(null);
		}
		else if(e.getSource() == btnExponent){
			tot = Math.pow(num1, num2);
			txa.setText(String.format("%.2f", tot));
		}
	}
	

}
