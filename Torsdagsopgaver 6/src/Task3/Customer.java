package Task3;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer (String firstName, String userName) {
        this.firstName=firstName;
        this.userName=userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + lastName + "Username: " + userName + "ID: " + id;
    }
}
