package multilevel;

class calculator{
	public float mul(float p,float q) {
		return p*q;	
	}
	public float diff(float a,float b) {
		return a-b;
	}
	public float sum(float x,float y) {
		return x+y;
	}
	public float div(float n,float m) {
		return m/n;
	}
}
  

class advanced extends calculator{
	  public float mod(float m,float n) {
		  return m%n;
	  }
	  public float sqr(float m) {
		  return m*m;
	  }
	  public float sqrt(float n) {
		System.out.println(Math.sqrt(n));  
	   return n;}
	  }
  
  
  class area extends calculator{
	  public float square(float m) {
		  return m*m;
	  }
	  public float rectangle(float l, float b) {
		  return l*b;
		  
	  }
  }

  
  public class baseclass {

	public static void main(String[] args) {
		area edureka = new area();
		float addresult = edureka.sum(10, 12);
		System.out.println(addresult);
		
		advanced object = new advanced();
		float modresult=object.mod(21, 5);
		
		System.out.println(modresult);
		

	}

}
