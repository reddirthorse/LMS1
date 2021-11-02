package eleven.lms.attend;

import java.util.Date;

public class MemberAttend {
    private String memberId;
    private AttendStandard attendStandard;//출석,지각,조퇴,결석
    private Date inTime;//입실 시간
    private Date outTime;//퇴실 시간

    public MemberAttend(String memberId, Date inTime, Date outTime) {
        this.memberId = memberId;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public AttendStandard getAttendStandard() {
        return attendStandard;
    }

    public void setAttendStandard(AttendStandard attendStandard) {
        this.attendStandard = attendStandard;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    @Override
    public String toString() {
        return "MemberAttend{" +
                "memberId='" + memberId + '\'' +
                ", attendStandard=" + attendStandard +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                '}';
    }
}
