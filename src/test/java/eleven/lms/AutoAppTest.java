package eleven.lms;


import eleven.lms.attend.AttendRepository;
import eleven.lms.attend.AttendService;
import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppTest {
    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppconfig.class);


        MemberService memberService = ac.getBean(MemberService.class);
        AttendService attendService = ac.getBean(AttendService.class);
        AttendRepository attendRepository = ac.getBean(AttendRepository.class);
        AttendPolicy attendPolicy = ac.getBean(AttendPolicy.class);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
        Assertions.assertThat(attendService).isInstanceOf(AttendService.class);
        Assertions.assertThat(attendRepository).isInstanceOf(AttendRepository.class);
        Assertions.assertThat(attendPolicy).isInstanceOf(AttendPolicy.class);


    }
}
