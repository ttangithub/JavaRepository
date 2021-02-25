package com.ttan.java8;

public class BuilderPattern {
	
	private final int servingSize;	// Required
	private final int servings; 	// Required
	private final int calories;		// Optional
	private final int fat;			// Optional
	private final int sodium;		// Optional
	private final int carbohydrate;	// Optional
	
	public static class Builder {
		private final int servingSize;
		private final int servings;
		
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) {
			calories = val;
			return this;
		}
		
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}
	
	private BuilderPattern(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public static void main(String[] args) {
		BuilderPattern cocaCola = new BuilderPattern.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
	}

}