package eleven.lms.attend;

public interface AttendService {
    public void CreateAttend(MemberAttend memberAttend);

    public String findById(String MemberId);
}
