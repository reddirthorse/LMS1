package eleven.lms.attend;

public interface AttendRepository {
    void save(MemberAttend memberAttend);//출결정보 저장

    MemberAttend findById(String memberId);//출결정보 검색
}
