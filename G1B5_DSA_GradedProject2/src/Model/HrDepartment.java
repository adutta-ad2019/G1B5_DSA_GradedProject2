package Model;

public class HrDepartment extends SuperDepartment{
	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return " Hr Department ";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return " Fill today’s timesheet and mark your attendance ";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return " Complete by EOD ";
	}
	public String doActivity() {
		// TODO Auto-generated method stub
		return " team Lunch ";
	}
}
