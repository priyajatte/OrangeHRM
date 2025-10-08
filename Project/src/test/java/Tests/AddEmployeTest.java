	package Tests;

		import Base.BaseTest;
		import org.testng.Assert;
		import org.testng.annotations.Test;
		import Pages.AddEmployeePage;
		import Pages.DashboardPage;
		import Pages.LoginPage;

		public class AddEmployeTest extends BaseTest {

		    @Test
		    public void addNewEmployee() {
		        LoginPage login = new LoginPage(driver);
		        DashboardPage dashboard = login.loginAs(config.getProperty("username"), config.getProperty("password"));
		        dashboard.navigateToAddEmployee();

		        AddEmployeePage addEmployee = new AddEmployeePage(driver);
		        addEmployee.addEmployee("John", "Doe");

		        Assert.assertTrue(addEmployee.getProfileName().contains("John"), "Employee not added successfully");
		    }
		

	}


