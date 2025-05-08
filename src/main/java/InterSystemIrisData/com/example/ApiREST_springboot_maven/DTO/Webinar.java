package InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Webinar {
    private int webinarID;
    private String creador;
    private LocalDate fecha;

    @Override
    public String toString() {
        return String.format("Webinar{webinarID=%d, creador='%s', fecha=%s}", webinarID, creador, fecha);
    }
}