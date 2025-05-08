package InterSystemIrisData.com.example.ApiREST_springboot_maven.repository;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.Webinar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class WebinarRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Webinar> findAll() {
        String sql = "SELECT * FROM SQLUser.webinar";
        return jdbcTemplate.query(sql, new RowMapper<Webinar>() {
            @Override
            public Webinar mapRow(@NonNull ResultSet rs, int rowNum) throws SQLException {
                return new Webinar(rs.getInt("WebinarID"), rs.getString("Creador"), rs.getDate("Fecha").toLocalDate());
            }
        });
    }

    public void insert(Webinar webinar) {
        String sql = "INSERT INTO SQLUser.webinar (WebinarID, Creador, Fecha) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, webinar.getWebinarID(), webinar.getCreador(), webinar.getFecha());
    }
}