package gov.solar.permit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was automatically generated by the data modeler tool.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "residentId",
	    "residentName",
	    "hoaMember",
	    "address"
	})
@XmlRootElement(name="Resident")
public class Resident implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	
	@XmlElement(required = true)
	private java.lang.String residentId;
	@XmlElement(required = true)
	private java.lang.String residentName;
	@XmlElement(required = true)
	private boolean hoaMember;
	@XmlElement(required = true)
	private Address address;

	public Resident() {
		this.address = new Address();
	}

	public java.lang.String getResidentId() {
		return this.residentId;
	}

	public void setResidentId(java.lang.String residentId) {
		this.residentId = residentId;
	}

	public java.lang.String getResidentName() {
		return this.residentName;
	}

	public void setResidentName(java.lang.String residentName) {
		this.residentName = residentName;
	}

	public java.lang.String toString() {
		return "Resident::residentId:" + this.residentId + "\nResident::residentName:" + this.residentName
				+ "\nResident::hoaMember:" + this.hoaMember + "\n" + this.address;
	}

	public boolean isHoaMember() {
		return this.hoaMember;
	}

	public void setHoaMember(boolean hoaMember) {
		this.hoaMember = hoaMember;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Resident(java.lang.String residentId, java.lang.String residentName, boolean hoaMember, Address address) {
		this.residentId = residentId;
		this.residentName = residentName;
		this.hoaMember = hoaMember;
		this.address = address;
	}
}