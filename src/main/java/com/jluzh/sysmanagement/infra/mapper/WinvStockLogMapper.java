package com.jluzh.sysmanagement.infra.mapper;

import com.jluzh.sysmanagement.domain.entity.WinvStockLog;

import java.util.List;

public interface WinvStockLogMapper  {

	List<WinvStockLog> selectWinvStockLogList();
}