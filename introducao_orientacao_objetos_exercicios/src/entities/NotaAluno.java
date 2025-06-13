package entities;

public class NotaAluno {
	
	public String name;
	public double grade;
	
	public double finalGrade() {
		return grade;
	}
	public double missing() {
		return 60 - grade;
	}
	
	public String toString() {
		
		if (grade >= 60) {
			return String.format("FINAL GRADE = %.2f"
					+ "%n"
					+ "PASS", finalGrade()
					);
		} else {
			return String.format("FINAL GRADE = %.2f"
					+ "%n"
					+ "FAILED"
					+ "%n"
					+ "MISSING %.2f POINTS"
					, finalGrade(), missing()
					);
		}
		
	}
}
