package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class DiagnosesClient {
    private final RestTemplate restTemplate;

    @Value("${diagnose}")
    private String url;

    void sendPatient(Patient patient) {
        restTemplate.postForObject(url, patient, Patient.class);
    }
}
