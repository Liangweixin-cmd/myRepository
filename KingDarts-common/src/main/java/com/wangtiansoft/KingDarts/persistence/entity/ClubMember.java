package com.wangtiansoft.KingDarts.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wangtiansoft.KingDarts.persistence.base.BaseEntity;

@Table(name = "darts_club_member")
public class ClubMember extends BaseEntity {

	/**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    /**
     * 用户uuid
     */
    private String user_id;
    
    /**
     * 用户名
     */
    private String username;

    /**
     * 俱乐部编号
     */
    private String cno;
    
    /**
     * 是否删除（0不删除，1删除）
     */
    private Integer is_delete;
    
    /**
     * 创建时间
     */
    private Date create_time;
    
    /**
     * 修改时间
     */
    private Date update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
    
    
}
