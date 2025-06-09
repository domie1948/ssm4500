package com.dao;

import com.entity.DiscussfangwuzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangwuzulinVO;
import com.entity.view.DiscussfangwuzulinView;


/**
 * 房屋租赁评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-30 08:44:55
 */
public interface DiscussfangwuzulinDao extends BaseMapper<DiscussfangwuzulinEntity> {
	
	List<DiscussfangwuzulinVO> selectListVO(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
	
	DiscussfangwuzulinVO selectVO(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
	
	List<DiscussfangwuzulinView> selectListView(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);

	List<DiscussfangwuzulinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
	
	DiscussfangwuzulinView selectView(@Param("ew") Wrapper<DiscussfangwuzulinEntity> wrapper);
	
}
