package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TestDataCreation {

    static Faker faker = new Faker();

    public static String first_name = faker.name().firstName();
    public static String last_name = faker.name().lastName();
    public static String emailAddress = faker.internet().emailAddress();

}
