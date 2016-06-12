package drexel.dui.dto;

public class FoodPreference {
private String[] foodPreference;
private String[] cookingExperience;

public FoodPreference() {
	// TODO Auto-generated constructor stub
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
public String[] getFoodPreference() {
	return foodPreference;
}
public void setFoodPreference(String[] foodPreference) {
	this.foodPreference = foodPreference;
}
public String[] getCookingExperience() {
	return cookingExperience;
}
public void setCookingExperience(String[] cookingExperience) {
	this.cookingExperience = cookingExperience;
}


}
