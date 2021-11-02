package eleven.lms.attend;

import eleven.lms.AutoAppconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AttendApp {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        Date start = dateFormat.parse("08:56:00");
        Date end = dateFormat.parse("16:00:00");

        //        AttendService attendService = new AttendServiceImpl();
        //        AttendRepository attendRepository = new MemoryAttendRepository();

        MemberAttend memberAttend = new MemberAttend("MemberA",start,end);

//        AppConfig appConfig = new AppConfig();
//        AttendService attendService = appConfig.attendService();
//        AttendRepository attendRepository = appConfig.attendRepository();

       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppconfig.class);
       AttendService attendService = applicationContext.getBean("attendService",AttendService.class);
       AttendRepository attendRepository = applicationContext.getBean("attendRepository",AttendRepository.class);

        attendService.CreateAttend(memberAttend);
        attendRepository.save(memberAttend);

        System.out.println(memberAttend);
    }
}
