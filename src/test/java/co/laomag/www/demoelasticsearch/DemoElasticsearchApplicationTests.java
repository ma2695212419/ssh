package co.laomag.www.demoelasticsearch;

import co.laomag.www.demoelasticsearch.dao.StuDao;
import co.laomag.www.demoelasticsearch.pojo.Student;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoElasticsearchApplicationTests {
    @Autowired
    private StuDao stuDao;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void contextLoads() {
        Student student = new Student();
        student.setSid(2);
        student.setsName("test");
        student.setDesc("难受");
        stuDao.save(student);
        /*boolean b = elasticsearchTemplate.indexExists("book");
        System.out.println(b);*/

    }

    @Test
    public void get() {
        Student student = stuDao.findById(2L).orElse(null);
        if (student==null){
            System.out.println("没有这个值");
            return;
        }
        System.out.println(student);
    }

    @Test
    public void delect() {
        stuDao.deleteById(2L);
        System.out.println("删除成功");
    }

    @Test
    public void update() {
        Student student = stuDao.findById(2L).orElse(null);
        student.setDesc("真难");
        stuDao.save(student);
    }
    @Test
    public void test(){


    }


}
