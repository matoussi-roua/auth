package org.auth.auth.model.contact;

public class ContactBuilder {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private String jobTitle;

    public ContactBuilder id(Long id) {
        this.id = id;
        return this;
    }
    public ContactBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public ContactBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public ContactBuilder email(String email) {
        this.email = email;
        return this;
    }
    public ContactBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public ContactBuilder company(String company) {
        this.company = company;
        return this;
    }
    public ContactBuilder jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }
    public Contact build() {
        Contact contact = new Contact();
        contact.setId(id);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setEmail(email);
        contact.setPhone(phone);
        contact.setCompany(company);
        contact.setJobTitle(jobTitle);
        return contact;
    }
}
