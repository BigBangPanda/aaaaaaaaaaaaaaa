package org.hanzx.testproject.repository;

import org.hanzx.testproject.model.User;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//    @Query(value = "select * from t_user where id = ?1", nativeQuery = true)
//    @Modifying
//    User findUserById(Integer id);

//    @Query(value = "select * from t_user", nativeQuery = true)
//    @Modifying
//    List<User> findAllUser();
}
