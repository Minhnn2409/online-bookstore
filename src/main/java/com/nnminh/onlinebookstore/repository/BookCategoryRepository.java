package com.nnminh.onlinebookstore.repository;

import com.nnminh.onlinebookstore.enitity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
