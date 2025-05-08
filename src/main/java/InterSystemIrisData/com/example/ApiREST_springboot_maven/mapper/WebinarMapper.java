package InterSystemIrisData.com.example.ApiREST_springboot_maven.mapper;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.Webinar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WebinarMapper {

    @Select("SELECT * FROM SQLUser.webinar")
    List<Webinar> findAll();

    @Insert("INSERT INTO SQLUser.webinar (WebinarID, Creador, Fecha) VALUES (#{webinarID}, #{creador}, #{fecha})")
    void insert(Webinar webinar);

    @Delete("DELETE FROM SQLUser.webinar WHERE WebinarID = #{webinarID}")
    void deleteById(int webinarID);
}