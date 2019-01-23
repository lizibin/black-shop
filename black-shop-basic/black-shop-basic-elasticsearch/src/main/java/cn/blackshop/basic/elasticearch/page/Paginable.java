/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.elasticearch.page;

/**
 * 分页实体
 * @author zibin
 */
public interface Paginable {
	
	/**
	 * 总记录数.
	 *
	 * @return the total count
	 */
	public int getTotalCount();

	/**
	 * 总页数.
	 *
	 * @return the total page
	 */
	public int getTotalPage();

	/**
	 * 每页记录数.
	 *
	 * @return the page size
	 */
	public int getPageSize();

	/**
	 * 当前页号.
	 *
	 * @return the page no
	 */
	public int getPageNo();

	/**
	 * 是否第一页.
	 *
	 * @return true, if checks if is first page
	 */
	public boolean isFirstPage();

	/**
	 * 是否最后一页.
	 *
	 * @return true, if checks if is last page
	 */
	public boolean isLastPage();

	/**
	 * 返回下页的页号.
	 *
	 * @return the next page
	 */
	public int getNextPage();

	/**
	 * 返回上页的页号.
	 *
	 * @return the pre page
	 */
	public int getPrePage();
}
