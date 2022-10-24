package week5;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    @Test
    public void test1() {
        Faker faker = new Faker();
        System.out.println(faker.address().city());

        System.out.println(faker.animal().name());

        System.out.println(faker.country().capital());
    }

    @Test
    public void informationForm() {
        Faker faker = new Faker();

//        System.out.println("Name: " + faker.name().fullName());
//        System.out.println("School: " + faker.name());
//        System.out.println("Animal: " + faker.animal().name());
//        System.out.println("Coffee: " + faker.name());
//        System.out.println("Country: " + faker.country().name());
//        System.out.println("City: " + faker.country().capital());

        String name = faker.name().fullName();
        String lastName = faker.name().lastName();
        String birtDate = faker.date().birthday().toString();
        String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("birtDate = " + birtDate);
        System.out.println("phoneNumber = " + phoneNumber);

    }
}
