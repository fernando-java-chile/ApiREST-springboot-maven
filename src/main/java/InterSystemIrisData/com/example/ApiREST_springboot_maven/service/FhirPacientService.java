package InterSystemIrisData.com.example.ApiREST_springboot_maven.service;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.FhirPacientDTO;
import InterSystemIrisData.com.example.ApiREST_springboot_maven.mapper.FhirPacientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FhirPacientService {
    @Autowired
    private FhirPacientMapper fhirPacientMapper; // Instancia inyectada de FhirPacientMapper

    public List<FhirPacientDTO> getAllPatients() {
        return fhirPacientMapper.findAll();
    }

    public FhirPacientDTO getPatientById(Integer patientId) {
        return fhirPacientMapper.findById(patientId);
    }

    public void addPatient(FhirPacientDTO fhirPacient) {
        fhirPacientMapper.insert(fhirPacient);
    }

    public void updatePatient(FhirPacientDTO fhirPacient) {
        fhirPacientMapper.update(fhirPacient);
    }

    public void deletePatient(Integer patientId) {
        fhirPacientMapper.deleteById(patientId);
    }

}
