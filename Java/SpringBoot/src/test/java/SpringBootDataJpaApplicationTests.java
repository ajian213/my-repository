import com.deane.Repository.UserJpaRepository;
import com.deane.domain.UserJpa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Deane
 * Date: 2018/10/5
 * Time: 11:01 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDataJpaApplicationTests.class)
@ComponentScan(basePackages = "com.deane")
public class SpringBootDataJpaApplicationTests {

    @Test
    public void contextLoads() {

    }

    private static final Logger logger = LoggerFactory.getLogger(SpringBootDataJpaApplicationTests.class);

    @Autowired
    private UserJpaRepository userRepository;

    @Test
    public void test1() throws Exception {
        final UserJpa user = userRepository.save( new UserJpa("u1", "p1") );
        logger.info( "add successful - [{}]", user);
        final List<UserJpa> u1 = userRepository.findAllByName("u1");
        logger.info( "query by name - [{}]", u1 );
        PageRequest pageable = PageRequest.of( 0, 10, Sort.by(Sort.Order.desc("name")));
        final Page<UserJpa> users = userRepository.findAll(pageable);
        logger.info("pageable and sort all - [{}]", users.getContent());
        userRepository.findById(users.getContent().get(0).getId()).ifPresent(user1 -> logger.info("query by PK - [{}]", user1));
        /*
        final UserJpa edit = userRepository.save(new UserJpa(user.getId(), "u1 after update:", "p1 after update"));
        logger.info("update successful - [{}], edit);
        */
        userRepository.deleteById(user.getId());
        logger.info( "delete by id {} successful - [{}]", user.getId());
    }
}
