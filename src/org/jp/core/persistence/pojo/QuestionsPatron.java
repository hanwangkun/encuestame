package org.jp.core.persistence.pojo;

// Generated 29-may-2009 13:17:50 by Hibernate Tools 3.2.2.GA

/**
 * QuestionsPatron generated by hbm2java
 */
public class QuestionsPatron implements java.io.Serializable {

	private Integer idPatron;
	private String typePatron;
	private String desQid;
	private String labelQid;
	private String finallity;
	private String templatePatron;
	private String class_;
	private Integer nivel;

	public QuestionsPatron() {
	}

	public QuestionsPatron(String typePatron, String desQid, String labelQid,
			String finallity, String class_) {
		this.typePatron = typePatron;
		this.desQid = desQid;
		this.labelQid = labelQid;
		this.finallity = finallity;
		this.class_ = class_;
	}

	public QuestionsPatron(String typePatron, String desQid, String labelQid,
			String finallity, String templatePatron, String class_,
			Integer nivel) {
		this.typePatron = typePatron;
		this.desQid = desQid;
		this.labelQid = labelQid;
		this.finallity = finallity;
		this.templatePatron = templatePatron;
		this.class_ = class_;
		this.nivel = nivel;
	}

	public Integer getIdPatron() {
		return this.idPatron;
	}

	public void setIdPatron(Integer idPatron) {
		this.idPatron = idPatron;
	}

	public String getTypePatron() {
		return this.typePatron;
	}

	public void setTypePatron(String typePatron) {
		this.typePatron = typePatron;
	}

	public String getDesQid() {
		return this.desQid;
	}

	public void setDesQid(String desQid) {
		this.desQid = desQid;
	}

	public String getLabelQid() {
		return this.labelQid;
	}

	public void setLabelQid(String labelQid) {
		this.labelQid = labelQid;
	}

	public String getFinallity() {
		return this.finallity;
	}

	public void setFinallity(String finallity) {
		this.finallity = finallity;
	}

	public String getTemplatePatron() {
		return this.templatePatron;
	}

	public void setTemplatePatron(String templatePatron) {
		this.templatePatron = templatePatron;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Integer getNivel() {
		return this.nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

}
