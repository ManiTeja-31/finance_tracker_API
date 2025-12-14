package com.FT.finance_tracker_API.Repository;

import com.FT.finance_tracker_API.Entity.Transaction;
import com.FT.finance_tracker_API.Entity.TransactionType;
import com.FT.finance_tracker_API.Entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    // --------BASIC QUERIES-----------

    List<Transaction> findByUser(User user);
    List<Transaction> findByUserId(Long userId);
    List<Transaction> findByUserAndType(User user, TransactionType type);
    List<Transaction> findByUserAndDateBetween(User user, LocalDate start, LocalDate end);
    List<Transaction> findByCategoryId(Long categoryId);

    // ------ADVANCED FILTERING QUERIES-----------------

    List<Transaction> findByUserAndAmountGreaterThan(User user,Double amount);
    List<Transaction> findByUserAndAmountLessThan(User user, Double amount);
    List<Transaction> findByUserAndAmountBetween(User user, Double min, Double max);
    List<Transaction> findByUserAndDateGreaterThanEqual(User user, LocalDate date);
    List<Transaction> findByUserAndDateLessThanEqual(User user, LocalDate date);

    //------------SORTING QUERIES----------------

    List<Transaction> findByUserOrderByDateDesc(User user);
    List<Transaction> findByUserOrderByAmountAsc(User user);
    List<Transaction> findByUserOrderByAmountDesc(User user);

    //--------------PAGINATION-------------------

    Page<Transaction> findByUser(User user, Pageable pageable);
    Page<Transaction> findByUserAndType(User user, TransactionType type, Pageable pageable);

    //-------------LATEST TRANSACTIONS--------------
    List<Transaction> findTop10ByUserOrderByDateDesc(User user);

    // ----- MULTI-CONDITION FILTERING -----

    // Filter by type + category
    List<Transaction> findByUserAndTypeAndCategoryId(
            User user,
            TransactionType type,
            Long categoryId
    );

    // Filter by type + amount range
    List<Transaction> findByUserAndTypeAndAmountBetween(
            User user,
            TransactionType type,
            double min,
            double max
    );

    // Filter by category + date range
    List<Transaction> findByCategoryIdAndDateBetween(
            Long categoryId,
            LocalDate start,
            LocalDate end
    );

}
