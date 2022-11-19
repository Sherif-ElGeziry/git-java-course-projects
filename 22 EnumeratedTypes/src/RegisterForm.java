enum Gender {
	Male, female
};

enum Course {
	Database, Programming, Maths, ERP
};

enum Semester {
	Summer, Fall, Winter, Spring
};

public class RegisterForm {
	String stdName;
	Gender stdGender;
	Course stdCourse;
	Semester sem;

	public RegisterForm() {
		stdName = "Sherif";
		stdGender = Gender.Male;
		stdCourse = Course.Maths;
		sem = Semester.Spring;

		// sem = "Winter";//Error
//		sem = 1;//Error
	}

}
