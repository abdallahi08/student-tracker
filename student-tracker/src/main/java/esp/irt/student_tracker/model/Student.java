
package esp.irt.student_tracker.model;

public class Student {

    private String firstName;
    private String lastName;

    // Constructeur sans argument
    public Student() {
    }

    // Constructeur avec deux paramètres
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter de firstName
    public String getFirstName() {
        return firstName;
    }

    // Setter de firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter de lastName
    public String getLastName() {
        return lastName;
    }

    // Setter de lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
