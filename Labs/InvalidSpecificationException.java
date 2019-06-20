
public class InvalidSpecificationException extends Exception{
	private double spec;
	
	public InvalidSpecificationException(double spec) {
		super("Invalid specification " + spec);
		this.spec = spec;
	}

}
