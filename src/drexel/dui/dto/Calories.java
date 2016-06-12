package drexel.dui.dto;

public class Calories {
private String calories;
private String[] cookingTime;
private String[] mealType;
private String other;

public Calories() {
	// TODO Auto-generated constructor stub
}

public String getCalories() {
	return calories;
}

public void setCalories(String calories) {
	this.calories = calories;
}

public String[] getCookingTime() {
	return cookingTime;
}

public void setCookingTime(String[] cookingTime) {
	this.cookingTime = cookingTime;
}

public String[] getMealType() {
	return mealType;
}

public void setMealType(String[] mealType) {
	this.mealType = mealType;
}

public String getOther() {
	return other;
}

public void setOther(String other) {
	this.other = other;
}

}
