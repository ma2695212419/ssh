package co.laomag.www.demoelasticsearch.dao;

import co.laomag.www.demoelasticsearch.pojo.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Component;

/**
 * @author 马泽朋
 * @version 1.0
 * @date 2020/1/15 上午 9:16
 */
@Component
public interface StuDao extends ElasticsearchCrudRepository<Student,Long> {
}
