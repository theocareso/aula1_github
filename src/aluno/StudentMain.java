package aluno;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class StudentMain {

	// public static void main(String[] args) {
	// Student st = new Student();
	//
	// Locale.setDefault(Locale.US);
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Digite o nome do aluno: ");
	// st.nome = sc.nextLine();
	// System.out.println("Qual semestre será lançado? ");
	// String sem = sc.nextLine();
	// System.out.println("Digite as três notas do " + sem + " semestre: ");
	// st.x = sc.nextDouble();
	// st.y = sc.nextDouble();
	// st.z = sc.nextDouble();
	// //System.out.printf("%.2f%n%.2f%n%.2f%n", st.x, st.y, st.z);
	// double notaFinal = (st.x + st.y + st.z);
	//
	//
	//
	// if (sem == "1" && notaFinal >= 30.0) {
	// System.out.println(st.nome);
	// System.out.println("PASS");
	// System.out.print("FINAL GRADE = " + notaFinal);
	//
	// } else if (sem == "1" && notaFinal < 30) {
	// System.out.println(st.nome);
	// System.out.println("FAILED");
	// System.out.print("FINAL GRADE = " + notaFinal);
	// System.out.println(notaFinal - 30);
	//
	// } else if (sem == "2" && notaFinal >= 35) {
	// System.out.println(st.nome);
	// System.out.println("PASS");
	// System.out.print("FINAL GRADE = " + notaFinal);
	//
	// } else if (sem == "2" && notaFinal < 35) {
	// System.out.println(st.nome);
	// System.out.println("FAILED");
	// System.out.print("FINAL GRADE = " + notaFinal);
	// System.out.println(notaFinal-35);
	// }
	//
	// sc.close();
	//
	// }

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
			System.out.println("Boa noite! ");
		}
		sc.close();
	}

}
