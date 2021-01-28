package dao;

import java.util.List;

import model.Staff;

public interface IStaff {
	public int addStaff(Staff staff );

	  public List<Staff> viewStaff();

	  public int editStaff(Staff staff);

	  public int removeStaff(Staff staff);
}
