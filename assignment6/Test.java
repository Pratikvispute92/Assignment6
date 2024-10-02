package assignment6;

class TestA {
    
    public static void print() {
        System.out.println("Parent");
    }
}

class B extends TestA {
    
    public static void print() {
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) {
       
        Test objA = new Test();
        objA.print();  

        
        B objB = new B();
        objB.print();  

        
        B objAB = new B();
        objAB.print();  
    }

	private void print() {
		// TODO Auto-generated method stub
		
	}

	
}
