package at.nacs.drhouseadmission;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor

public class AdmissionEndpoint {
    private final Admission admission;

    @PostMapping
    Patient send(@RequestBody Patient patient) {
        return patient;
    }
}
