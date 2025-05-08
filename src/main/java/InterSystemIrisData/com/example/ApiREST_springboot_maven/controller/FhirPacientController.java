package InterSystemIrisData.com.example.ApiREST_springboot_maven.controller;

import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.FhirPacientDTO;
import InterSystemIrisData.com.example.ApiREST_springboot_maven.service.FhirPacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class FhirPacientController {
    @Autowired
    private FhirPacientService fhirPacientService;

    @GetMapping
    public List<FhirPacientDTO> getAllPatients() {
        return fhirPacientService.getAllPatients();
    }

    @GetMapping("/{patientId}")
    public FhirPacientDTO getPatientById(@PathVariable Integer patientId) {
        return fhirPacientService.getPatientById(patientId);
    }

    @PostMapping
    public void addPatient(@RequestBody FhirPacientDTO fhirPacient) {
        fhirPacientService.addPatient(fhirPacient);
    }

    @PutMapping("/{patientId}")
    public void updatePatient(@PathVariable Integer patientId, @RequestBody FhirPacientDTO fhirPacient) {
        fhirPacient.setPatientId(patientId); // Asegúrate de que el ID coincida
        fhirPacientService.updatePatient(fhirPacient);
    }

    @DeleteMapping("/{patientId}")
    public void deletePatient(@PathVariable Integer patientId) {
        fhirPacientService.deletePatient(patientId);
    }
}

