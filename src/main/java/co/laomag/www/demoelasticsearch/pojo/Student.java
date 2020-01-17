package co.laomag.www.demoelasticsearch.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/1/15 上午 9:18
 */
@Document(indexName = "ceshi",type = "students")
public class Student {
    @Id
    private Long sid;

    private String sName;

    private String desc;

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
