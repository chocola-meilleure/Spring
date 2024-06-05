package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {
	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() {
		// 의존 객체 생성
		memberDao = new MemberDao();
		// 생성자로 의존 객체 주입받기
		regSvc = new MemberRegisterService(memberDao);
		pwdSvc = new ChangePasswordService();
		// 세터로 의존 객체 주입받기
		pwdSvc.setMemberDao(memberDao);
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	public MemberRegisterService getMemberRegisterService() {
		return regSvc;
	}
	
	public ChangePasswordService getChangePasswordService() {
		return pwdSvc;
	}

}
