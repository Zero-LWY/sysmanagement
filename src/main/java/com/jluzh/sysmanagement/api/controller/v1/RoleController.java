package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.RoleService;
import com.jluzh.sysmanagement.domain.entity.Role;
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
 * @ClassName RoleController.java
 * @createTime 2020年02月21日 11:03:00
 */
@RestController
@RequestMapping("/role")
@Api(tags = "角色接口", value = "角色API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleController {

	private final RoleService roleService;


	@ApiOperation("分页获取角色列表")
	@GetMapping
	public ResponseEntity<Page<Role>> list(final Role role,
										   final PageRequest pageRequest) {
		return Results.success(roleService.list(pageRequest, role));
	}

	@ApiOperation("根据ID获取角色详细信息")
	@GetMapping("/{roleId}")
	public ResponseEntity<Role> detail(@PathVariable final Integer roleId) {
		return Results.success(roleService.selectByPrimaryKey(roleId));
	}

	@ApiOperation("新增角色")
	@PostMapping
	public ResponseEntity<Role> create(@RequestBody final Role role) {
		//this.validObject(o2CustomerAddress);
		roleService.insertSelective(role);
		return Results.success(role);
	}

	@ApiOperation("更新角色")
	@PutMapping
	public ResponseEntity<Role> update(@RequestBody final Role role) {
		roleService.updateByPrimaryKeySelective(role);
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success(role);
	}

	@ApiOperation("删除角色")
	@DeleteMapping
	public ResponseEntity<String> remove(@RequestBody final Role role) {
		roleService.deleteByPrimaryKey(role.getId());
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success("删除成功");
	}

	@ApiOperation("批量删除角色")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Role> roleList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}
}
