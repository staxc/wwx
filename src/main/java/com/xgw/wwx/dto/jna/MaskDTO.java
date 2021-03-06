package com.xgw.wwx.dto.jna;

public class MaskDTO {

	private long id;

	private int jmtype;//节点类型

	private int cardnum;//板卡数量

	private long speed;//速率

	private int sunzinum;//算核

	private MaskSliceLocationDTO sliceLoc;

	private MaskSliceLocationDTO result;

	public int getJmtype() {
		return jmtype;
	}

	public void setJmtype(int jmtype) {
		this.jmtype = jmtype;
	}

	public int getCardnum() {
		return cardnum;
	}

	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}

	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public int getSunzinum() {
		return sunzinum;
	}

	public void setSunzinum(int sunzinum) {
		this.sunzinum = sunzinum;
	}

	public MaskSliceLocationDTO getSliceLoc() {
		return sliceLoc;
	}

	public void setSliceLoc(MaskSliceLocationDTO sliceLoc) {
		this.sliceLoc = sliceLoc;
	}

	public MaskSliceLocationDTO getResult() {
		return result;
	}

	public void setResult(MaskSliceLocationDTO result) {
		this.result = result;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
