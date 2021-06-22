package springcloudconfigclient.springcloudconfigclient;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@RefreshScope
@Component
@JsonIgnoreProperties({ "preFiltered", "targetSource","exposeProxy",
	"advisorCount","advisors","targetClass","proxiedInterfaces","proxyTargetClass",
	"targetObject","frozen" })
public class EnvConfiguration {

	@Value("${minimum:0}")
	Integer minimum;
	
	@Value("${maximum:0}")
	Integer maximum;
	
	@Value("${payementMethod:null}")
	String payementMethod;
	
	@Value("${holidays:null}")
	List<String> holidays;
	
	@Value("#{${creditCards:null}}")
	HashMap<String,String> creditCards;
	
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public List<String> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<String> holidays) {
		this.holidays = holidays;
	}
	public HashMap<String,String> getCreditCards() {
		return creditCards;
	}
	public void setCreditCards(HashMap<String,String> creditCards) {
		this.creditCards = creditCards;
	}

	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	public EnvConfiguration() {
		super();
	}
	
	
	public String getPayementMethod() {
		return payementMethod;
	}
	public void setPayementMethod(String payementMethod) {
		this.payementMethod = payementMethod;
	}
	public EnvConfiguration(Integer minimum, Integer maximum, String payementMethod, List<String> holidays,
			HashMap<String, String> creditCards) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
		this.payementMethod = payementMethod;
		this.holidays = holidays;
		this.creditCards = creditCards;
	}
	@Override
	public String toString() {
		return "EnvConfiguration [minimum=" + minimum + ", maximum=" + maximum + ", payementMethod=" + payementMethod
				+ ", holidays=" + holidays + ", creditCards=" + creditCards + "]";
	}
	
}
