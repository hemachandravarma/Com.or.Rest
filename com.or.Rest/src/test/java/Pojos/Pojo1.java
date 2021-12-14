package Pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pojo1 {
	
	//properties which are equal to fields of json
	private int id;
	private String title;
	private String body;
	private int userId;
	
	//Constructor method for json fields and java propertie 
	@JsonCreator 
	public Pojo1(@JsonProperty("id") int i, @JsonProperty("title") String t,
			@JsonProperty("body") String b,@JsonProperty("userId") int u) 
	{
		this.id=i;
		this.title=t;
		this.body=b;
		this.userId=u;
	}
	//getters methods
	public int getId()
	{
		return(id);
	}
	public String getTitle()
	{
		return(title);
	}
	public int getUserId()
	{
		return(userId);
	}
	public String getBody()
	{
		return(body);
	}

}
