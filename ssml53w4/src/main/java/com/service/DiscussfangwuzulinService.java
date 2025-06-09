package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangwuzulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangwuzulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangwuzulinView;


/**
 * 房屋租赁评论表
 *
 * @author 
 * @email 
 * @date 2021-01-30 08:44:55
 */
public interface DiscussfangwuzulinService extends IService<DiscussfangwuzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangwuzulinVO> selectListVO(Wrapper<DiscussfangwuzulinEntity> wrapper);
   	
   	DiscussfangwuzulinVO selectVO(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
   	
   	List<DiscussfangwuzulinView> selectListView(Wrapper<DiscussfangwuzulinEntity> wrapper);
   	
   	DiscussfangwuzulinView selectView(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangwuzulinEntity> wrapper);
   	
}

