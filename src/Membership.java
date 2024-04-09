import java.time.LocalDate;

public class Membership {
    private LocalDate registrationDate;
    private LocalDate expiryDate;
    private Visitor visitor;

    public Membership(Visitor visitor, LocalDate registrationDate, LocalDate expiryDate) {
        this.visitor = visitor;
        this.registrationDate = registrationDate;
        this.expiryDate = expiryDate;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String toString() {
        return visitor.toString() + ", Дата регистрации: " + registrationDate + ", Дата окончания: " + expiryDate;
    }
}
