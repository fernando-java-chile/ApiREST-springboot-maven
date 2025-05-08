package InterSystemIrisData.com.example.ApiREST_springboot_maven.service;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.Webinar;
import InterSystemIrisData.com.example.ApiREST_springboot_maven.mapper.WebinarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebinarService {

    @Autowired
    private WebinarMapper webinarMapper;

    /// Obtiene todos los webinars
    public List<Webinar> getAllWebinars() {
        return webinarMapper.findAll();
    }

    // Agrega un nuevo webinar
    public void addWebinar(Webinar webinar) {
        webinarMapper.insert(webinar);
    }

    // Elimina un webinar por su ID
    public void removeWebinar(int webinarID) {
        webinarMapper.deleteById(webinarID);
    }
}