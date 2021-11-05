package eleven.lms.attend;

import eleven.lms.attendrule.AttendPolicy;
import eleven.lms.attendrule.OneDayPolicy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
@Component
@RequiredArgsConstructor
public class AttendServiceImpl implements AttendService {

    private final AttendPolicy attendPolicy;

//    @Autowired
//    public AttendServiceImpl(AttendPolicy attendPolicy) throws ParseException {
//        this.attendPolicy = attendPolicy;
//    }

    @Override
    public void CreateAttend(MemberAttend memberAttend) {
        memberAttend.setAttendStandard(attendPolicy.JudgeAttend(memberAttend));
    }

    @Override
    public String findById(String MemberId) {
        return null;
    }
}
