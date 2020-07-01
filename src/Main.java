class Test 
{ 
    // We can initialize here, but if we 
    // initialize here, then all objects get 
    // the same value.  So we use blank final 
    final int i;  // if you initialize the value here compilere will throw an error
  
    Test(int x) 
    { 
        // Since we have initialized above, we 
        // must initialize i in constructor. 
        // If we remove this line, we get compiler 
        // error. 
        i = x; 
    } 
} 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(10); 
		System.out.println(t1.i);

	}

}
