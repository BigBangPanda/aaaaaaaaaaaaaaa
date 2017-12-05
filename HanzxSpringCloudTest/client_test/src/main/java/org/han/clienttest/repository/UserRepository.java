package org.han.clienttest.repository;

import org.han.clienttest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//    @Query(value = "select * from t_user where id = ?1", nativeQuery = true)
//    @Modifying
//    User findUserById(Integer id);

//    @Query(value = "select * from t_user", nativeQuery = true)
//    @Modifying
//    List<User> findAllUser();
}
