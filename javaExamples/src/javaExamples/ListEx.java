package javaExamples;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> technologies = new ArrayList<>();
		technologies.add ("java");
		technologies.add ("C++");
		technologies.add ("Python");
		technologies.add ("Mysql");
		technologies.add (2,"HTML");
		
		System.out.println(technologies.get(2));
		System.out.println(" ");
		
		for(int i= 0; i<technologies.size(); i++)
		{
		System.out.println(technologies.get(i));
	}
 
}
}