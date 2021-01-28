package controller;

import java.util.List;

import dao.StaffImpl;
import dao.IStaff;
import model.Staff;

public class StaffController {
	IStaff sImpl = new StaffImpl();

	public int addStaff(int id, String name, Long salary, int exp) {
		Staff staff = new Staff(id, name, salary, exp);
		return sImpl.addStaff(staff);
	}

	public List<Staff> viewStaff() {
		return sImpl.viewStaff();
	}

	public int editStaff(int id, String name, Long salary, int exp) {
		Staff staff = new Staff(id, name, salary, exp);
		return sImpl.editStaff(staff);
	}

	public int removeStaff(int id) {
		Staff staff = new Staff();
		staff.setId(id);
		return sImpl.removeStaff(staff);
	}

}
