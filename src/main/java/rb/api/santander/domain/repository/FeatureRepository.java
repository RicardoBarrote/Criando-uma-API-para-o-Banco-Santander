package rb.api.santander.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rb.api.santander.domain.model.Feature;

import java.util.UUID;

public interface FeatureRepository extends JpaRepository<Feature, UUID> {
}
