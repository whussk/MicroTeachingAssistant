package SSM.Controller;
import SSM.Domain.Teacher;
import SSM.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.sql.SQLException;
import java.util.List;

/**
 * 教师管理
 */
@Controller
@CrossOrigin
@RequestMapping("/Teacher")
public class TeacherController {
    private final TeacherService teacherService;
    @Autowired
    public TeacherController(TeacherService teacherService){
        this.teacherService=teacherService;
    }
    @RequestMapping("/findAll")
    public @ResponseBody List<Teacher> findAll()throws SQLException{
        return teacherService.findAll();
    }
    @RequestMapping("/findOne")
    public @ResponseBody Teacher findOne(@RequestBody String name) throws Exception {
        return teacherService.findOne(name);
    }

    @RequestMapping("/createTeacher")
    public @ResponseBody String createTeacher(@RequestBody Teacher teacher)throws SQLException{
        teacherService.createTeacher(teacher);
        return "succeed";
    }

    @RequestMapping("/deleteTeacher")
    public @ResponseBody String deleteTeacher(@RequestBody int ID)throws SQLException{
        teacherService.deleteTeacher(ID);
        return "succeed";
    }

    @RequestMapping("/updateTeacher")
    public @ResponseBody String updateTeacher(@RequestBody Teacher teacher){
        teacherService.updateTeacher(teacher);
        return "succeed";
    }

    @RequestMapping("/teacherLogin")
    public @ResponseBody Teacher teacherLogin(@RequestBody Teacher teacher) throws Exception {
       return teacherService.teacherLogin(teacher);
    }
}
