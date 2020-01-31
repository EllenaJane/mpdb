package com.maple.mpdb.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;

@Entity
@Data
public class User implements Serializable, UserDetails {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String passWord;
  @Transient
  private boolean enable = true;

  @ManyToOne(cascade = CascadeType.MERGE)
  private Role role;
  @ManyToOne(cascade = CascadeType.MERGE)
  private Organization organization;

  /**
   * @param name
   * @param passWord
   * @param organization
   */
  public User(String name, @NotNull String passWord, Organization organization) {
    super();
    this.name = name;
    this.passWord = passWord;
    this.organization = organization;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.singletonList(new SimpleGrantedAuthority(role.getName()));
  }

  @Override
  public String getPassword() {
    return passWord;
  }

  @Override
  public String getUsername() {
    return name;
  }

  @Override
  public boolean isAccountNonExpired() {
    return enable;
  }

  @Override
  public boolean isAccountNonLocked() {
    return enable;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return enable;
  }

  @Override
  public boolean isEnabled() {
    return enable;
  }

  public User() {
    super();
  }
}
