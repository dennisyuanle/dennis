package org.example.constant;

/**
 * @author sola
 */
public interface BasicErrorConstants {

	/**
	 * 获取status
	 * @return 错误码
	 */
	Integer getStatus();
	/**
	 * 获取code
	 * @return 错误码
	 */
	String getCode();

	/**
	 * 获取错误信息
	 * @return  错误信息
	 */
	String getMessage();
}
