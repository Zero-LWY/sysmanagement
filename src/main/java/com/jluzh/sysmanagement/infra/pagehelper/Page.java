package com.jluzh.sysmanagement.infra.pagehelper;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageInfo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


/**
 * <p> 分页实现 </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName Page.java
 * @createTime 2019年11月26日 16:56:00
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Page<E> extends AbstractList<E> {
	private int totalPages;
	private long total;
	private int numberOfElements;
	private int pageSize;
	private int current;
	private List<E> data;

	public Page() {
		data = new ArrayList<>();
	}

	/**
	 * 分页封装对象构造函数
	 *
	 * @param data  data
	 * @param pageInfo pageInfo
	 * @param total    total
	 */
	public Page(List<E> data, PageInfo pageInfo, long total) {
		this.data = data;
		this.current = pageInfo.getPageNum();
		this.pageSize = pageInfo.getSize();
		this.total = total;
		this.totalPages = (int) (total - 1) / pageSize + 1;
		this.numberOfElements = data.size();

	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

	@Override
	public E get(int i) {
		return data.get(i);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		Page<?> page = (Page<?>) o;

		if (totalPages != page.totalPages) {
			return false;
		}
		if (total != page.total) {
			return false;
		}
		if (numberOfElements != page.numberOfElements) {
			return false;
		}
		if (pageSize != page.pageSize) {
			return false;
		}
		if (current != page.current) {
			return false;
		}
		return data != null ? data.equals(page.data) : page.data == null;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + totalPages;
		result = 31 * result + (int) (total ^ (total >>> 32));
		result = 31 * result + numberOfElements;
		result = 31 * result + pageSize;
		result = 31 * result + current;
		result = 31 * result + (data != null ? data.hashCode() : 0);
		return result;
	}
}
