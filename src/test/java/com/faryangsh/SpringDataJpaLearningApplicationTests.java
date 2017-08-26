package com.faryangsh;

import com.faryangsh.mongodb.School;
import com.faryangsh.mongodb.Student;
import com.faryangsh.repository.SchoolReponsitory;
import com.faryangsh.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaLearningApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private SchoolReponsitory schoolReponsitory;


	@Test
	public void contextLoads() {
	}

	/**
	 * 第一次单元测试
	 * - student实体没有加home属性
	 *
	 * @throws Exception
	 */
	@Test
	public void insertStudentWithoutHome() throws Exception {
		School school1 = schoolReponsitory.findSchoolByName("南京路中学");
		School school2 = schoolReponsitory.findSchoolByName("北京路中学");

		/*studentRepository.save(new Student(1L, "小明", 30,school1));
		studentRepository.save(new Student(2L, "小红", 40,school1));
		studentRepository.save(new Student(3L, "小王", 50,school2));*/
	}

	/**
	 * 第二次单元测试
	 * - student实体加home属性
	 * @throws Exception
	 */
	@Test
	public void insertStudentWitHome() throws Exception {
		School school1 = schoolReponsitory.findSchoolByName("南京路中学");
		School school2 = schoolReponsitory.findSchoolByName("北京路中学");

		/*studentRepository.save(new Student(4L, "tom", 30,school1,"1小区"));
		studentRepository.save(new Student(5L, "peter", 40,school1,"2小区"));
		studentRepository.save(new Student(6L, "joy", 50,school2,"3小区"));*/
	}

	/**
	 * 对查询结果打印
	 *
	 */
	@Test
	public void findAll(){
		List<Student> students = studentRepository.findAll();
		students.forEach(student -> {
			System.out.println(student);
		});
	}

	@Test
	public void insertSchool(){
		School school1 = School.builder().address("南京路").name("南京路中学").id(1L).build();
		School school2 = School.builder().address("北京路").name("北京路中学").id(2L).build();

		schoolReponsitory.save(school1);
		schoolReponsitory.save(school2);

		School school = schoolReponsitory.findSchoolByName("南京路中学");
		System.out.println(school);
	}
}
