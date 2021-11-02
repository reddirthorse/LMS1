package eleven.lms.attendrule;

import eleven.lms.attend.AttendStandard;
import eleven.lms.attend.MemberAttend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OneDayPolicy implements AttendPolicy{
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
    Date startTime = dateFormat.parse("09:00:00");
    Date endTime = dateFormat.parse("16:50:00");

    public OneDayPolicy() throws ParseException {
    }

    @Override
    public AttendStandard JudgeAttend(MemberAttend memberAttend) {
        if (memberAttend.getInTime().compareTo(startTime)<=0 && memberAttend.getOutTime().compareTo(endTime)>=0){
            return AttendStandard.present;
        }
        if (memberAttend.getInTime().compareTo(startTime)>0 && memberAttend.getOutTime().compareTo(endTime)>=0){
            return AttendStandard.late;
        }
        if (memberAttend.getOutTime().compareTo(endTime)<=0){
            return AttendStandard.earlyLeave;
        }
        else return AttendStandard.absence;
    }
}
