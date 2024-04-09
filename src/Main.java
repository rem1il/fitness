import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Visitor visitor1 = new Visitor("Иван", "Иванов", LocalDate.of(1990, 5, 15));
        Membership membership1 = new Membership(visitor1, LocalDate.now(), LocalDate.now().plusDays(1));
        FitnessZone gymZone = new FitnessZone(LocalTime.of(8, 0), LocalTime.of(22, 0));
        gymZone.registerMembership(membership1, LocalTime.of(9, 0));

        Visitor visitor2 = new Visitor("Петр", "Петров", LocalDate.of(1985, 8, 20));
        Membership membership2 = new Membership(visitor2, LocalDate.now(), LocalDate.now().plusDays(3));
        FitnessZone poolZone = new FitnessZone(LocalTime.of(8, 0), LocalTime.of(22, 0));
        poolZone.registerMembership(membership2, LocalTime.of(10, 0));

        Visitor visitor3 = new Visitor("Анна", "Сидорова", LocalDate.of(1995, 3, 10));
        Membership membership3 = new Membership(visitor3, LocalDate.now(), LocalDate.now().plusDays(5));
        FitnessZone groupClassZone = new FitnessZone(LocalTime.of(8, 0), LocalTime.of(16, 0));
        groupClassZone.registerMembership(membership3, LocalTime.of(12, 0));

        // Выводим информацию о посетителях
        System.out.println("Посетители зала:");
        gymZone.displayMemberships();

        System.out.println("\nПосетители бассейна:");
        poolZone.displayMemberships();

        System.out.println("\nПосетители групповых занятий:");
        groupClassZone.displayMemberships();
    }
}
