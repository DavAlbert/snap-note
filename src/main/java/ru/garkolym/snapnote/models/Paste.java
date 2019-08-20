package ru.garkolym.snapnote.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "pastes")
public class Paste extends BaseEntity {

    @NotBlank
    @Column(name = "identity", unique = true)
    private String identity;

    @Lob
    @Column(name = "message")
    private String message;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
