package com.htw.zhidaxing.scoring;

import com.htw.zhidaxing.model.entity.App;
import com.htw.zhidaxing.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
* * @author <a href="https://github.com/iwinnable/zhidaxing">iwinable</a>

 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}