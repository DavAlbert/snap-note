package ru.garkolym.snapnote.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.garkolym.snapnote.models.Paste;

import java.util.Optional;

@Repository
public interface PasteRepository extends JpaRepository<Paste, Long> {
    Optional<Paste> findByIdentity(String identity);
}
