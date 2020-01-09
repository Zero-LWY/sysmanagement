package com.jluzh.sysmanagement.infra.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * <p> @Description TODO </p>
 *
 * @author lian.weiyuan@hand-china.com
 * @version 1.0.0
 * @ClassName Results.java
 * @createTime 2019年11月25日 19:13:00
 */
@SuppressWarnings("unchecked")
public class Results {

	private Results() {}

	@SuppressWarnings("rawtypes")
	private static final ResponseEntity NO_CONTENT = new ResponseEntity<>(HttpStatus.NO_CONTENT);
	@SuppressWarnings("rawtypes")
	private static final ResponseEntity ERROR = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	@SuppressWarnings("rawtypes")
	private static final ResponseEntity INVALID = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	/**
	 * 请求成功
	 *
	 * @param data 返回值
	 * @return HttpStatus 200
	 */
	public static <T> ResponseEntity<T> success(T data) {
		if (data == null) {
			return NO_CONTENT;
		}
		return ResponseEntity.ok(data);
	}

	/**
	 * 请求成功, 已创建
	 *
	 * @param data 返回值
	 * @return HttpStatus 201
	 */
	public static <T> ResponseEntity<T> created(T data) {
		return ResponseEntity.status(HttpStatus.CREATED).body(data);
	}

	/**
	 * 请求成功,无返回值
	 *
	 * @return HttpStatus 204
	 */
	public static <T> ResponseEntity<T> success() {
		return NO_CONTENT;
	}

	/**
	 * 请求失败 请求参数错误
	 *
	 * @return HttpStatus 400
	 */
	public static <T> ResponseEntity<T> invalid() {
		return INVALID;
	}

	/**
	 * 请求失败 请求参数错误
	 *
	 * @param data 返回值
	 * @return HttpStatus 400
	 */
	public static <T> ResponseEntity<T> invalid(T data) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data);
	}

	/**
	 * 请求失败 服务端错误
	 *
	 * @return HttpStatus 500
	 */
	public static <T> ResponseEntity<T> error() {
		return ERROR;
	}

	/**
	 * 请求失败 服务端错误
	 *
	 * @param data 返回值
	 * @return HttpStatus 500
	 */
	public static <T> ResponseEntity<T> error(T data) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(data);
	}

	/**
	 * 自定义Http返回
	 *
	 * @param code HttpStatus code
	 * @return ResponseEntity
	 */
	public static <T> ResponseEntity<T> newResult(int code) {
		return ResponseEntity.status(HttpStatus.valueOf(code)).build();
	}

	/**
	 * 自定义Http返回
	 *
	 * @param code HttpStatus code
	 * @param data 返回值
	 * @return ResponseEntity
	 */
	public static <T> ResponseEntity<T> newResult(int code, T data) {
		return ResponseEntity.status(HttpStatus.valueOf(code)).body(data);
	}

}