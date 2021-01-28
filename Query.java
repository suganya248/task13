package util;

public class Query {
  public static String adminAuthentication = "select * from admin where name=? and password=?";
  public static String addStaff = "insert into staff values(?,?,?,?)";
  public static String viewStaff = "select * from staff";
  public static String editStaff = "update staff set name=?,salary=?,exp=? where id=?";
  public static String removeStaff = "delete from staff where id=?";
}
