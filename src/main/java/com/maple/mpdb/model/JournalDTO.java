package com.maple.mpdb.model;

import java.time.Instant;
import lombok.Data;

@Data
public class JournalDTO {

  private Integer id;
  private Type type;
  private Instant publishedDate;
  private Media media;
  private Region region;
}
