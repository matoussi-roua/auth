package org.auth.auth.model.address;

import jakarta.persistence.*;
import lombok.*;
import org.auth.auth.model.contact.Contact;

import java.util.List;

@Entity
@Table(name = "adress")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Adress {
    @GeneratedValue
    @Id
    @Column(name = "id_adress")
    private Long id;
    @Column(name = "adress")
    private String adress;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "state")
    private String state;
    @Column(name = "zip_code")
    private String zipCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "adressContact")
    private List<Contact> contactsByAdress;

    public static AdressBuilder builder() {
        return new AdressBuilder();
    }
}
