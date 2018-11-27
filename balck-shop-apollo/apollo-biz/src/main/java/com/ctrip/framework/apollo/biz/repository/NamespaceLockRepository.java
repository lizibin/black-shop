package com.ctrip.framework.apollo.biz.repository;

import com.ctrip.framework.apollo.biz.entity.NamespaceLock;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface NamespaceLockRepository extends PagingAndSortingRepository<NamespaceLock, Long> {

  NamespaceLock findByNamespaceId(Long namespaceId);

  Long deleteByNamespaceId(Long namespaceId);

}
