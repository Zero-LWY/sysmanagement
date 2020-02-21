package com.jluzh.sysmanagement.api.controller.v1;

import com.jluzh.sysmanagement.app.service.AreaService;
import com.jluzh.sysmanagement.domain.entity.Area;
import com.jluzh.sysmanagement.infra.util.Results;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
		//final Page<Area> list = areaService.pageList(pageRequest, area);

		return Results.success();
	}

	@ApiOperation("根据ID获取区域详细信息")
	@GetMapping("/{areaId}")
	public ResponseEntity<?> detail(@PathVariable final long areaId) {
		final Area area = new Area();
		area.setId(areaId);
		//todo
		return Results.success();
	}

	@ApiOperation("新增区域")
	@PostMapping
	public ResponseEntity<?> create(@RequestBody final Area area) {
		//this.validObject(o2CustomerAddress);
		//todo
		return Results.success();
	}

	@ApiOperation("更新区域")
	@PutMapping
	public ResponseEntity<?> update(@RequestBody final  Area area) {
		//todo
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//this.validObject(o2CustomerAddress);
		//O2CustomerAddress customerAddress = o2CustomerAddressService.convert(o2CustomerAddress);
		return Results.success();
	}

	@ApiOperation("删除区域")
	@DeleteMapping
	public ResponseEntity<?> remove(@RequestBody final  Area area) {
		//todo
		//SecurityTokenHelper.validToken(o2CustomerAddress);
		//o2CustomerAddressRepository.deleteByPrimaryKey(o2CustomerAddress);
		return Results.success();
	}

	@ApiOperation("批量删除区域")
	@DeleteMapping("/batch")
	public ResponseEntity<?> batchRemove(@RequestBody final List<Area> areaList) {
		//SecurityTokenHelper.validToken(o2CustomerAddressList);
		//o2CustomerAddressRepository.batchDeleteByPrimaryKey(o2CustomerAddressList);
		return Results.success();
	}




}
