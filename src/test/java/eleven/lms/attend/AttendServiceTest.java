package eleven.lms.attend;

import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AttendServiceTest {

    @Test
    void createAttend() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        Date start = dateFormat.parse("08:56:00");
        Date end = dateFormat.parse("16:00:00");
        MemberAttend memberAttend = new MemberAttend("memberA",start,end);
        AttendPolicy attendPolicy = new OneDayPolicy();

        memberAttend.setAttendStandard(attendPolicy.JudgeAttend(memberAttend));

        Assertions.assertThat(memberAttend.getAttendStandard().equals(AttendStandard.present));
        System.out.println(memberAttend);


    }
}