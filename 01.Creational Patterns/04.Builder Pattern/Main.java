package BuilderPattern;

public class Main {

    User user1 = new User.UserBuilder("Omar", "Mohammad")
            .age(0)
            .phone("010111111")
            .address("Amman")
            .build();

    User user2 = new User.UserBuilder("moh5", "konan")
            .age(40)
            .phone("5655")
            .build(); 

}
