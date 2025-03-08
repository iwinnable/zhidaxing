package com.htw.zhidaxing.model.dto.postfavour;

import com.htw.zhidaxing.common.PageRequest;
import com.htw.zhidaxing.model.dto.post.PostQueryRequest;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
* * @author <a href="https://github.com/iwinnable/zhidaxing">iwinable</a>
 * *
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}