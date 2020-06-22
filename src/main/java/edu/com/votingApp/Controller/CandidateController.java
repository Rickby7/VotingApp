package edu.com.votingApp.Controller;

import edu.com.votingApp.Controller.dto.Candidate;
import edu.com.votingApp.Controller.dto.Gender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
    private List<Candidate> candidates = new ArrayList<>();



    public CandidateController() {
        candidates = new ArrayList<>();

        Candidate firstCandidate = new Candidate();
        firstCandidate.setName("Ivan");
        firstCandidate.setLastName("Duque");
        firstCandidate.setGender(Gender.MALE);
        firstCandidate.setAge(43);
        firstCandidate.setPoliticParty("Centro Democratico");
        firstCandidate.setCardNumber(1);

        Candidate secondCandidate = new Candidate();
        secondCandidate.setName("Gustavo");
        secondCandidate.setLastName("Petro");
        secondCandidate.setGender(Gender.MALE);
        secondCandidate.setAge(60);
        secondCandidate.setPoliticParty("Colombia Humana");
        secondCandidate.setCardNumber(2);

        Candidate thirdCandidate = new Candidate();
        thirdCandidate.setName("Sergio");
        thirdCandidate.setLastName("Fajardo");
        thirdCandidate.setGender(Gender.MALE);
        thirdCandidate.setAge(63);
        thirdCandidate.setPoliticParty("Coalicion Colombiana");
        thirdCandidate.setCardNumber(3);
    }

        @GetMapping("/")
        public List <Candidate> viewAllCandidates () { return candidates; }
}

