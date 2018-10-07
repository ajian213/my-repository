package com.deane.Repository;

import com.deane.domain.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/5
 * Time: 10:56 PM
 */
@Repository
public interface UserJpaRepository extends JpaRepository<UserJpa, Long> {
    List<UserJpa> findAllByName(String userName);
}
