package com.favorites.repository;

import com.favorites.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author JiMeiling
 * @Description
 * @create 2021-08-17 16:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{

        userRepository.save(new User("aa","123456","aa@123.com"));
        userRepository.save(new User("bb","12345","bb@123.com"));
        userRepository.save(new User("cc","1234567","cc@123.com"));

    }

    @Test
    void findByUserName() {

    }

    @Test
    void findByUserNameOrEmail() {
    }

    @Test
    void findByEmail() {
    }

    @Test
    void findById() {
    }

    @Test
    void setOutDateAndValidateCode() {
    }

    @Test
    void setNewPassword() {
    }

    @Test
    void setIntroduction() {
    }

    @Test
    void setProfilePicture() {
    }

    @Test
    void setBackgroundPicture() {
    }
}