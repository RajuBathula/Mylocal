package com.dotridge.domain;

<<<<<<< HEAD
import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;

@Entity
public class Patient implements Serializable {
	private static final long serialVersionUID = -3180031424576492824L;
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String address;
	private long phone;
	private String password;
	private String gender;
	private String bloodGroup;
	private String requiredDocument;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	@Column
	@Type(type = "yes_no")
	private boolean status = false;
	@OneToMany
	private List<PatientTest> patTest;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getRequiredDocument() {
		return requiredDocument;
	}
	public void setRequiredDocument(String requiredDocument) {
		this.requiredDocument = requiredDocument;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<PatientTest> getPatTest() {
		return patTest;
	}
	public void setPatTest(List<PatientTest> patTest) {
		this.patTest = patTest;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", address=" + address + ", phone=" + phone + ", password=" + password
				+ ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", requiredDocument=" + requiredDocument
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + ", status=" + status + ", patTest=" + patTest + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((modifiedBy == null) ? 0 : modifiedBy.hashCode());
		result = prime * result + ((modifiedDate == null) ? 0 : modifiedDate.hashCode());
		result = prime * result + pId;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((patTest == null) ? 0 : patTest.hashCode());
		result = prime * result + (int) (phone ^ (phone >>> 32));
		result = prime * result + ((requiredDocument == null) ? 0 : requiredDocument.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bloodGroup == null) {
			if (other.bloodGroup != null)
				return false;
		} else if (!bloodGroup.equals(other.bloodGroup))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (modifiedBy == null) {
			if (other.modifiedBy != null)
				return false;
		} else if (!modifiedBy.equals(other.modifiedBy))
			return false;
		if (modifiedDate == null) {
			if (other.modifiedDate != null)
				return false;
		} else if (!modifiedDate.equals(other.modifiedDate))
			return false;
		if (pId != other.pId)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (patTest == null) {
			if (other.patTest != null)
				return false;
		} else if (!patTest.equals(other.patTest))
			return false;
		if (phone != other.phone)
			return false;
		if (requiredDocument == null) {
			if (other.requiredDocument != null)
				return false;
		} else if (!requiredDocument.equals(other.requiredDocument))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
=======
public class Patient {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082

}
