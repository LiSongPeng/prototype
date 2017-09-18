package com.prototype.dao;

import com.prototype.entity.Terminal;
import com.prototype.utils.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TerminalDaoTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private TerminalDao terminalDao;

    /**
     * 插入Terminal信息
     * @throws Exception
     */
    @Test
    public void insertTerminal() throws Exception {
        String id = UUIDUtil.getUUID();
        String terminalNo = "523456789012345678901234567890";
        String card = "523456789012345678901234567890";
        Terminal terminal = new Terminal(id,terminalNo,card);
        int insertCount = terminalDao.insertTerminal(terminal);
        logger.info("insertCount = {}",insertCount);

    }

    @Test
    public void deleteTerminal() throws Exception {
        String terminalNo = "123456789012345678901234567890";
        int deleteCount = terminalDao.deleteTerminal(terminalNo);
        logger.info("deleteCount = {}",deleteCount);
    }

    @Test
    public void updateTerminal() throws Exception {
        String terminalNo = "123456789012345678901234567890";
        String card = "198765432109876543210987654321";
        Terminal terminal = new Terminal();
        terminal.setTerminalNo(terminalNo);
        terminal.setCard(card);
        int updateCount = terminalDao.updateTerminal(terminal);
        logger.info("updateCount = {}",updateCount);
    }

    @Test
    public void queryTerminalByNo() throws Exception {
        String terminalNo = "523456789012345678901234567890";
        Terminal terminal = terminalDao.queryTerminalByNo(terminalNo);
        logger.info("terminal = {}",terminal);
    }

    @Test
    public void queryTerminalByCard() throws Exception {
        String card = "523456789012345678901234567890";
        List<Terminal> terminals = terminalDao.queryTerminalByCard(card);
        for(Terminal terminal : terminals){
            logger.info("terminal = {}",terminal);
        }
    }

    @Test
    public void findAllTerminal() throws Exception {
        List<Terminal> terminals = terminalDao.findAllTerminal();
        for(Terminal terminal : terminals){
            logger.info("terminal = {}",terminal);
        }
    }

}