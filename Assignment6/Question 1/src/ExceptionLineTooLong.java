
public class ExceptionLineTooLong extends Exception {
	private String errorName;
	private int errorNo;

	public ExceptionLineTooLong() {

	}

	public ExceptionLineTooLong(String errorName, int errorNo) {
		this.errorName = errorName;
		this.errorNo = errorNo;
	}

	public ExceptionLineTooLong(String errorName, int errorNo, String message) {
		super(message);
		this.errorName = errorName;
		this.errorNo = errorNo;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [errorName=" + errorName + ", errorNo=" + errorNo +"]"+super.getMessage();
	}

}
