package at.nacs.drhousediagnose;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrHouse {
    private final BedsClient bedsClient;

    public Patient visit(Patient patient) {
        patient.setDiagnosis("lupus");
        return patient;
    }
}
