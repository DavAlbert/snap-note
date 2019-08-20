package ru.garkolym.snapnote.services;

import org.springframework.stereotype.Service;
import ru.garkolym.snapnote.models.Paste;

import java.util.Optional;

@Service
public interface PasteService {
    Optional<Paste> findPaste(String identity);
    String savePaste(String message);
}
