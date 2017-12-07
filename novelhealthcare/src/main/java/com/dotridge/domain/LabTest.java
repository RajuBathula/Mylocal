package com.dotridge.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class LabTest implements Serializable {

	private static final long serialVersionUID = 8386031327051443452L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int labTestId;
	private String testName;
	private String status;
	private int referenceRange;
	private int unit;
	@OneToOne
	private LabTestCategories testCategories;
<<<<<<< HEAD
	public int getLabTestId() {
		return labTestId;
	}
	public void setLabTestId(int labTestId) {
		this.labTestId = labTestId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getReferenceRange() {
		return referenceRange;
	}
	public void setReferenceRange(int referenceRange) {
		this.referenceRange = referenceRange;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public LabTestCategories getTestCategories() {
		return testCategories;
	}
	public void setTestCategories(LabTestCategories testCategories) {
		this.testCategories = testCategories;
	}
	@Override
	public String toString() {
		return "LabTest [labTestId=" + labTestId + ", testName=" + testName + ", status=" + status + ", referenceRange="
				+ referenceRange + ", unit=" + unit + ", testCategories=" + testCategories + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + labTestId;
		result = prime * result + referenceRange;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((testCategories == null) ? 0 : testCategories.hashCode());
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
		result = prime * result + unit;
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
		LabTest other = (LabTest) obj;
		if (labTestId != other.labTestId)
			return false;
		if (referenceRange != other.referenceRange)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (testCategories == null) {
			if (other.testCategories != null)
				return false;
		} else if (!testCategories.equals(other.testCategories))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		if (unit != other.unit)
			return false;
		return true;
	}
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082

}
