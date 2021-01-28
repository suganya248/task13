package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Staff;
import util.Db;
import util.Query;

public class StaffImpl implements IStaff {
	PreparedStatement pst = null;
	ResultSet rs = null;
	int result = 0;

	public int addStaff(Staff staff) {
		try {
			pst = Db.getCon().prepareStatement(Query.addStaff);
			pst.setInt(1, staff.getId());
			pst.setString(2, staff.getName());
			pst.setLong(3, staff.getSalary());
			pst.setInt(4, staff.getExp());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<Staff> viewStaff() {
		List<Staff> staff = new ArrayList<Staff>();
		try {
			pst = Db.getCon().prepareStatement(Query.viewStaff);
			rs = pst.executeQuery();
			while (rs.next()) {
				Staff s = new Staff(rs.getInt(1), rs.getString(2), rs.getLong(3), rs.getInt(4));
				staff.add(s);
			}

		} catch (ClassNotFoundException | SQLException e) {
			try {
				Db.getCon().close();
				pst.close();
				rs.close();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		return staff;
	}

	public int editStaff(Staff staff) {
		try {
			pst = Db.getCon().prepareStatement(Query.editStaff);
			pst.setInt(1, staff.getId());
			pst.setString(2, staff.getName());
			pst.setLong(3, staff.getSalary());
			pst.setInt(4, staff.getExp());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int removeStaff(Staff staff) {
		try {
			pst = Db.getCon().prepareStatement(Query.removeStaff);
			pst.setInt(1, staff.getId());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			result = 0;
		} finally {
			try {
				Db.getCon().close();
				pst.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}
