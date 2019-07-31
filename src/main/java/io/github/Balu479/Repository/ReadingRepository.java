package io.github.Balu479.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.Balu479.Entity.Reading;
@RepositoryRestResource(collectionResourceRel="reading",path="readings")
public interface ReadingRepository extends JpaRepository<Reading, String> {

}
