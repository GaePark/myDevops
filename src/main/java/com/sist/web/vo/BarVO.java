package com.sist.web.vo;
/*
BAR_NO	NUMBER
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
public interface BarVO {
	public int getBar_no();
	public String getName();
	public String getAddress();
	public String getImage();
	public int getHit();
	public int getNum();
}
