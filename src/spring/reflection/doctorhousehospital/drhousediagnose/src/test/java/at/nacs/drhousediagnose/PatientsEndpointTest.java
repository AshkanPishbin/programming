package at.nacs.drhousediagnose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.beans.Transient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PatientsEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;
    String url = "/patients";

    @Test
    void getPatient() {
        Patient patient = Patient.builder().name("Paul").symptoms("alzaimer").build();
        Patient actual=testRestTemplate.postForObject(url,patient,Patient.class);
        Assertions.assertThat(actual.getName()).isEqualTo("Paul");
        Assertions.assertThat(actual.getSymptoms()).isEqualTo("alzaimer");



    }
}