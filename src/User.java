public class User {
    private int userID;
    static int count = 1;
    private String firstName;
    private String lastName;
    private String eMail;
    private String address;
    private String zipCode;
    private String phoneNumber;

    public User(){
        userID = count++;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  " First name:'" + firstName + '\'' +
                " Last name:'" + lastName + '\'' +
                " E-Mail: '" + eMail + '\'' +
                " Address: '" + address + '\'' +
                " Zip code: '" + zipCode + '\'' +
                " Phone number:'" + phoneNumber + '\'' + "\n";
    }
}
