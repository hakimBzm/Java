public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;
    private double accountBalance;

    public User(String firstName, String lastName, String address, String postalCode, String city, double accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
