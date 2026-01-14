package study20260114;

public class GameMember {

	private String name;
	private String birth;
	private String nickName;
	private int level;
	
	
	public GameMember() {
		super();
	}
	public GameMember(String name, String birth, String nickName, int level) {
		super();
		this.name = name;
		this.birth = birth;
		this.nickName = nickName;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "GameMember [name=" + name + ", birth=" + birth + ", nickName=" + nickName + ", level=" + level + "]";
	}
	
	
}
