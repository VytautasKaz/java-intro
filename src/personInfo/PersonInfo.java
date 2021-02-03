package personInfo;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public PersonInfo(String firstName, String lastName, String socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
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

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

}
