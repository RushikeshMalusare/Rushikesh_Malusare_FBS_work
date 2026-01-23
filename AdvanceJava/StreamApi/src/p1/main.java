package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student>allStudent=new ArrayList();
		allStudent.add(new Student(1,"yash",78,"M"));
		allStudent.add(new Student(2,"yash",89,"M"));
		allStudent.add(new Student(3,"manoj",83,"M"));
		allStudent.add(new Student(4,"tushar",81,"M")); 
		
		HashMap<String, List<Student>>byNm=(HashMap<String, List<Student>>)
				allStudent.stream().collect(Collectors.groupingBy(Student::getNm));
		System.out.println(byNm);
		
		
//		HashMap<String,List<Student>>.byNm=(HashMap<String,List<Student>>)allStudent.stream().
//				collect(Collectors.groupingBy(Student::getNm()));
		
		//iteration
		//allStudent.stream().forEach(ref->System.out.println(ref.getNm()));
		
		//filtering
		//allStudent.stream().filter(kuchbhi->kuchbhi.getMark()>80).forEach(ref->System.out.println(ref.getNm()));
	
		//pipeline
		
		//Optional<Double> avgMark=allStudent.stream().filter(ref->ref.getGender().equals("M")).mapToDouble(ref->ref.getMark()).average();
	
	}
}
