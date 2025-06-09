package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 退房评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-30 08:44:55
 */
@TableName("tuifangpingjia")
public class TuifangpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TuifangpingjiaEntity() {
		
	}
	
	public TuifangpingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 合同编号
	 */
					
	private String hetongbianhao;
	
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
	 * 租房日期
	 */
					
	private String zufangriqi;
	
	/**
	 * 合同日期
	 */
					
	private String hetongriqi;
	
	/**
	 * 退房日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuifangriqi;
	
	/**
	 * 房屋评分
	 */
					
	private String fangwupingfen;
	
	/**
	 * 房屋评价
	 */
					
	private String fangwupingjia;
	
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
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：合同编号
	 */
	public void setHetongbianhao(String hetongbianhao) {
		this.hetongbianhao = hetongbianhao;
	}
	/**
	 * 获取：合同编号
	 */
	public String getHetongbianhao() {
		return hetongbianhao;
	}
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
	 * 设置：合同日期
	 */
	public void setHetongriqi(String hetongriqi) {
		this.hetongriqi = hetongriqi;
	}
	/**
	 * 获取：合同日期
	 */
	public String getHetongriqi() {
		return hetongriqi;
	}
	/**
	 * 设置：退房日期
	 */
	public void setTuifangriqi(Date tuifangriqi) {
		this.tuifangriqi = tuifangriqi;
	}
	/**
	 * 获取：退房日期
	 */
	public Date getTuifangriqi() {
		return tuifangriqi;
	}
	/**
	 * 设置：房屋评分
	 */
	public void setFangwupingfen(String fangwupingfen) {
		this.fangwupingfen = fangwupingfen;
	}
	/**
	 * 获取：房屋评分
	 */
	public String getFangwupingfen() {
		return fangwupingfen;
	}
	/**
	 * 设置：房屋评价
	 */
	public void setFangwupingjia(String fangwupingjia) {
		this.fangwupingjia = fangwupingjia;
	}
	/**
	 * 获取：房屋评价
	 */
	public String getFangwupingjia() {
		return fangwupingjia;
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
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
