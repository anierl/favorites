package com.favorites.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author JiMeiling
 * @Description 用户
 * @create 2021-08-17 11:27
 */
@Entity
public class User extends Entitys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = true)
    private String profilePicture;
    @Column(nullable = true,length = 65535,columnDefinition = "Text")
    private String introduction;
//    @Column(nullable = false)
    @Column(nullable = true)
    private String createTime;
//    @Column(nullable = false)
    @Column(nullable = true)
    private String lastModifyTime;
    @Column(nullable = true)
    private String outDate;
    @Column(nullable = true)
    private String validataCode;
    @Column(nullable = true)
    private String backgroundPicture;

    public User() {
        super();
    }

    public User(String userName, String passWord, String email) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePictrue() {
        return profilePicture;
    }

    public void setProfilePictrue(String profilePictrue) {
        this.profilePicture = profilePictrue;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getValidataCode() {
        return validataCode;
    }

    public void setValidataCode(String validataCode) {
        this.validataCode = validataCode;
    }

    public String getBackgroundPicture() {
        return backgroundPicture;
    }

    public void setBackgroundPicture(String backgroundPicture) {
        this.backgroundPicture = backgroundPicture;
    }
}
