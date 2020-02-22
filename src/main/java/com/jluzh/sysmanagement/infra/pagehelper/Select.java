package com.jluzh.sysmanagement.infra.pagehelper;


import java.util.List;

/**
 * <p>分页查询接口</p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName Select.java
 * @createTime 2020年02月22日 13:05:00
 */
@FunctionalInterface
public interface Select<E> {

	List<E> doSelect();

}
