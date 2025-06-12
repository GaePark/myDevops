package com.sist.web.entity;
import jakarta.persistence.Column;
/*
 * BAR_NO	NUMBER
NAME	VARCHAR2(100 BYTE)
ADDRESS	VARCHAR2(120 BYTE)
PHONE	VARCHAR2(14 BYTE)
IMAGE	VARCHAR2(300 BYTE)
PROFILE	CLOB
HIT	NUMBER
TIME	VARCHAR2(500 BYTE)
LOC	VARCHAR2(10 BYTE)
SUBWAY	VARCHAR2(500 BYTE)
RDAYS	VARCHAR2(200 BYTE)
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import java.util.*;
@Entity(name = "cocktailbar")
@Data
public class BarEntity {
	@Id
	private int bar_no;
	private String name,address,phone,image,hit,time,loc,subway;
	@Lob 
	@Column(name = "profile", columnDefinition = "CLOB")
	private String profile;
}
