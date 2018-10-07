import com.deane.entity.UserBatis;
import com.deane.mapper.UserBatisMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/6
 * Time: 8:06 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMyBatisApplicationTests.class)
@ComponentScan(basePackages = "com.deane")
@MapperScan("com.deane.mapper")
public class SpringBootMyBatisApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootMyBatisApplicationTests.class);

    @Autowired
    private UserBatisMapper userBatisMapper;

    @Test
    public void test1() throws Exception {
        final int row1 = userBatisMapper.insert(new UserBatis("u1", "p1"));
        logger.info("[添加结果] - [{}]", row1);
        final int row2 = userBatisMapper.insert(new UserBatis("u2", "p2"));
        logger.info("[添加结果] - [{}]", row2);
        final int row3 = userBatisMapper.insert(new UserBatis("u1", "p3"));
        logger.info("[添加结果] - [{}]", row3);
        final List<UserBatis> u1 = userBatisMapper.findByName("u1");
        logger.info("[根据用户名查询] - [{}]", u1);
    }
}
