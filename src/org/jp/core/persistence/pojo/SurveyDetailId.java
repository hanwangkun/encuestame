package org.jp.core.persistence.pojo;

// Generated 29-may-2009 13:17:50 by Hibernate Tools 3.2.2.GA

/**
 * SurveyDetailId generated by hbm2java
 */
public class SurveyDetailId implements java.io.Serializable {

	private long idSd;
	private int qid;
	private int idSidFormat;
	private int ssid;

	public SurveyDetailId() {
	}

	public SurveyDetailId(long idSd, int qid, int idSidFormat, int ssid) {
		this.idSd = idSd;
		this.qid = qid;
		this.idSidFormat = idSidFormat;
		this.ssid = ssid;
	}

	public long getIdSd() {
		return this.idSd;
	}

	public void setIdSd(long idSd) {
		this.idSd = idSd;
	}

	public int getQid() {
		return this.qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getIdSidFormat() {
		return this.idSidFormat;
	}

	public void setIdSidFormat(int idSidFormat) {
		this.idSidFormat = idSidFormat;
	}

	public int getSsid() {
		return this.ssid;
	}

	public void setSsid(int ssid) {
		this.ssid = ssid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SurveyDetailId))
			return false;
		SurveyDetailId castOther = (SurveyDetailId) other;

		return (this.getIdSd() == castOther.getIdSd())
				&& (this.getQid() == castOther.getQid())
				&& (this.getIdSidFormat() == castOther.getIdSidFormat())
				&& (this.getSsid() == castOther.getSsid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdSd();
		result = 37 * result + this.getQid();
		result = 37 * result + this.getIdSidFormat();
		result = 37 * result + this.getSsid();
		return result;
	}

}
