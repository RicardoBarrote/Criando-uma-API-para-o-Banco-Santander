package rb.api.santander.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "tb_feature")
@Builder
public class Feature extends BaseItem{
}
