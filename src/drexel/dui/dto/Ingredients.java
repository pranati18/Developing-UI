package drexel.dui.dto;

public class Ingredients {
private String[] meat;
private String[] dairy;
private String[] vegetables;
private String[] sauces;

public Ingredients() {
	// TODO Auto-generated constructor stub
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
public String[] getMeat() {
	return meat;
}
public void setMeat(String[] meat) {
	this.meat = meat;
}
public String[] getDairy() {
	return dairy;
}
public void setDairy(String[] dairy) {
	this.dairy = dairy;
}
public String[] getVegetables() {
	return vegetables;
}
public void setVegetables(String[] vegetables) {
	this.vegetables = vegetables;
}
public String[] getSauces() {
	return sauces;
}
public void setSauces(String[] sauces) {
	this.sauces = sauces;
}

}
