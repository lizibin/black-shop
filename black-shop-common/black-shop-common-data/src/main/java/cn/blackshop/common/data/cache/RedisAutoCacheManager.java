/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */

package cn.blackshop.common.data.cache;

import cn.hutool.core.util.StrUtil;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.lang.Nullable;

import java.time.Duration;
import java.util.Map;

public class RedisAutoCacheManager extends RedisCacheManager {

	RedisAutoCacheManager(RedisCacheWriter cacheWriter, RedisCacheConfiguration defaultCacheConfiguration,
						  Map<String, RedisCacheConfiguration> initialCacheConfigurations, boolean allowInFlightCacheCreation) {
		super(cacheWriter, defaultCacheConfiguration, initialCacheConfigurations, allowInFlightCacheCreation);
	}

	@Override
	protected RedisCache createRedisCache(String name,@Nullable RedisCacheConfiguration cacheConfig) {
		if(StrUtil.isBlank(name) || !name.contains("#")){
			return super.createRedisCache(name, cacheConfig);
		}

		String[] cacheArray = name.split("#");
		if (cacheArray.length < 2) {
			return super.createRedisCache(name, cacheConfig);
		}
		if (cacheConfig != null) {
			long cacheTime = Long.parseLong(cacheArray[1]);
			cacheConfig = cacheConfig.entryTtl(Duration.ofSeconds(cacheTime));
		}
		return super.createRedisCache(name, cacheConfig);
	}
}
