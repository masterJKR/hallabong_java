package study20260114;

public class MainMethod {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		System.out.println( gameMembers[2] );
	}

}
