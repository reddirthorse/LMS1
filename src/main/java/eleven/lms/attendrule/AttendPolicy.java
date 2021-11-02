package eleven.lms.attendrule;

import eleven.lms.attend.AttendStandard;
import eleven.lms.attend.MemberAttend;

public interface AttendPolicy {
    AttendStandard JudgeAttend(MemberAttend memberAttend);
}
