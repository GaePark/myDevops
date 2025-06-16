package com.sist.web.entity;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
 *    1. ERP = 관리 프로그램 
 *             CURD => JDBC / MyBatis / JPA 
 *             => JOIN / SubQuery 
 *    2. FullStack : Vue / React
 *    3. AWS / GIT 
 *    4. CI/CD 
 *    -------------------------------------- 개인 프로젝트 
 *    1. 공부한 내용 정리 : 로션 / GIT 
 *    ---------------------------- 과정 / PPT 
 *    
 *      NO      NOT NULL NUMBER         
		NAME    NOT NULL VARCHAR2(50)   
		SUBJECT NOT NULL VARCHAR2(2000) 
		CONTENT NOT NULL CLOB           
		PWD     NOT NULL VARCHAR2(10)   
		REGDATE          DATE           
		HIT              NUMBER
 */
@Entity(name="board")
@Data
@DynamicUpdate
public class BoardEntity {
   @Id
   private int no;
   private String name;
   private String subject;
   private String content;
   @Column(insertable = true,updatable = false)
   private String pwd;
   @Column(insertable = true,updatable = false)
   private Date regdate;
   private int hit;
}


