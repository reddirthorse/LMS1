package eleven.lms.member;

public class MemberServiceImpl implements MemberService{

    //private final MemberRepository memberRepository = new MemoryMemberRepository;

    private final MemberRepository memberRepository; //인터페이스만을 선언해준다.

    public MemberServiceImpl(MemberRepository memberRepository) {//생성자를 생성해준다. 매개변수는 MemberRepository를 선택하여 밖에서 주입할수 있게한다.
        this.memberRepository = memberRepository;//생성자주입방식
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
