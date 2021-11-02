package eleven.lms;

import eleven.lms.attend.AttendRepository;
import eleven.lms.attend.AttendService;
import eleven.lms.attend.AttendServiceImpl;
import eleven.lms.attend.MemoryAttendRepository;
import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;
import eleven.lms.member.MemberRepository;
import eleven.lms.member.MemberService;
import eleven.lms.member.MemberServiceImpl;
import eleven.lms.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){//MemberService의 구현체 선택
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){// 위에서 사용될 memberRepository의 구현체를 선책해준다.
        return new MemoryMemberRepository();
    }

    @Bean
    public AttendRepository attendRepository(){
        return new MemoryAttendRepository();
    }

    @Bean
    public AttendService attendService() throws ParseException {
        return new AttendServiceImpl(attendPolicy());
    }

    @Bean
    public AttendPolicy attendPolicy() throws ParseException {
        return new OneDayPolicy();
    }

}
