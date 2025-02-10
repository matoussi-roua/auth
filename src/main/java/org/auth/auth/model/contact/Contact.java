package org.auth.auth.model.contact;

import jakarta.persistence.*;
import lombok.*;
import org.auth.auth.model.activity.Activity;
import org.auth.auth.model.address.Adress;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last-name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contactOwner")
    private List<Contact> assignedContacts;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_owner")
    private Contact contactOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_contact")
    private Adress adressContact;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "participants_activities",
            joinColumns = @JoinColumn(name = "contact_id"),
            inverseJoinColumns = @JoinColumn(name = "activity _id"))
    private List<Activity> activitiesToAttend;

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }
}
