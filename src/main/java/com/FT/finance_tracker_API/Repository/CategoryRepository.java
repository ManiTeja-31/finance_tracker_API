package com.FT.finance_tracker_API.Repository;

import com.FT.finance_tracker_API.Entity.Category;
import com.FT.finance_tracker_API.Entity.CategoryType;
import com.FT.finance_tracker_API.Entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByType(TransactionType type);

    // Check if a category exists for a specific type
    boolean existsByNameAndType(CategoryType name, TransactionType type);
}
