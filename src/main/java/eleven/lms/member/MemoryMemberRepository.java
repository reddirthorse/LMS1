package eleven.lms.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store = new HashMap<>();
    @Override
    public void save(Member member) {
        store.put(member.getId(),member);//해시맵의 key는 id로 value는 member로 저장 이 후 필드가 늘어남을 고려하여
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
