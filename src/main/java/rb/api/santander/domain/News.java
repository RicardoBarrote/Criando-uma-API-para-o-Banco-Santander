package rb.api.santander.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "tb_news")
@Builder
public class News extends BaseItem {
}
