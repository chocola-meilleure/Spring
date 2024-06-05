package spring;

// 암호 변경 클래스
public class ChangePasswordService{
	private MemberDao memberDao;
	
	// 해당 email의 member를 찾고 비밀번호 변경
	public void changePassword(String email, String oldPw, String newPw) {
		Member member = memberDao.selectByEmail(email);
		if (member == null)
			throw new MemberNotFoundException();
		
		member.changePassword(oldPw, newPw);
		
		memberDao.update(member);
	}

	// setter로 의존 객체 주입받기
	public void setMemberDao(MemberDao memberDao){
		this.memberDao = memberDao;
	}
}