package co.develhope.customQueries2.repositories;

import co.develhope.customQueries2.entities.Flight;
import co.develhope.customQueries2.entities.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

   Page<Flight> findAllByStatus(Status status, PageRequest pageRequest);

   @Query(nativeQuery = true, value = "SELECT f.* \n" +
           " FROM `flights` AS f\n" +
           " WHERE f.status = ? OR f.status = ?")
   Page<Flight> getCustomFlight(String p1, String p2, PageRequest pageRequest);
}