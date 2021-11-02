package eleven.lms.member;

public interface MemberService {
    void join(Member member); //회원가입 메서드

    Member findMember(Long memberId); // 회원 조회 메서드
}
