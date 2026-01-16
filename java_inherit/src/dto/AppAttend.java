package dto;

import able.Attendance;

public class AppAttend implements Attendance{

	private boolean present = false; // 출석 상태
	
	@Override
	public void checkIn() {
		present=true;
		System.out.println("앱 출석 완료");		
	}

	@Override
	public void checkOut() {
		present = true;
		System.out.println( "앱 퇴실 완료");		
	}

	@Override
	public boolean isPresent() {
		return present;
	}

}
