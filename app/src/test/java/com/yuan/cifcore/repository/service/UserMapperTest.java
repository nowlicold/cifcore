package com.yuan.cifcore.repository.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yuan.cifcore.repository.entity.UserDO;
import com.yuan.cifcore.repository.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @className UserDAOTest
 * @autor cold
 * @DATE 2021/6/2 11:06
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void selectUserByLoginName(){
        UserDO userDO = userMapper.selectUserByLoginName("馄饨2号");
        log.info("userDO:{}", userDO);
    }

    @Test
    public void selectByCell(){
      //  UserDO userDO = userMapper.selectByC
      //  log.info("userDO:{}", userDO);
    }

    @Test
    public void selectSearch(){
        Page<UserDO> page = new Page<>(0,10);
        List<UserDO> userDOList = userMapper.search(null, null, null, null, null, null, null, null, null, null, "gmt_create desc",
                null, null, Arrays.asList(new String[]{"93ljqp"}), null, null, null, page);
        page.setRecords(userDOList);

        log.info("page:{}", ToStringBuilder.reflectionToString(page));
    }

    public void updateUserStatusByUserId(){
        int updated=  userMapper.updateUserStatusByUserId("T","10004001880415920100290980017853");
        log.info("updated",updated);
    }

}
