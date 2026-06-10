package collects.mapping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UserSubscription {
    private String userName;
    private String plan;
    private String device;
    private boolean active;

    public UserSubscription(String userName, String plan, String device, boolean active) {
        this.userName = userName;
        this.plan = plan;
        this.device = device;
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public String getPlan() {
        return plan;
    }

    public String getDevice() {
        return device;
    }

    public boolean isActive() {
        return active;
    }

    public static void main(String[] args) {
        UserSubscription userSubscription1 = new UserSubscription("Sérgio", "PREMIUM", "MOBILE", true);
        UserSubscription userSubscription2 = new UserSubscription("Ana", "BASIC", "TV", true);
        UserSubscription userSubscription3 = new UserSubscription("Carlos", "PREMIUM", "MOBILE", true);
        UserSubscription userSubscription4 = new UserSubscription("Maria", "PREMIUM", "TV", false);
        UserSubscription userSubscription5 = new UserSubscription("Pedro", "BASIC", "TV", true);
        UserSubscription userSubscription6 = new UserSubscription("Fernada", "PREMIUM", "DEKSTOP", true);
        UserSubscription userSubscription7 = new UserSubscription("João", "PREMIUM", "MOBILE", true);

        List<UserSubscription> userSubscriptions = List.of(userSubscription1, userSubscription2, userSubscription3,
                userSubscription4, userSubscription5, userSubscription6, userSubscription7);

        Map<String, Set<String>> userActive = userSubscriptions.stream()
                .filter(UserSubscription::isActive)
                .collect(Collectors.groupingBy(UserSubscription::getPlan,
                        Collectors.mapping(UserSubscription::getDevice, Collectors.toSet())));
        System.out.println(userActive);
    }
}
