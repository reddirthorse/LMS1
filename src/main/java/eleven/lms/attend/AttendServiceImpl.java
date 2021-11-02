package eleven.lms.attend;

import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;

import java.text.ParseException;

public class AttendServiceImpl implements AttendService {
    AttendPolicy attendPolicy;

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
