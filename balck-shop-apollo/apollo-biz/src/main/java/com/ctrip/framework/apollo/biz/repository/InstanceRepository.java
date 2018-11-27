package com.ctrip.framework.apollo.biz.repository;

import com.ctrip.framework.apollo.biz.entity.Instance;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface InstanceRepository extends PagingAndSortingRepository<Instance, Long> {
  Instance findByAppIdAndClusterNameAndDataCenterAndIp(String appId, String clusterName, String dataCenter, String ip);
}
