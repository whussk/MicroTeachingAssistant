package SSM.Dao;


import SSM.Domain.Email;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
/*
    private int EID;
    private int tID;
    private String Sender;
    private Date SendTime;
    private String ETitle;
 */
@Repository
public interface IEmailDao {
    @Select("Select * from email")
    List<Email> findAll();
    @Select("Select * from email where EID=#{EID}")
    Email findOne(@Param("EID")int EID);
    @Select("Select * from email where TID=#{TID}")
    List<Email> findEmailByTeacher(@Param("TID")int TID);
    @Update("Update email set TID=#{TID},sender=#{Sender},sendtime=#{SendTime},etitle=#{ETitle} where EID=#{EID}")
    void updateEmail(Email email);
    @Insert("Insert into email (TID,sender,sendtime,etitle) values(#{TID},#{Sender},#{SendTime},#{ETitle})")
    void createEmail(Email email);
    @Delete("Delete from email where EID=#{EID}")
    void deleteEmail(@Param("EID")int EID);
}
