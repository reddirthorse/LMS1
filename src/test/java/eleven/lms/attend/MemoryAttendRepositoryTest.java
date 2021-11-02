package eleven.lms.attend;

import eleven.lms.AppConfig;
import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MemoryAttendRepositoryTest {

    @Test
    void save() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        //given
        Date start = dateFormat.parse("08:56:00");
        Date end = dateFormat.parse("16:00:00");
        MemberAttend memberAttend = new MemberAttend("memberA",start,end);
        AppConfig appConfig = new AppConfig();
        AttendPolicy attendPolicy = appConfig.attendPolicy();
        AttendService attendService = appConfig.attendService();
        AttendRepository attendRepository = appConfig.attendRepository();
        //when
        attendService.CreateAttend(memberAttend);
        attendRepository.save(memberAttend);
        MemberAttend findMember = attendRepository.findById("memberA");
        //then
        Assertions.assertThat(findMember).isEqualTo(memberAttend);



    }
}