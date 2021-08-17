package com.favorites.repository;

import com.favorites.domain.User;
import com.favorites.util.DateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author JiMeiling
 * @Description
 * @create 2021-08-17 15:51
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username,String email);
    User findByEmail(String email);
    User findById(long id);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update User set outDate=:outDate, validataCode=:validataCode where email=:email")
    int setOutDateAndValidateCode(@Param("outDate") String outDate, @Param("validataCode") String validataCode, @Param("email") String email);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update User set passWord=:passWord where email=:email")
    int setNewPassword(@Param("passWord") String passWord, @Param("email") String email);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update User set introduction=:introduction where email=:email")
    int setIntroduction(@Param("introduction") String introduction,@Param("email") String mail);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update User set profilePicture=:profilePicture where id=:id")
    int setProfilePicture(@Param("profilePicture") String profilePicture, @Param("id") Long id);

    @Modifying(clearAutomatically=true)
    @Transactional
    @Query("update User set backgroundPicture=:backgroundPicture where id=:id")
    int setBackgroundPicture(@Param("backgroundPicture") String backgroundPicture, @Param("id") Long id);

}
