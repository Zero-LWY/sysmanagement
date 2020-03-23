package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.DeptService;
import com.jluzh.sysmanagement.domain.entity.Dept;
import com.jluzh.sysmanagement.infra.pagehelper.Page;
import com.jluzh.sysmanagement.infra.pagehelper.PageRequest;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName DeptController.java
 * @createTime 2020年02月21日 11:02:00
 */
@RestController
@RequestMapping("/dept")
@Api(tags = "部门接口", value = "部门API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DeptController {

	private final DeptService deptService;


	@ApiOperation("分页获取部门列表")
	@GetMapping
	public ResponseEntity<Page<Dept>> list(final Dept dept,
										   final PageRequest pageRequest) {
		return Results.success(deptService.list(pageRequest, dept));
	}

	@ApiOperation("根据ID获取部门详细信息")
	@GetMapping("/{deptId}")
	public ResponseEntity<Dept> detail(@PathVariable final Integer deptId) {
		return Results.success(deptService.selectByPrimaryKey(deptId));
	}

	@ApiOperation("新增部门")
	@PostMapping
	public ResponseEntity<Dept> create(@RequestBody final Dept dept) {
		dept.setUpdateDate(LocalDateTime.now());
		dept.setUpdateBy("0");
		dept.setDelFlag("0");
		//this.validObject(o2CustomerAddress);
		deptService.insertSelective(dept);
		return Results.success(dept);
	}

	@ApiOperation("更新部门信息")
	@PutMapping
	public ResponseEntity<Dept> update(@RequestBody final Dept dept) {
		deptService.updateByPrimaryKeySelective(dept);
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success(dept);
	}

	@ApiOperation("删除部门")
	@DeleteMapping
	public ResponseEntity<String> remove(@RequestBody final Dept dept) {
		deptService.deleteByPrimaryKey(dept.getId());
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success("删除成功");
	}

	@ApiOperation("批量删除部门")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Dept> deptList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}
}
