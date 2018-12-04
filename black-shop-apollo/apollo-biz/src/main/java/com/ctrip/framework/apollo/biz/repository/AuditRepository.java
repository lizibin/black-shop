package com.ctrip.framework.apollo.biz.repository;

import com.ctrip.framework.apollo.biz.entity.Audit;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuditRepository extends PagingAndSortingRepository<Audit, Long> {

  @Query("SELECT a from Audit a WHERE a.dataChangeCreatedBy = :owner")
  List<Audit> findByOwner(@Param("owner") String owner);

  @Query("SELECT a from Audit a WHERE a.dataChangeCreatedBy = :owner AND a.entityName =:entity AND a.opName = :op")
  List<Audit> findAudits(@Param("owner") String owner, @Param("entity") String entity,
      @Param("op") String op);
}
