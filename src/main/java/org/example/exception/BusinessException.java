package org.example.exception;

/**
 * 业务异常类
 * ClassName: BusinessException
 * @author sunc
 * @Date 2017年5月22日 下午2:07:18
 *
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 4643555411679449922L;

	public BusinessException(String message){
		super(message);
	}
	
	public BusinessException(Exception e){
		super(e);
	}
	
}
