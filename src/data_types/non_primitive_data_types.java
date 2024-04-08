package data_types;

public class non_primitive_data_types {

	public static void main(String[] args) {
		//String class methods
		String course="java";
		String s2="Java";
		System.out.println(course.length());
		System.out.println(course.toUpperCase());
		System.out.println(course.toLowerCase());
		System.out.println(course.compareTo(s2));
		System.out.println(course.equals(s2));
		System.out.println(course.equalsIgnoreCase(s2));
		System.out.println(course.contains("j"));
	}

}
