package eleven.lms.member;

public interface MemberRepository {
    void save(Member member); //회원정보 저장

    Member findById(Long memberId);
}
