package org.auth.auth.model.contact;

import jakarta.persistence.*;
import lombok.*;
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
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private String jobTitle;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contactOwner")
    private List<Contact> assignedContacts;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_owner")
    private Contact contactOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_contact")
    private Adress adressContact;

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }
}
