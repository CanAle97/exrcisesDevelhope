package co.develhope.nosqlorm1.repositories;

import co.develhope.nosqlorm1.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}