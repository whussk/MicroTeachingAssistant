package SSM.Domain;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Email {
    private int EID;
    private int TID;
    private String Sender;
    private Date SendTime;
    private String ETitle;

    public int getEID() {
        return EID;
    }

    public void setEID(int EID) {
        this.EID = EID;
    }

    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }
    @JsonFormat(timezone = "GMT+8")
    public Date getSendTime() {
        return SendTime;
    }
    @JsonFormat(timezone = "GMT+8")
    public void setSendTime(Date sendTime) {
        SendTime = sendTime;
    }

    public String getETitle() {
        return ETitle;
    }

    public void setETitle(String ETitle) {
        this.ETitle = ETitle;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
