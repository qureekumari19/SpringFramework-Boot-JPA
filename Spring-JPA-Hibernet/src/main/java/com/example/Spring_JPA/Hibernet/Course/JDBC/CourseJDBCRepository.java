package com.example.Spring_JPA.Hibernet.Course.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY=
            """
              insert into course(id,name,author) values(?,?,?);
            """;

    private static String DELETE_QUERY=
            """
              delete from course where id=?;
            """;

    private static String SELECT_QUERY=
            """
              Select * from course where id=?;
            """;
    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

//    public void deleteByID(long id) {
//        jdbcTemplate.update(DELETE_QUERY,id);
//    }

    public Course findById(long id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
    }
}
