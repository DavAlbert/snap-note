package ru.garkolym.snapnote.requests;

import java.io.Serializable;

public class PasteRequest implements Serializable {
    private String paste;

    public String getPaste() {
        return paste;
    }

    public void setPaste(String paste) {
        this.paste = paste;
    }
}
