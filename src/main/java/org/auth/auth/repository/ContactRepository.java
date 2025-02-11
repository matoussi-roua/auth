package org.auth.auth.repository;

import org.auth.auth.model.contact.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    @Query(value = "SELECT * FROM contact WHERE " +
            "(:firstName IS NULL OR first_name LIKE %:firstName%) AND " +
            "(:lastName IS NULL OR last_name LIKE %:lastName%) AND " +
            "(:email IS NULL OR email = :email) AND " +
            "(:phone IS NULL OR phone = :phone) AND " +
            "(:company IS NULL OR company LIKE %:company%) AND " +
            "(:jobTitle IS NULL OR job_title LIKE %:jobTitle%) AND " +
            "(:contactOwnerId IS NULL OR contact_owner = :contactOwnerId) AND " +
            "(:adressContactId IS NULL OR address_contact = :adressContactId)",
            nativeQuery = true)
    List<Contact> searchContacts(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("company") String company,
            @Param("jobTitle") String jobTitle,
            @Param("contactOwnerId") Long contactOwnerId,
            @Param("adressContactId") Long adressContactId
    );

    @Query(value = "SELECT C FROM Contact C WHERE C.id =: id ")
    Optional<Contact> fetchById(@Param("id") final Long id);

    @Query(value = "SELECT C FROM Contact C WHERE C.email =: email")
    Optional<Contact> fetchByEmail(@Param("email") final String email);

}
