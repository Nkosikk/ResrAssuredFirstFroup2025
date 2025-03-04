package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TestDataCreation {

    static Faker faker = new Faker();

    public static String first_name = faker.name().firstName();

}
