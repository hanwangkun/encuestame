package org.jp.core.persistence.pojo;

// Generated 29-may-2009 13:17:50 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * SurveyResultMod generated by hbm2java
 */
public class SurveyResultMod implements java.io.Serializable {

	private Integer idMod;
	private SecUsers secUsers;
	private SurveyResult surveyResult;
	private String previousResponse;
	private String newResponse;
	private Date modDate;

	public SurveyResultMod() {
	}

	public SurveyResultMod(SecUsers secUsers, SurveyResult surveyResult,
			String previousResponse, Date modDate) {
		this.secUsers = secUsers;
		this.surveyResult = surveyResult;
		this.previousResponse = previousResponse;
		this.modDate = modDate;
	}

	public SurveyResultMod(SecUsers secUsers, SurveyResult surveyResult,
			String previousResponse, String newResponse, Date modDate) {
		this.secUsers = secUsers;
		this.surveyResult = surveyResult;
		this.previousResponse = previousResponse;
		this.newResponse = newResponse;
		this.modDate = modDate;
	}

	public Integer getIdMod() {
		return this.idMod;
	}

	public void setIdMod(Integer idMod) {
		this.idMod = idMod;
	}

	public SecUsers getSecUsers() {
		return this.secUsers;
	}

	public void setSecUsers(SecUsers secUsers) {
		this.secUsers = secUsers;
	}

	public SurveyResult getSurveyResult() {
		return this.surveyResult;
	}

	public void setSurveyResult(SurveyResult surveyResult) {
		this.surveyResult = surveyResult;
	}

	public String getPreviousResponse() {
		return this.previousResponse;
	}

	public void setPreviousResponse(String previousResponse) {
		this.previousResponse = previousResponse;
	}

	public String getNewResponse() {
		return this.newResponse;
	}

	public void setNewResponse(String newResponse) {
		this.newResponse = newResponse;
	}

	public Date getModDate() {
		return this.modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

}
