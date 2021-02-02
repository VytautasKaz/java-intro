package personInfo;

import java.math.BigInteger;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private BigInteger socialSecurity;

    public PersonInfo(String firstName, String lastName, BigInteger socialSecurity) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurity(socialSecurity);
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

    public BigInteger getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(BigInteger socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurity=" + socialSecurity +
                '}';
    }
}
