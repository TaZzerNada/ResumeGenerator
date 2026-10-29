package lt.resume.model;

public class PersonalInfo {
    private String fullName;
    private String email;
    private String phone;
    private String city;
    private String summary;

    public PersonalInfo(String fullName, String email, String phone, String city, String summary) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.summary = summary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getSummary() {
        return summary;
    }
}
