package InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class FhirPacientDTO {
    private Integer patientId;
    private String active;
    private String gender;
    private Date birthDate;
    private String deceasedBoolean;
    private Date deceasedDatetime;
    private String nameFamily;
    private String nameGiven;
    private String namePrefix;
    private String nameSuffix;
    private String telecomSystem;
    private String telecomValue;
    private String addressLine;
    private String addressCity;
    private String addressState;
    private String addressPostalCode;
    private String addressCountry;
    private String maritalStatus;
    private String multipleBirthBoolean;
    private Integer multipleBirthInteger;
    private String photoUrl;
    private String identidadGeneroCode;
    private String identidadGeneroDisplay;
    private String sexoBiologicoCode;
    private String sexoBiologicoDisplay;
    private String nacionalidadCode;
    private String nacionalidadDisplay;
    private String identifierUse;
    private String identifierTypeCode;
    private String identifierTypeDisplay;
    private String identifierValue;
    private String nombreOficialFamily;
    private String nombreOficialGiven;
    private String segundoApellido;
    private String nombreSocialGiven;
    private String contactRelationshipCode;
    private String contactRelationshipDisplay;
    private String contactNameFamily;
    private String contactNameGiven;
    private String communicationLanguageCode;
    private String communicationLanguageDisplay;
    private String generalPractitionerReference;
    private String generalPractitionerDisplay;
    private Date createdDate;
    private Date lastUpdated;
    private String createdBy;
    private String lastUpdatedBy;

    @Override
    public String toString() {
        return String.format("Patient{Id=%d, creador='%s', fecha=%s}", patientId, nombreOficialGiven, createdBy);
    }
}
