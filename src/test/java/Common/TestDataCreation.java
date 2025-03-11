package Common;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TestDataCreation {

    static Faker faker = new Faker();

    public static String first_name = faker.name().firstName();
    public static String last_name = faker.name().lastName();
    public static String emailAddress = faker.internet().emailAddress();

    // Generate a random number to append to the "SF_TEST" prefix
    static int randomNumber = faker.number().numberBetween(12, 45999); // Random number between 1 and 999

    // Format the number with leading zeros if necessary
    static String formattedNumber = String.format("%03d", randomNumber); // Ensures a 3-digit number

    // Create the random employee ID
    public static String randomEmployeeId = "SF_TEST" + formattedNumber;



}
