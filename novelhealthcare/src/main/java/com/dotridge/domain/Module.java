package com.dotridge.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Module implements Serializable {
	private static final long serialVersionUID = -4496266312297336189L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int moduleId;
	private String moduleName;
	@OneToMany
	@JoinTable(name="Module_permissions")
	List<Permissions> permissionList;
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public List<Permissions> getPermissionList() {
		return permissionList;
	}
	public void setPermissionList(List<Permissions> permissionList) {
		this.permissionList = permissionList;
	}
	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName + ", permissionList=" + permissionList
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + moduleId;
		result = prime * result + ((moduleName == null) ? 0 : moduleName.hashCode());
		result = prime * result + ((permissionList == null) ? 0 : permissionList.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		if (moduleId != other.moduleId)
			return false;
		if (moduleName == null) {
			if (other.moduleName != null)
				return false;
		} else if (!moduleName.equals(other.moduleName))
			return false;
		if (permissionList == null) {
			if (other.permissionList != null)
				return false;
		} else if (!permissionList.equals(other.permissionList))
			return false;
		return true;
	}
	
}
