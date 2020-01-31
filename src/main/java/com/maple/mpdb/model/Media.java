package com.maple.mpdb.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;


@Entity
@Data
public class Media implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String website;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "MEDIA_REGION", joinColumns = {@JoinColumn(name = "MEDIA_ID")},
      inverseJoinColumns = {@JoinColumn(name = "REGION_ID")})
  private Set<Region> regionlist = new HashSet<>();


}
