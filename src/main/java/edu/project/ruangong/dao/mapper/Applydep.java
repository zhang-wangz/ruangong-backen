package edu.project.ruangong.dao.mapper;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
public class Applydep {
  @Id
  @Column(name = "Applydepid")
  private String Applydepid;

  @Column(name = "uid")
  @NotEmpty(message = "uid不可为空")
  private String uid;

  @Column(name = "depid")
  @NotEmpty(message = "depid不可为空")
  private String depid;

  @Column(name = "reason")
  @NotEmpty(message = "reason不可为空")
  private String reason;

  @Column(name = "flag")
  private Integer flag=0;
}
