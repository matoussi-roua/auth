package org.auth.auth.model.activity;

import jakarta.persistence.Column;
import org.auth.auth.model.contact.Contact;

import java.time.LocalDate;
import java.util.List;

public class ActivityBuilder {
    private Long id;
    private LocalDate date;
    private String type;
    private String subject;
    private String note;
    private String documents;
    private List<Contact> participants;


    public ActivityBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ActivityBuilder date(LocalDate date) {
        this.date = date;
        return this;

    }

    public ActivityBuilder type(String type) {
        this.type = type;
        return this;

    }

    public ActivityBuilder subject(String subject) {
        this.subject = subject;
        return this;

    }

    public ActivityBuilder note(String note) {
        this.note = note;
        return this;

    }

    public ActivityBuilder documents(String documents) {
        this.documents = documents;
        return this;

    }

    public ActivityBuilder participants(List<Contact> participants) {
        this.participants = participants;
        return this;
    }

    public Activity build() {
        return new Activity(id, date, type, subject, note, documents, participants);
    }
}
