package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
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
 * @ClassName AreaController.java
 * @createTime 2020年02月21日 11:02:00
 */
@RestController
@RequestMapping("/area")
@Api(tags = "区域相关接口", value = "区域API")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AreaController {

	private final AreaService areaService;


	@ApiOperation("分页获取区域列表")
	@GetMapping
	public ResponseEntity<Page<Area>> list(final Area area,
										   final PageRequest pageRequest) {
		return Results.success(areaService.list(pageRequest, area));
	}

	@ApiOperation("根据ID获取区域详细信息")
	@GetMapping("/{areaId}")
	public ResponseEntity<Area> detail(@PathVariable final Long areaId) {
		return Results.success(areaService.selectByPrimaryKey(areaId));
	}

	@ApiOperation("新增区域")
	@PostMapping
	public ResponseEntity<Area> create(@RequestBody final Area area) {
		//this.validObject(o2CustomerAddress);
		areaService.insertSelective(area);
		return Results.success(area);
	}

	@ApiOperation("更新区域")
	@PutMapping
	public ResponseEntity<Area> update(@RequestBody final Area area) {
		areaService.updateByPrimaryKeySelective(area);
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success(area);
	}

	@ApiOperation("删除区域")
	@DeleteMapping
	public ResponseEntity<String> remove(@RequestBody final Area area) {
		areaService.deleteByPrimaryKey(area.getId());
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success("删除成功");
	}

	@ApiOperation("批量删除区域")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Area> areaList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}


}
