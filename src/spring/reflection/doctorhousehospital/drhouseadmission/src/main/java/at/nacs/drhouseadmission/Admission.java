package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class Admission {

    private final DiagnosesClient diagnosesClient;

    public Patient admit(Patient patient) {
        String patientId = UUID.randomUUID().toString() ;
        patient.setId(patientId);
        diagnosesClient.sendPatient(patient);
        return patient;

    }
}
