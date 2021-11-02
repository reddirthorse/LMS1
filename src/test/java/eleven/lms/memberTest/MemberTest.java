package eleven.lms.memberTest;

import eleven.lms.AppConfig;
import eleven.lms.member.Member;
import eleven.lms.member.MemberService;
import eleven.lms.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberTest {
    MemberService memberService;

    @BeforeEach
            public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    //MemberService memberService = new MemberServiceImpl(memberRepository); 이전의 테스트를 위해 구현했던 MemberService

    @Test
    void join(){
        //given
        Member member = new Member(1L,"studentA");
        //when
        memberService.join(member);
        Member findMember=memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
