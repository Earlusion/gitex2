package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Main extends Application {
	Scene scene1, scene2, scene3, scene4;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Some Random Ass Website Forum");

		//Member Page
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(10, 10, 10, 10));

		Button home1 = new Button("Home");
		home1.setOnAction(e -> primaryStage.setScene(scene1));

		Label title= new Label("Welcome New Members!");
		title.setFont(new Font("Comic Sans", 46));
		gp.add(title, 1, 0);

		Label fnameTxt = new Label("First Name: ");
		TextField fname = new TextField();
		fname.setMaxWidth(150);
		gp.add(fnameTxt, 0, 1, 1, 1);
		gp.add(fname, 1, 1, 1, 1);

		Label lnameTxt = new Label("Last Name: ");
		TextField lname = new TextField();
		lname.setMaxWidth(150);
		gp.add(lnameTxt, 0, 2, 1, 1);
		gp.add(lname, 1, 2, 1, 1);

		Label screenNameTxt = new Label("Screen Name: ");
		TextField screenName = new TextField();
		screenName.setMaxWidth(150);
		gp.add(screenNameTxt, 0, 3, 1, 1);
		gp.add(screenName, 1, 3, 1, 1);

		Label emailTxt = new Label("Email Address: ");
		TextField email = new TextField();
		email.setMaxWidth(250);
		gp.add(emailTxt, 0, 4, 1, 1);
		gp.add(email, 1, 4, 1, 1);

		Button button1 = new Button("Create Account");
		gp.add(button1, 1, 5);
		gp.add(home1, 0, 0);

		button1.setOnAction(e -> primaryStage.setScene(scene2));

		scene1= new Scene(gp, 750, 1000);


		//Group Page
		GridPane gp2 = new GridPane();
		gp2.setHgap(10);
		gp2.setVgap(10);
		gp2.setPadding(new Insets(10, 10, 10, 10));

		Label title2= new Label("Create New Group");
		title2.setFont(new Font("Comic Sans", 32));
		gp2.add(title2, 1, 0);

		Label gTitleTxt = new Label("Group Title: ");
		TextField gTitle = new TextField();
		fname.setMaxWidth(150);
		gp2.add(gTitleTxt, 0, 1, 1, 1);
		gp2.add(gTitle, 1, 1, 1, 1);

		Label descTxt = new Label("Description: ");
		TextArea desc = new TextArea();
		lname.setMaxWidth(150);
		gp2.add(descTxt, 0, 2, 1, 1);
		gp2.add(desc, 1, 2, 1, 1);

		Button button2= new Button("Create Group");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		gp2.add(button2, 1, 4);

		Button button3= new Button("Posts Page");
		button3.setOnAction(e -> primaryStage.setScene(scene3));

		Button home2 = new Button("Home");
		home2.setOnAction(e -> primaryStage.setScene(scene1));

		gp2.add(button3, 1, 7);
		gp2.add(home2, 0, 0);

		scene2= new Scene(gp2, 750, 1000);

		//Posts Page
		GridPane gp3 = new GridPane();
		gp3.setHgap(10);
		gp3.setVgap(10);
		gp3.setPadding(new Insets(10, 10, 10, 10));

		Button home3 = new Button("Home");
		home3.setOnAction(e -> primaryStage.setScene(scene1));

		Button goToQuestions = new Button("Search");
		goToQuestions.setOnAction(e -> primaryStage.setScene(scene4));
		gp3.add(goToQuestions, 4, 7);

		Label title3= new Label("Post a Question");
		title3.setFont(new Font("Comic Sans", 32));
		gp3.add(title3, 1, 0);

		gp3.add(home3, 0, 0);

		scene3 = new Scene(gp3, 750, 1000);

		//Question Page
		GridPane gp4 = new GridPane();
		gp4.setHgap(10);
		gp4.setVgap(10);
		gp4.setPadding(new Insets(10, 10, 10, 10));

		Button home4 = new Button("Home");
		home4.setOnAction(e -> primaryStage.setScene(scene1));

		Label questionTxt = new Label("Question: ");
		TextArea question = new TextArea();
		question.setEditable(false);
		gp4.add(question, 1, 1);
		gp4.add(questionTxt, 0, 1);

		Label answerTxt = new Label("Post an answer: ");
		TextArea answer = new TextArea();
		gp4.add(answerTxt, 0, 2);
		gp4.add(answer, 1, 2);

		Button postAns = new Button("Post Answer");
		//postAns.setOnAction(e -> primaryStage.setScene(scene1));

		gp4.add(postAns, 2, 2);

		scene4 = new Scene(gp4, 750, 1000);

		//ESKETTITTTT
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
