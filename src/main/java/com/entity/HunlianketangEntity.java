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
 * 婚恋课堂
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 18:46:28
 */
@TableName("hunlianketang")
public class HunlianketangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HunlianketangEntity() {
		
	}
	
	public HunlianketangEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 内容
	 */
					
	private String neirong;
	
	/**
	 * 婚恋课堂
	 */
					
	private String hunlianketang;
	
	/**
	 * 相亲
	 */
					
	private String xiangqin;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * 设置：婚恋课堂
	 */
	public void setHunlianketang(String hunlianketang) {
		this.hunlianketang = hunlianketang;
	}
	/**
	 * 获取：婚恋课堂
	 */
	public String getHunlianketang() {
		return hunlianketang;
	}
	/**
	 * 设置：相亲
	 */
	public void setXiangqin(String xiangqin) {
		this.xiangqin = xiangqin;
	}
	/**
	 * 获取：相亲
	 */
	public String getXiangqin() {
		return xiangqin;
	}

}
