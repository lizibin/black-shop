package com.ctrip.framework.apollo.common.entity;

public class EntityPair<E> {

  private E firstEntity;
  private E secondEntity;

  public EntityPair(E firstEntity, E secondEntity){
    this.firstEntity = firstEntity;
    this.secondEntity = secondEntity;
  }

  public E getFirstEntity() {
    return firstEntity;
  }

  public void setFirstEntity(E firstEntity) {
    this.firstEntity = firstEntity;
  }

  public E getSecondEntity() {
    return secondEntity;
  }

  public void setSecondEntity(E secondEntity) {
    this.secondEntity = secondEntity;
  }
}
