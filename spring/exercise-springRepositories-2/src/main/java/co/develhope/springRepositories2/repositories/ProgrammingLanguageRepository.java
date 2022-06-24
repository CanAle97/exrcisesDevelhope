package co.develhope.springRepositories2.repositories;

import co.develhope.springRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *Defines a repository for the programming languages, so that it's possible to use `HAL Explorer` and `Postman`:
 *   the repository uses a specific path called `repo-prog-languages` and it has a description
 * use `Postman` to:
 *   add 4 specific programming languages to database:
 *     `Java`
 *     `C++`
 *     `JavaScript`
 *     `Go`
 *   get a list of all the programming languages available in the database, with a pagination of 2 results per page
 *   edit the inventor of one of the programming languages already in the database, entering your name
 ***note for reviewers**: examples of postman requests can be found in `SpringRepositories2PostmanCollection.postman_collection.json`
 *
 * @author Alessandro Canulli
 */

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository for ProgrammingLanguage table"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}