package rb.api.santander.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rb.api.santander.domain.model.Card;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
