package com.jluzh.sysmanagement.infra.pagehelper;

import org.springframework.data.domain.Sort;


/**
 * source : org.springframework.data.domain.PageRequest
 * 分页、排序请求封装对象
 *
 * @author NaccOll
 * 2018/1/30
 **/
public class PageRequest {
	private int current;
	private int pageSize;

	public PageRequest() {
	}

	public PageRequest(int current, int pageSize) {
		this(current, pageSize, null);
	}

	/**
	 * 构造方法
	 *
	 * @param current current
	 * @param pageSize pageSize
	 * @param sort sort
	 */
	public PageRequest(int current, int pageSize, Sort sort) {
		this.current = current;
		this.pageSize = pageSize;
	}


	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
