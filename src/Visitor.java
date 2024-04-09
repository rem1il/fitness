import java.time.LocalDate;

public class Visitor {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Visitor(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString() {
        return firstName + " " + lastName + ", Дата рождения: " + dateOfBirth;
    }
}
