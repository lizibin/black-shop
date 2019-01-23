/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.page;

import java.io.Serializable;
import java.util.List;

public class Page <T> extends SimplePage implements Serializable,Paginable{

	private static final long serialVersionUID = -3833781978625980794L;

	public Page() {
	}

	public Page(int pageNo, int pageSize, int totalCount) {
		super(pageNo, pageSize, totalCount);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Page(int pageNo, int pageSize, int totalCount, List list) {
		super(pageNo, pageSize, totalCount);
		this.list = list;
	}

	public int getFirstResult() {
		return (pageNo - 1) * pageSize;
	}

	/**
	 * 当前页的数据
	 */
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
