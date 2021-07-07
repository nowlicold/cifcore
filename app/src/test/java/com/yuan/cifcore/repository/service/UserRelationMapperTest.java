package com.yuan.cifcore.repository.service;

import com.yuan.cifcore.repository.entity.UserRelationDO;
import com.yuan.cifcore.repository.mapper.UserRelationMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.CannotAcquireLockException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * @className UserRelationMapperTest
 * @autor cold
 * @DATE 2021/6/9 23:43
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRelationMapperTest {
    @Resource
    private UserRelationMapper userRelationMapper;
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Test
    public void save(){
        UserRelationDO userRelationDO = new UserRelationDO();
        userRelationDO.setUserId("10004001880325591800290980016345");
        userRelationDO.setOtherUserId("10004001880338899500290980019199");
        userRelationDO.setOtherUserName("豆12");
        userRelationDO.setFromType("S");
        userRelationDO.setRelationType("F");
        userRelationDO.setStatus("T");
        userRelationDO.setCreator("cold");
        userRelationDO.setModifier("cold");
        int id = userRelationMapper.insert(userRelationDO);
        log.info("id{}= | userRelationDO{}",id,userRelationDO);

    }
    @Test
    public void selectById(){
        transactionTemplate.execute(new TransactionCallback<Boolean>() {
            public Boolean doInTransaction(TransactionStatus status) {
                UserRelationDO userRelationDO = null;
                try{
                    userRelationDO = userRelationMapper.selectByIdForUpdate(1);
                }catch (CannotAcquireLockException ex){
                        log.info("锁定失败",ex);

                }
                log.info("userRelationDO{}",userRelationDO);
                return true;
            }});
    }
    @Test
    public void selectById2(){
        transactionTemplate.execute(new TransactionCallback<Boolean>() {
            public Boolean doInTransaction(TransactionStatus status) {
                UserRelationDO userRelationDO = null;
                try{
                    userRelationDO = userRelationMapper.selectByIdForUpdate(1);
                }catch (CannotAcquireLockException ex){
                    log.info("锁定失败",ex);

                }
                log.info("userRelationDO{}",userRelationDO);
                return true;
            }});
    }
}
