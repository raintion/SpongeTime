package net.ihypo.work;

public class Work {
	private int id;
	private String title;
	private int userId;
	private String data;
	
	public Work(int id){
		this.id = id;
	}
	
	public Work(int id,String title,int userId,String data){
		this.id = id;
		this.title = title;
		this.userId = userId;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getUserId() {
		return userId;
	}

	public String getData() {
		return data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Work other = (Work) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
