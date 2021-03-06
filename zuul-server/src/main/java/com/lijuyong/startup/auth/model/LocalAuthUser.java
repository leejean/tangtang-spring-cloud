package com.lijuyong.startup.auth.model;

/**
 * Created by john on 2017/3/8.
 */

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 默认密码为空字符串  , 并且设置为启用,没有锁定 . 没有过期.
 */
public class LocalAuthUser implements UserDetails {
    private final String username;
    private final String password;
    private final Long userId;

    public LocalAuthUser( String username,String password,Long userId) {

        this.username = username;
        this.password = password;
        this.userId = userId;

    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Long getUserId() {
        return userId;
    }


}