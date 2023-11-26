public class User {

    String firstName;
    String lastName;
    String address;

    public User(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String toString() {
        return "User : \n" +
                this.firstName + "     " +  this.firstName + "      " + this.address;
    }

}
