package sv7.setec.hotelrental.Repository.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv7.setec.hotelrental.Model.User.User; // Import your User model

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add this to help the Service find existing users
    java.util.Optional<User> findByEmail(String email);
}