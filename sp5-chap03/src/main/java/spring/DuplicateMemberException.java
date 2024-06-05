package spring;

// 동일 이메일을 갖고 있는 회원이 존재할 때의 예외처리
public class DuplicateMemberException extends RuntimeException{
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}