package com.example.SpringWebPage.repositories;

import com.example.SpringWebPage.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
