package org.auth.auth.model.activity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Table(name = "activities")
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    @Id
    @GeneratedValue
    @Column(name = "id_activity", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "type")
    private String type;

    @Column(name = "subject")
    private String subject;

    @Column(name = "note")
    private String note;

    @Column(name = "documents")
    private String documents;

    public static ActivityBuilder builder() {
        return new ActivityBuilder();
    }
}
