package com.entity.model;

import com.entity.HetongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 合同信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-30 08:44:55
 */
public class HetongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋名称
	 */
	
	private String fangwumingcheng;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 楼号
	 */
	
	private String louhao;
		
	/**
	 * 押金
	 */
	
	private String yajin;
		
	/**
	 * 租金
	 */
	
	private String zujin;
		
	/**
	 * 租房日期
	 */
	
	private String zufangriqi;
		
	/**
	 * 租房时长
	 */
	
	private String zufangshizhang;
		
	/**
	 * 合同日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date hetongriqi;
		
	/**
	 * 合同内容
	 */
	
	private String hetongneirong;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
				
	
	/**
	 * 设置：房屋名称
	 */
	 
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：楼号
	 */
	 
	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	
	/**
	 * 获取：楼号
	 */
	public String getLouhao() {
		return louhao;
	}
				
	
	/**
	 * 设置：押金
	 */
	 
	public void setYajin(String yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public String getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(String zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public String getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：租房日期
	 */
	 
	public void setZufangriqi(String zufangriqi) {
		this.zufangriqi = zufangriqi;
	}
	
	/**
	 * 获取：租房日期
	 */
	public String getZufangriqi() {
		return zufangriqi;
	}
				
	
	/**
	 * 设置：租房时长
	 */
	 
	public void setZufangshizhang(String zufangshizhang) {
		this.zufangshizhang = zufangshizhang;
	}
	
	/**
	 * 获取：租房时长
	 */
	public String getZufangshizhang() {
		return zufangshizhang;
	}
				
	
	/**
	 * 设置：合同日期
	 */
	 
	public void setHetongriqi(Date hetongriqi) {
		this.hetongriqi = hetongriqi;
	}
	
	/**
	 * 获取：合同日期
	 */
	public Date getHetongriqi() {
		return hetongriqi;
	}
				
	
	/**
	 * 设置：合同内容
	 */
	 
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
			
}
