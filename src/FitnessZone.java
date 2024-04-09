import java.time.LocalTime;
import java.util.ArrayList;

public class FitnessZone {
    private ArrayList<Membership> memberships = new ArrayList<>();
    private LocalTime openTime;
    private LocalTime closeTime;

    public FitnessZone(LocalTime openTime, LocalTime closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void registerMembership(Membership membership, LocalTime currentTime) {
        if (currentTime.isBefore(openTime) || currentTime.isAfter(closeTime)) {
            System.out.println("Доступ к зоне разрешен с " + openTime + " до " + closeTime);
            return;
        }

        if (memberships.contains(membership)) {
            System.out.println("Абонемент уже зарегистрирован в этой зоне");
            return;
        }

        if (memberships.size() >= 20) {
            System.out.println("В зоне нет свободных мест");
            return;
        }

        memberships.add(membership);
        System.out.println("Абонемент успешно зарегистрирован в зоне");
    }

    public void displayMemberships() {
        for (Membership membership : memberships) {
            System.out.println(membership.toString());
        }
    }
}
