package SSM.Dao;

import SSM.Domain.Vote_Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
/*    private int VID;
    private int SID;
    private String choice;
*/
@Repository
public interface IVote_StudentDao {
    @Select("select * from vote_student")
    List<Vote_Student> findAll();
    @Select("select * from vote_student where VID=#{VID}")
    List<Vote_Student> findOneVoteResult(@Param("VID")int VID);
    @Update("update vote_student set choice=#{choice} where VID=#{VID} and SName=#{SName}")
    void updateVoteOption(Vote_Student vote_student);
    @Insert("insert into vote_student (VID,SName,choice) values(#{VID},#{SName},#{choice})")
    void createVoteOption(Vote_Student vote_student);
    @Delete("delete from vote_student where VID=#{VID} and SName=#{SName}")
    void deleteVote(@Param("VID")int VID,@Param("SName")String SName);
}
