package ru.garkolym.snapnote.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "pastes")
public class Paste extends BaseEntity {

    @NotBlank
    @Column(name = "identity", unique = true)
    private String identity;

    @Column(name = "alive", nullable = false)
    private Boolean alive = true;

    @Column(name = "message")
    private String message;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
