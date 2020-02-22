package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.DictService;
import com.jluzh.sysmanagement.domain.entity.Dict;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DictCtroller.java
 * @createTime 2020年02月21日 11:02:00
 */
@RestController
@RequestMapping("/dict")
@Api(tags = "字典接口", value = "字典API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DictCtroller {


	private final DictService dictService;


	@ApiOperation("分页获取字典列表")
	@GetMapping
	public ResponseEntity<Page<Dict>> list(final Dict dict,
										   final PageRequest pageRequest) {
		return Results.success(dictService.list(pageRequest, dict));
	}

	@ApiOperation("根据ID获取字典详细信息")
	@GetMapping("/{dictId}")
	public ResponseEntity<Dict> detail(@PathVariable final Integer dictId) {
		return Results.success(dictService.selectByPrimaryKey(dictId));
	}

	@ApiOperation("新增字典值")
	@PostMapping
	public ResponseEntity<Dict> create(@RequestBody final Dict dict) {
		//this.validObject(o2CustomerAddress);
		dictService.insertSelective(dict);
		return Results.success(dict);
	}

	@ApiOperation("更新字典值")
	@PutMapping
	public ResponseEntity<Dict> update(@RequestBody final Dict dict) {
		dictService.updateByPrimaryKeySelective(dict);
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success(dict);
	}

	@ApiOperation("删除字典值")
	@DeleteMapping
	public ResponseEntity<String> remove(@RequestBody final Dict dict) {
		dictService.deleteByPrimaryKey(dict.getId());
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success("删除成功");
	}

	@ApiOperation("批量删除字典值")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Dict> dictList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}
}
