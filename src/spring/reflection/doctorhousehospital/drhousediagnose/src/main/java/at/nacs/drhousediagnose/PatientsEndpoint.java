package at.nacs.drhousediagnose;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientsEndpoint {
    private final DrHouse drHouse;

    @PostMapping
    public Patient getPatient(@RequestBody Patient patient) {
        return drHouse.visit(patient);
    }
}
