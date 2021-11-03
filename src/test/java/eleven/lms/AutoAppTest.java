package eleven.lms;


import eleven.lms.attend.AttendRepository;
import eleven.lms.attend.AttendService;
import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.member.MemberService;
import eleven.lms.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;

public class AutoAppTest {
    @Test
    void basicScan() throws ParseException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppconfig.class);


        MemberService memberService = ac.getBean(MemberService.class);
        AttendService attendService = ac.getBean(AttendService.class);
        AttendRepository attendRepository = ac.getBean(AttendRepository.class);
        AttendPolicy attendPolicy = ac.getBean(AttendPolicy.class);

        AppConfig appConfig = new AppConfig();

        AttendPolicy attendPolicy1 = appConfig.attendPolicy();
        AttendService attendService1 = appConfig.attendService();

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
        Assertions.assertThat(attendService).isInstanceOf(AttendService.class);
        Assertions.assertThat(attendRepository).isInstanceOf(AttendRepository.class);
        Assertions.assertThat(attendPolicy).isInstanceOf(AttendPolicy.class);

        System.out.println(attendPolicy1);
        System.out.println(attendPolicy);
        System.out.println("--------------------");
        System.out.println(attendService1);
        System.out.println(attendService);

    }
}
