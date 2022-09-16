
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (!(firstName == null || firstName.isEmpty())) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (!(lastName == null || lastName.isEmpty())) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String out = "";
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            out = "Unknown";
        } else if (this.firstName.isEmpty() || this.lastName.isEmpty()) {
            out = this.firstName + this.lastName;
        } else {
            out = this.firstName + " " + this.lastName;
        }
        return out;
    }
}
