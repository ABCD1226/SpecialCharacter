package com.eec.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestEntity {

	private String specialCharecter1;// 特殊字符值1
	private String specialCharecter2;// 特殊字符值2
	private User innerBean;// JavaBean类型
	private List<String> list;// list类型
	private String[] array;// 数组类型
	private Set<String> set;// set类型
	private Map<String, String> map;// map类型
	private Properties props;// Properties类型
	private String emptyValue;// 注入空字符串值
	private String nullvalue = "init value";// 注入null值

	public void showValue() {
		System.out.println("特殊字符1：" + this.specialCharecter1);
		System.out.println("特殊字符2：" + this.specialCharecter2);
		System.out.println("内部Bean：" + this.innerBean.getUsername());
		System.out.println("List属性：" + this.list);
		System.out.println("数组属性[0]：" + this.array[0]);
		System.out.println("set属性：" + this.set);
		System.out.println("map属性：" + this.map);
		System.out.println("Properties属性：" + this.props);
		System.out.println("注入空字符串：[" + this.emptyValue + "]");
		System.out.println("注入null值：" + this.nullvalue);
	}

	public String getSpecialCharecter1() {
		return specialCharecter1;
	}

	public void setSpecialCharecter1(String specialCharecter1) {
		this.specialCharecter1 = specialCharecter1;
	}

	public String getSpecialCharecter2() {
		return specialCharecter2;
	}

	public void setSpecialCharecter2(String specialCharecter2) {
		this.specialCharecter2 = specialCharecter2;
	}

	public User getInnerBean() {
		return innerBean;
	}

	public void setInnerBean(User innerBean) {
		this.innerBean = innerBean;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getEmptyValue() {
		return emptyValue;
	}

	public void setEmptyValue(String emptyValue) {
		this.emptyValue = emptyValue;
	}

	public String getNullvalue() {
		return nullvalue;
	}

	public void setNullvalue(String nullvalue) {
		this.nullvalue = nullvalue;
	}

}
