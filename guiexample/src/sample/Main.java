package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;

public class Main extends Application {

    List<Student> students = new LinkedList<>();
    Stage primaryStage;
    int width = 500;
    int height = 300;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("APP");
        primaryStage.setScene(initializeHomeScene());
        primaryStage.show();
    }

    public void refreshScene() {
        primaryStage.setScene(initializeHomeScene());
    }

    public static void main(String[] args) {
        launch(args);
    }

    public Scene initializeHomeScene() {
        GridPane grid = new GridPane();
        grid = setStudentAddFormToGrid(grid);
        grid = setStudentListsToGrid(grid);
        return new Scene(grid, width, height);
    }

    private GridPane setStudentAddFormToGrid(GridPane grid) {
        Label studentTitleLabel = new Label("Add student: ");
        studentTitleLabel.setFont(Font.font(20));

        Label studentNameLabel = new Label("Student name: ");
        studentNameLabel.setFont(Font.font(14));

        TextField studentNameInput = new TextField();
        studentNameInput.setPromptText("Type student name");


        Label studentLastNameLabel = new Label("Student last name: ");
        studentLastNameLabel.setFont(Font.font(14));

        TextField studentLastNameInput = new TextField();
        studentLastNameInput.setPromptText("Type student last name");

        Button createStudentButton = new Button("Add Student");

        int row = 1;
        int col = 1;
        GridPane.setConstraints(studentTitleLabel, col, row++);
        GridPane.setConstraints(studentNameLabel, col, row++);
        GridPane.setConstraints(studentNameInput, col, row++);
        GridPane.setConstraints(studentLastNameLabel, col, row++);
        GridPane.setConstraints(studentLastNameInput, col, row++);
        GridPane.setConstraints(createStudentButton, col, row++);

        setActionOnCreateStudentButtonClick(createStudentButton, studentNameInput, studentLastNameInput);


        grid.getChildren().addAll(studentTitleLabel, studentLastNameLabel, studentNameInput, studentLastNameInput, studentNameLabel, createStudentButton);
        return grid;
    }

    private GridPane setStudentListsToGrid(GridPane grid) {
        List<Label> studentsLabels = new LinkedList<>();
        int rowIndex = 1;
        for(Student student: students) {
            Label studentLabel = new Label(rowIndex  + ". " + student.toString());
            grid.setConstraints(studentLabel, 2, rowIndex);
            rowIndex++;
            studentsLabels.add(studentLabel);
        }
        grid.getChildren().addAll(studentsLabels);
        return grid;
    }

    private void setActionOnCreateStudentButtonClick(Button createStudentButton, TextField studentNameInput, TextField studentLastNameInput) {
        createStudentButton.setOnAction(e -> {
            Student student = new Student(studentNameInput.getText(), studentLastNameInput.getText());
            studentNameInput.clear();
            studentLastNameInput.clear();
            students.add(student);
            refreshScene();
        });
    }
}