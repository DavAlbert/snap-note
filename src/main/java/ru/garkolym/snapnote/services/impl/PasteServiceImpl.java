package ru.garkolym.snapnote.services.impl;

import com.google.common.hash.Hashing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.garkolym.snapnote.models.Paste;
import ru.garkolym.snapnote.repositorys.PasteRepository;
import ru.garkolym.snapnote.services.PasteService;

import java.nio.charset.Charset;
import java.util.Date;
import java.util.Optional;

@Service
public class PasteServiceImpl implements PasteService {

    @Autowired
    private PasteRepository pasteRepository;

    public PasteServiceImpl(PasteRepository pasteRepository) {
        this.pasteRepository = pasteRepository;
    }

    @Override
    public Optional<Paste> findPaste(String identity) {
        return pasteRepository.findByIdentity(identity);
    }

    @Override
    public String savePaste(String message) {
        String identity = Hashing.murmur3_32().hashString(new Date().toString(), Charset.defaultCharset()).toString();
        Paste paste = new Paste();
        paste.setIdentity(identity);
        paste.setMessage(message);
        pasteRepository.save(paste);
        return identity;
    }
}
