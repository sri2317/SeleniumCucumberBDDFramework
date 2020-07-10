package StepDefinitions;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	 

	public class SingletonDriverClass {

	 

	    
	       // static variable single_instance of type Singleton 
		public static WebDriver single_instance = null; 
	      
	        // variable of type String 
	        public String s; 
	      
	        // private constructor restricted to this class itself 
	        private SingletonDriverClass() 
	        { 
	            s = "Hello I am a string part of Singleton class"; 
	        } 
	      
	        // static method to create instance of Singleton class 
	        public static WebDriver getInstance() 
	        { 
	            if (single_instance == null) 
	                single_instance = new ChromeDriver();; 
	      
	            return single_instance; 
	        } 
	    } 

