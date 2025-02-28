package rb.api.santander.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rb.api.santander.domain.Account;
import rb.api.santander.domain.User;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
