package com.prototype.dao;

import com.prototype.entity.Terminal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TerminalDao {

    /**
     * 添加Terminal信息
     * @param terminal
     * @return
     */
    int insertTerminal(@Param("terminal") Terminal terminal);

    /**
     * 删除终端信息
     * @param terminalNo
     * @return
     */
    int deleteTerminal(String terminalNo);

    /**
     * 修改终端信息
     * @param terminal
     * @return
     */
    int updateTerminal(@Param("terminal") Terminal terminal);

    /**
     * 查询终端信息，通过terminalNo
     * @param terminalNo
     * @return
     */
    Terminal queryTerminalByNo(String terminalNo);

    /**
     * 查询终端信息，通过card
     * @param card
     * @return
     */
    List<Terminal> queryTerminalByCard(String card);

    /**
     * 查询所有终端信息
     * @return
     */
    List<Terminal> findAllTerminal();

}
