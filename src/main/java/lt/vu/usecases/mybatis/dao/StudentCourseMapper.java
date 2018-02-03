package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.StudentCourse;
import org.apache.ibatis.annotations.Param;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface StudentCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT_COURSE
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    int deleteByPrimaryKey(@Param("studentId") Integer studentId, @Param("courseId") Integer courseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT_COURSE
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    int insert(StudentCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT_COURSE
     *
     * @mbg.generated Tue Mar 14 20:35:20 EET 2017
     */
    List<StudentCourse> selectAll();
}