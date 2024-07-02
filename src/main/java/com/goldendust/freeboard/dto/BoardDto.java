package com.goldendust.freeboard.dto;

public class BoardDto {
	
	private int BNUM;
	private String MNAME;
	private String BTITLE;
	private String BCONTENT;
	private String BDATE;

	public BoardDto() {
		super();
	}

	public BoardDto(int bNUM, String mNAME, String bTITLE, String bCONTENT, String bDATE) {
		super();
		BNUM = bNUM;
		MNAME = mNAME;
		BTITLE = bTITLE;
		BCONTENT = bCONTENT;
		BDATE = bDATE;
	}

	public int getBNUM() {
		return BNUM;
	}

	public void setBNUM(int bNUM) {
		BNUM = bNUM;
	}

	public String getMNAME() {
		return MNAME;
	}

	public void setMNAME(String mNAME) {
		MNAME = mNAME;
	}

	public String getBTITLE() {
		return BTITLE;
	}

	public void setBTITLE(String bTITLE) {
		BTITLE = bTITLE;
	}

	public String getBCONTENT() {
		return BCONTENT;
	}

	public void setBCONTENT(String bCONTENT) {
		BCONTENT = bCONTENT;
	}

	public String getBDATE() {
		return BDATE;
	}

	public void setBDATE(String bDATE) {
		BDATE = bDATE;
	}

}
