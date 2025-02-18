package com.learn.microsvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.microsvc.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
//EnableJpaRepositoriesConfiguration
// EnableJdbcRepositoriesConfiguration
//JdbcRepositoriesRegistrar.EnableJdbcRepositoriesConfiguration