package ishas;

public class car {
 
 private int maxSpeed;
 private String color;
 
 public void carInformation() {
	 System.out.println("Car color =" +color + " Maximum speed=" + maxSpeed);	 
 }
 
 public void setColor(String color) {
	 this.color = color; 
 }
 
 public void setMaxSpeed(int maxSpeed) {
	 this.maxSpeed=maxSpeed;
 }
}

