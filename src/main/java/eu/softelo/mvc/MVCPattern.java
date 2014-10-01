package eu.softelo.mvc;

/**
 * Created by: Damian
 * Date      : 2014-10-01
 */
public class MVCPattern {
    public static void main(String[] args) {
        Student model = retriveStudent();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudent() {
        return new Student("Robert", "10");
    }
}
