package egovframework.sit.cmmn.web;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;
public class JdbcDriverVersionCheck {

	public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println("Driver Name: " + driver.getClass().getName());
            System.out.println("Driver Version: " + driver.getMajorVersion() + "." + driver.getMinorVersion());
        }
	}

}
