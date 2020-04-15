/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.goods.controller;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.goods.service.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品控制层
 * 获取商品列表，保存商品，删除商品等操作
 */
@RestController
@AllArgsConstructor
public class SkuController {

	private final GoodsService goodsService;

	/**
	 * 分页查询所有商品集合
	 * @return
	 */
	@GetMapping("/queryGoodsList")
	public ResponseResult page(){
		return null;
	}

	/**
	 * 保存商品
	 */
	@PostMapping("/saveGoods")
	public ResponseResult saveGoods(){
		return null;
	}

	/**
	 * 删除商品
	 */
	@DeleteMapping("/deleteGoods")
	public ResponseResult deleteGoods(){
		return null;
	}
}
