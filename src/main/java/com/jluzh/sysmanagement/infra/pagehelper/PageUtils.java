package com.jluzh.sysmanagement.infra.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class PageUtils {

	/**
	 * 将分页信息封装到统一的接口
	 * @param pageRequest
	 * @param select
	 * @return
	 */
	public static <T> Page<T> getPageResult(PageRequest pageRequest, Select select) {
		PageHelper.startPage(pageRequest.getCurrent(),pageRequest.getPageSize());
		//将查询的结果给pageinfo处理
		PageInfo pageInfo = new PageInfo<>(select.doSelect());

		//创建结果集对象
		Page<T> result = new Page<>();
		//将结果封装到结果集对象中
		//当前页
		result.setCurrent(pageRequest.getCurrent());
		//每页的数量
		result.setPageSize(pageRequest.getPageSize());
		//总页数
		result.setTotalPages(pageInfo.getPages());
		//总条数
		result.setTotal(pageInfo.getTotal());
		//结果集
		result.setData(pageInfo.getList());
		return result;
	}
}