package me.huding.luobo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminUser<M extends BaseAdminUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}

	public java.lang.Long getUserId() {
		return get("user_id");
	}

	public void setFirstname(java.lang.String firstname) {
		set("firstname", firstname);
	}

	public java.lang.String getFirstname() {
		return get("firstname");
	}

	public void setLastname(java.lang.String lastname) {
		set("lastname", lastname);
	}

	public java.lang.String getLastname() {
		return get("lastname");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return get("username");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}

	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

	public java.util.Date getModified() {
		return get("modified");
	}

	public void setLogdate(java.util.Date logdate) {
		set("logdate", logdate);
	}

	public java.util.Date getLogdate() {
		return get("logdate");
	}

	public void setLognum(java.lang.Integer lognum) {
		set("lognum", lognum);
	}

	public java.lang.Integer getLognum() {
		return get("lognum");
	}

	public void setReloadAclFlag(java.lang.Integer reloadAclFlag) {
		set("reload_acl_flag", reloadAclFlag);
	}

	public java.lang.Integer getReloadAclFlag() {
		return get("reload_acl_flag");
	}

	public void setIsActive(java.lang.Integer isActive) {
		set("is_active", isActive);
	}

	public java.lang.Integer getIsActive() {
		return get("is_active");
	}

	public void setExtra(java.lang.String extra) {
		set("extra", extra);
	}

	public java.lang.String getExtra() {
		return get("extra");
	}

	public void setRpToken(java.lang.String rpToken) {
		set("rp_token", rpToken);
	}

	public java.lang.String getRpToken() {
		return get("rp_token");
	}

	public void setRpTokenCreatedAt(java.util.Date rpTokenCreatedAt) {
		set("rp_token_created_at", rpTokenCreatedAt);
	}

	public java.util.Date getRpTokenCreatedAt() {
		return get("rp_token_created_at");
	}

	public void setFailuresNum(java.lang.Integer failuresNum) {
		set("failures_num", failuresNum);
	}

	public java.lang.Integer getFailuresNum() {
		return get("failures_num");
	}

	public void setFirstFailure(java.util.Date firstFailure) {
		set("first_failure", firstFailure);
	}

	public java.util.Date getFirstFailure() {
		return get("first_failure");
	}

	public void setLockExpires(java.util.Date lockExpires) {
		set("lock_expires", lockExpires);
	}

	public java.util.Date getLockExpires() {
		return get("lock_expires");
	}

}
