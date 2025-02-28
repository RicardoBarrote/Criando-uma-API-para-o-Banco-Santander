package rb.api.santander.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tb_account")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = false)
    private String numero;

    @Column(nullable = false)
    private String agencia;

    @Column(precision = 13, scale = 2, nullable = false)
    private BigDecimal saldo;

    @Column(precision = 13, scale = 2, nullable = false)
    private BigDecimal limite;

}
