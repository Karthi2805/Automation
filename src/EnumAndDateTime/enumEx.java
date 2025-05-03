package EnumAndDateTime;

public class enumEx {
	
	/* Enumerator:
	 * 		It's specialized class which got intorduced from java 1.5. 
	 * 		The purpose of enum is to store all th named constants. Enum keyword by default dereived from Enum class.
	 * 		First line of enum should be list of named constants, after that we can declare a variable or a method or a constructor.
	 * 		Each enum constants represents an object of type enum.
	 * 		We can declare enum in two ways. 1.Enum with in the class & 2.Enum as a sperate class.
	 */
	
	enum BrowserTypes {
		CHROME, FIREFOX, SAFARI, EDGE;
		//public static final BrowserTypes CHROME = New BrowserTypes();
	}

	public static void main(String[] args) {
		System.out.println(BrowserTypes.CHROME);
		System.out.println(BrowserTypes.FIREFOX);
		System.out.println("******************");
		
		BrowserTypes[] values = BrowserTypes.values();
		for (BrowserTypes browsers : values) {
			System.out.println(browsers);
		}
	}
}
