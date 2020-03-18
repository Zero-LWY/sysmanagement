package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.MenuService;
import com.jluzh.sysmanagement.domain.entity.Menu;
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
 * @ClassName MenuController.java
 * @createTime 2020年02月21日 11:03:00
 */
@RestController
@RequestMapping("/menu")
@Api(tags = "菜单接口", value = "菜单API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MenuController {

	private final MenuService menuService;


	@ApiOperation("分页获取菜单列表")
	@GetMapping
	public ResponseEntity<Page<Menu>> list(final Menu menu,
										   final PageRequest pageRequest) {
		return Results.success(menuService.list(pageRequest, menu));
	}

	@ApiOperation("根据ID获取字典详细信息")
	@GetMapping("/{menuId}")
	public ResponseEntity<Menu> detail(@PathVariable final Integer menuId) {
		return Results.success(menuService.selectByPrimaryKey(menuId));
	}

	@ApiOperation("新增字典值")
	@PostMapping
	public ResponseEntity<Menu> create(@RequestBody final Menu menu) {
		//this.validObject(o2CustomerAddress);
		menu.setIsShow("1");
		menu.setUpdateBy("1");
		menu.setUpdateDate(LocalDateTime.now());
		menu.setDelFlag("0");
		menuService.insertSelective(menu);
		return Results.success(menu);
	}

	@ApiOperation("更新字典值")
	@PutMapping
	public ResponseEntity<Menu> update(@RequestBody final Menu menu) {
		menuService.updateByPrimaryKeySelective(menu);
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success(menu);
	}

	@ApiOperation("删除字典值")
	@DeleteMapping
	public ResponseEntity<String> remove(@RequestBody final Menu menu) {
		menuService.deleteByPrimaryKey(menu.getId());
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success("删除成功");
	}

	@ApiOperation("批量删除字典值")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Menu> menuList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}
}
