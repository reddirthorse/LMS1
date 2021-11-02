package eleven.lms.attend;

import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
@Component
public class AttendServiceImpl implements AttendService {
    AttendPolicy attendPolicy;

    @Autowired
    public AttendServiceImpl(AttendPolicy attendPolicy) throws ParseException {
        this.attendPolicy = attendPolicy;
    }

    @Override
    public void CreateAttend(MemberAttend memberAttend) {
        memberAttend.setAttendStandard(attendPolicy.JudgeAttend(memberAttend));
    }

    @Override
    public String findById(String MemberId) {
        return null;
    }
}
