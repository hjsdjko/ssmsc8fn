package com.entity.vo;

import com.entity.ZaixianzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 在线咨询
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-12-28 10:37:29
 */
public class ZaixianzixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 商家姓名
	 */
	
	private String shangjiaxingming;
		
	/**
	 * 咨询内容
	 */
	
	private String zixunneirong;
		
	/**
	 * 咨询时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zixunshijian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：商家姓名
	 */
	 
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}
				
	
	/**
	 * 设置：咨询内容
	 */
	 
	public void setZixunneirong(String zixunneirong) {
		this.zixunneirong = zixunneirong;
	}
	
	/**
	 * 获取：咨询内容
	 */
	public String getZixunneirong() {
		return zixunneirong;
	}
				
	
	/**
	 * 设置：咨询时间
	 */
	 
	public void setZixunshijian(Date zixunshijian) {
		this.zixunshijian = zixunshijian;
	}
	
	/**
	 * 获取：咨询时间
	 */
	public Date getZixunshijian() {
		return zixunshijian;
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
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
