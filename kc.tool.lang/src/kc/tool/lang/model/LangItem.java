package kc.tool.lang.model;

public class LangItem {
	String name;
	String value;
	
	public LangItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LangItem(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
