package org.jenkinsci.plugins.api;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.userdetails.User;
import org.acegisecurity.userdetails.UserDetails;
import org.apache.commons.lang.StringUtils;

import com.google.gson.annotations.SerializedName;

import hudson.security.SecurityRealm;

public class BitbucketUser implements UserDetails {

    public class BitbucketUserResponse {
        public BitbucketUser user;
    }

    public String username = StringUtils.EMPTY;
    @SerializedName("display_name")
    public String displayName;
    public BitbucketLinks links;
    public String website;
    public String uuid;
    @SerializedName("is_staff")
    public Boolean isStaff;
    @SerializedName("account_id")
    public String accountId;

    public BitbucketUser() {
        super();
    }

    @Override
    public GrantedAuthority[] getAuthorities() {
        return new GrantedAuthority[] { SecurityRealm.AUTHENTICATED_AUTHORITY };
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.username;
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

}

