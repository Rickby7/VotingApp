package edu.com.votingApp.Controller;

import edu.com.votingApp.Controller.Exception.NoContentException;
import edu.com.votingApp.Controller.dto.Citizen;
import edu.com.votingApp.Controller.dto.Gender;
import edu.com.votingApp.Controller.dto.VotationPlace;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/citizens")
public class CitizenController {
    private List<Citizen> citizens = new ArrayList<>();
    private List <Citizen> votes = new ArrayList<>();

    public CitizenController () {

        Citizen firstCitizen = new Citizen();
        firstCitizen.setName("Cristian");
        firstCitizen.setLastName("Torres");
        firstCitizen.setDocumentNumber(1020495395);
        firstCitizen.setGender(Gender.MALE);
        firstCitizen.setAge(20);
        firstCitizen.setId(1);

        List <VotationPlace> places1 = new ArrayList<>();
        VotationPlace place1 = new VotationPlace();
        place1.setName("Tulio Ospina");
        place1.setDirection("Via Regional, Bello, Antioquia");
        place1.setMunicipality("Bello");
        place1.setDepartment("Antioquia");
        place1.setCountry("Colombia");
        places1.add(place1);

        firstCitizen.setVotationPlace(places1);
        citizens.add(firstCitizen);


        Citizen secondCitizen = new Citizen();
        secondCitizen.setName("Marta");
        secondCitizen.setLastName("Duque");
        secondCitizen.setDocumentNumber(1020495396);
        secondCitizen.setGender(Gender.FEMALE);
        secondCitizen.setAge(42);
        secondCitizen.setId(2);

        List <VotationPlace> places2 = new ArrayList<>();
        VotationPlace place2 = new VotationPlace();
        place2.setName("Universidad de Cundinamarca");
        place2.setDirection("Cra. 6 #1250");
        place2.setMunicipality("Soacha");
        place2.setDepartment("Cundinamarca");
        place2.setCountry("Colombia");
        places2.add(place2);

        secondCitizen.setVotationPlace(places2);
        citizens.add(secondCitizen);

        Citizen thirdCitizen = new Citizen();
        thirdCitizen.setName("Jakelinne");
        thirdCitizen.setLastName("Torres");
        thirdCitizen.setDocumentNumber(1002106851);
        thirdCitizen.setGender(Gender.FEMALE);
        thirdCitizen.setAge(18);
        thirdCitizen.setId(3);

        List <VotationPlace> places3 = new ArrayList<>();
        VotationPlace place3 = new VotationPlace();
        place3.setName("Udea Robledo");
        place3.setDirection("Cra. 74a #93-30");
        place3.setMunicipality("Robledo");
        place3.setDepartment("Antioquia");
        place3.setCountry("Colombia");
        places3.add(place3);

        thirdCitizen.setVotationPlace(places3);
        citizens.add(thirdCitizen);
        }

        @GetMapping("/")
    public List <Citizen> viewAllCitizens () {
            return citizens;
        }
        @GetMapping ("/{id}")
    public Citizen viewCitizenById (@PathVariable int id) {

        return citizens.stream()
                    .filter(citizen -> citizen.getId() == id)
                    .findFirst()
                    .orElseThrow(NoContentException::new);
        }

    @PostMapping("/{id}/{cardNumber}")
    public Citizen saveVote (@PathVariable Integer id, Integer cardNumber) {

        /*if (citizens.contains(id) && !votes.contains(id))
        {}*/
            Citizen citizenVote = citizens.stream()
                    .filter(citizen -> citizen.getId() == id)
                    .findFirst()
                    .orElseThrow(NoContentException::new);
            citizenVote.setVote(cardNumber);
            votes.add(citizenVote);
            return citizenVote;
    }
    @GetMapping("/votes")
    public List <Citizen> viewVotes () {
        return votes;
    }

    }