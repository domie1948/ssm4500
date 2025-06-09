package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussfangwuzulinDao;
import com.entity.DiscussfangwuzulinEntity;
import com.service.DiscussfangwuzulinService;
import com.entity.vo.DiscussfangwuzulinVO;
import com.entity.view.DiscussfangwuzulinView;

@Service("discussfangwuzulinService")
public class DiscussfangwuzulinServiceImpl extends ServiceImpl<DiscussfangwuzulinDao, DiscussfangwuzulinEntity> implements DiscussfangwuzulinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangwuzulinEntity> page = this.selectPage(
                new Query<DiscussfangwuzulinEntity>(params).getPage(),
                new EntityWrapper<DiscussfangwuzulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangwuzulinEntity> wrapper) {
		  Page<DiscussfangwuzulinView> page =new Query<DiscussfangwuzulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangwuzulinVO> selectListVO(Wrapper<DiscussfangwuzulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangwuzulinVO selectVO(Wrapper<DiscussfangwuzulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangwuzulinView> selectListView(Wrapper<DiscussfangwuzulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangwuzulinView selectView(Wrapper<DiscussfangwuzulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
