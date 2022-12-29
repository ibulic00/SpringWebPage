package com.example.SpringWebPage.repositories;

import com.example.SpringWebPage.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
