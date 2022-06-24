package co.develhope.springRepositories1.repositories;

import co.develhope.springRepositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *Defines a repository for the cars, so that it's possible to use `HAL Explorer` to explore the data
 * use the `HAL Explorer` to add 2 cars in the database
 * use the `HAL Explorer` to list all the cars in the database
 ***note for reviewers**: examples of HAL post requests can be found in `HAL-REQUESTS.md`
 *
 * @author Alessandro Canulli
 */

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}