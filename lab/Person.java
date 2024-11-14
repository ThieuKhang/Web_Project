package lab;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    public String id;
    public String name;
    public Integer age;
    public String email;
    public String birthDate;

    public Person(String id, String name, String email, String birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.age = ageCalculator(birthDate);
    }

    public Integer ageCalculator(String birthDateInput) {
        String[] dateParts = birthDateInput.split("/");
        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    }

    public void displayAttributes() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Birth Date: " + birthDate);
    }
}
