package com.jxtpro.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArea<M extends BaseArea<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setCid(java.lang.String cid) {
		set("cid", cid);
	}

	public java.lang.String getCid() {
		return get("cid");
	}

	public void setPid(java.lang.Integer pid) {
		set("pid", pid);
	}

	public java.lang.Integer getPid() {
		return get("pid");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setShortName(java.lang.String shortName) {
		set("shortName", shortName);
	}

	public java.lang.String getShortName() {
		return get("shortName");
	}

	public void setLongitude(java.lang.Float longitude) {
		set("longitude", longitude);
	}

	public java.lang.Float getLongitude() {
		return get("longitude");
	}

	public void setLatitude(java.lang.Float latitude) {
		set("latitude", latitude);
	}

	public java.lang.Float getLatitude() {
		return get("latitude");
	}

	public void setLevel(java.lang.Integer level) {
		set("level", level);
	}

	public java.lang.Integer getLevel() {
		return get("level");
	}

	public void setSort(java.lang.Integer sort) {
		set("sort", sort);
	}

	public java.lang.Integer getSort() {
		return get("sort");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setExt1(java.lang.String ext1) {
		set("ext1", ext1);
	}

	public java.lang.String getExt1() {
		return get("ext1");
	}

}