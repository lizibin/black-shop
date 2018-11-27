package com.ctrip.framework.apollo.biz.entity;

import com.ctrip.framework.apollo.common.entity.BaseEntity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Privilege")
@SQLDelete(sql = "Update Privilege set isDeleted = 1 where id = ?")
@Where(clause = "isDeleted = 0")
public class Privilege extends BaseEntity {

  @Column(name = "Name", nullable = false)
  private String name;

  @Column(name = "PrivilType", nullable = false)
  private String privilType;

  @Column(name = "NamespaceId")
  private long namespaceId;

  public String getName() {
    return name;
  }

  public long getNamespaceId() {
    return namespaceId;
  }

  public String getPrivilType() {
    return privilType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNamespaceId(long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public void setPrivilType(String privilType) {
    this.privilType = privilType;
  }

  public String toString() {
    return toStringHelper().add("namespaceId", namespaceId).add("privilType", privilType)
        .add("name", name).toString();
  }
}
