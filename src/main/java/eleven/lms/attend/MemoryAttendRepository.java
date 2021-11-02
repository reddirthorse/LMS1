package eleven.lms.attend;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryAttendRepository implements AttendRepository{
    private static Map<String, MemberAttend> store = new HashMap<>();

    @Override
    public void save(MemberAttend memberAttend) {
        store.put(memberAttend.getMemberId(),memberAttend);
    }

    @Override
    public MemberAttend findById(String memberId) {
        return store.get(memberId);
    }
}
