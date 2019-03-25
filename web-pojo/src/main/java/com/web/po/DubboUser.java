package com.web.po;

import java.io.Serializable;
import java.util.Date;

public class DubboUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dubbo_user.id
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dubbo_user.username
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dubbo_user.Password
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dubbo_user.telephone
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dubbo_user.createtime
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dubbo_user.id
     *
     * @return the value of dubbo_user.id
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dubbo_user.id
     *
     * @param id the value for dubbo_user.id
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dubbo_user.username
     *
     * @return the value of dubbo_user.username
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dubbo_user.username
     *
     * @param username the value for dubbo_user.username
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dubbo_user.Password
     *
     * @return the value of dubbo_user.Password
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dubbo_user.Password
     *
     * @param Password the value for dubbo_user.Password
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dubbo_user.telephone
     *
     * @return the value of dubbo_user.telephone
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dubbo_user.telephone
     *
     * @param telephone the value for dubbo_user.telephone
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dubbo_user.createtime
     *
     * @return the value of dubbo_user.createtime
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dubbo_user.createtime
     *
     * @param createtime the value for dubbo_user.createtime
     *
     * @mbg.generated Sun Mar 24 11:25:29 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}