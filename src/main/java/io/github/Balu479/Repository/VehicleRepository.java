package io.github.Balu479.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.Balu479.Entity.Vehicle;
@RepositoryRestResource(collectionResourceRel="vehicles",path="vehicles")
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
