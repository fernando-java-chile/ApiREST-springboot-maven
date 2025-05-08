package InterSystemIrisData.com.example.ApiREST_springboot_maven.mapper;
import InterSystemIrisData.com.example.ApiREST_springboot_maven.DTO.FhirPacientDTO;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FhirPacientMapper {
    @Select("SELECT * FROM FHIR_PACIENT_CL_1_9_2")
    List<FhirPacientDTO> findAll();

    @Select("SELECT * FROM FHIR_PACIENT_CL_1_9_2 WHERE PATIENT_ID = #{patientId}")
    FhirPacientDTO findById(Integer patientId); // Correcto: Devuelve un FhirPacientDTO

    @Insert("""
        INSERT INTO FHIR_PACIENT_CL_1_9_2 (
            PATIENT_ID,ACTIVE, GENDER, BIRTH_DATE, DECEASED_BOOLEAN, DECEASED_DATETIME, NAME_FAMILY, NAME_GIVEN,
            NAME_PREFIX, NAME_SUFFIX, TELECOM_SYSTEM, TELECOM_VALUE, ADDRESS_LINE, ADDRESS_CITY,
            ADDRESS_STATE, ADDRESS_POSTAL_CODE, ADDRESS_COUNTRY, MARITAL_STATUS, MULTIPLE_BIRTH_BOOLEAN,
            MULTIPLE_BIRTH_INTEGER, PHOTO_URL, IDENTIDAD_GENERO_CODE, IDENTIDAD_GENERO_DISPLAY,
            SEXO_BIOLOGICO_CODE, SEXO_BIOLOGICO_DISPLAY, NACIONALIDAD_CODE, NACIONALIDAD_DISPLAY,
            IDENTIFIER_USE, IDENTIFIER_TYPE_CODE, IDENTIFIER_TYPE_DISPLAY, IDENTIFIER_VALUE,
            NOMBRE_OFICIAL_FAMILY, NOMBRE_OFICIAL_GIVEN, SEGUNDO_APELLIDO, NOMBRE_SOCIAL_GIVEN,
            CONTACT_RELATIONSHIP_CODE, CONTACT_RELATIONSHIP_DISPLAY, CONTACT_NAME_FAMILY,
            CONTACT_NAME_GIVEN, COMMUNICATION_LANGUAGE_CODE, COMMUNICATION_LANGUAGE_DISPLAY,
            GENERAL_PRACTITIONER_REFERENCE, GENERAL_PRACTITIONER_DISPLAY, CREATED_BY, LAST_UPDATED_BY
        ) VALUES (
            #{patientId}, #{active}, #{gender}, #{birthDate}, #{deceasedBoolean}, #{deceasedDatetime}, #{nameFamily},
            #{nameGiven}, #{namePrefix}, #{nameSuffix}, #{telecomSystem}, #{telecomValue}, #{addressLine},
            #{addressCity}, #{addressState}, #{addressPostalCode}, #{addressCountry}, #{maritalStatus},
            #{multipleBirthBoolean}, #{multipleBirthInteger}, #{photoUrl}, #{identidadGeneroCode},
            #{identidadGeneroDisplay}, #{sexoBiologicoCode}, #{sexoBiologicoDisplay}, #{nacionalidadCode},
            #{nacionalidadDisplay}, #{identifierUse}, #{identifierTypeCode}, #{identifierTypeDisplay},
            #{identifierValue}, #{nombreOficialFamily}, #{nombreOficialGiven}, #{segundoApellido},
            #{nombreSocialGiven}, #{contactRelationshipCode}, #{contactRelationshipDisplay},
            #{contactNameFamily}, #{contactNameGiven}, #{communicationLanguageCode},
            #{communicationLanguageDisplay}, #{generalPractitionerReference}, #{generalPractitionerDisplay},
            #{createdBy}, #{lastUpdatedBy}
        )
    """)
    @Options(useGeneratedKeys = true, keyProperty = "patientId")
    void insert(FhirPacientDTO fhirPacient);

    @Update("""
        UPDATE FHIR_PACIENT_CL_1_9_2 SET
            ACTIVE = #{active}, GENDER = #{gender}, BIRTH_DATE = #{birthDate}, DECEASED_BOOLEAN = #{deceasedBoolean},
            DECEASED_DATETIME = #{deceasedDatetime}, NAME_FAMILY = #{nameFamily}, NAME_GIVEN = #{nameGiven},
            NAME_PREFIX = #{namePrefix}, NAME_SUFFIX = #{nameSuffix}, TELECOM_SYSTEM = #{telecomSystem},
            TELECOM_VALUE = #{telecomValue}, ADDRESS_LINE = #{addressLine}, ADDRESS_CITY = #{addressCity},
            ADDRESS_STATE = #{addressState}, ADDRESS_POSTAL_CODE = #{addressPostalCode},
            ADDRESS_COUNTRY = #{addressCountry}, MARITAL_STATUS = #{maritalStatus},
            MULTIPLE_BIRTH_BOOLEAN = #{multipleBirthBoolean}, MULTIPLE_BIRTH_INTEGER = #{multipleBirthInteger},
            PHOTO_URL = #{photoUrl}, IDENTIDAD_GENERO_CODE = #{identidadGeneroCode},
            IDENTIDAD_GENERO_DISPLAY = #{identidadGeneroDisplay}, SEXO_BIOLOGICO_CODE = #{sexoBiologicoCode},
            SEXO_BIOLOGICO_DISPLAY = #{sexoBiologicoDisplay}, NACIONALIDAD_CODE = #{nacionalidadCode},
            NACIONALIDAD_DISPLAY = #{nacionalidadDisplay}, IDENTIFIER_USE = #{identifierUse},
            IDENTIFIER_TYPE_CODE = #{identifierTypeCode}, IDENTIFIER_TYPE_DISPLAY = #{identifierTypeDisplay},
            IDENTIFIER_VALUE = #{identifierValue}, NOMBRE_OFICIAL_FAMILY = #{nombreOficialFamily},
            NOMBRE_OFICIAL_GIVEN = #{nombreOficialGiven}, SEGUNDO_APELLIDO = #{segundoApellido},
            NOMBRE_SOCIAL_GIVEN = #{nombreSocialGiven}, CONTACT_RELATIONSHIP_CODE = #{contactRelationshipCode},
            CONTACT_RELATIONSHIP_DISPLAY = #{contactRelationshipDisplay}, CONTACT_NAME_FAMILY = #{contactNameFamily},
            CONTACT_NAME_GIVEN = #{contactNameGiven}, COMMUNICATION_LANGUAGE_CODE = #{communicationLanguageCode},
            COMMUNICATION_LANGUAGE_DISPLAY = #{communicationLanguageDisplay},
            GENERAL_PRACTITIONER_REFERENCE = #{generalPractitionerReference},
            GENERAL_PRACTITIONER_DISPLAY = #{generalPractitionerDisplay}, LAST_UPDATED_BY = #{lastUpdatedBy}
        WHERE PATIENT_ID = #{patientId}
    """)
    void update(FhirPacientDTO fhirPacient);

    @Delete("DELETE FROM FHIR_PACIENT_CL_1_9_2 WHERE PATIENT_ID = #{patientId}")
    void deleteById(Integer patientId);
}
