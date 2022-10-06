package com.example.astronaut.Service;

import com.example.astronaut.Entity.People;
import com.example.astronaut.ServiceRepo.AstronautRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AstronautServiceImpl implements AstronautService {

    AstronautRepository repository;

    public AstronautServiceImpl(AstronautRepository repository) {
        this.repository = repository;
    }

    @Override
    public int getAllAstronautsCurrentlyInSpace() {
        return repository.getAstronautObject().getNumber();
    }

    @Override
    public Map<String, Integer> getNumberOfAstronautsBySpaceCraft() {
        return repository.getAstronautObject()
                .getPeople()
                .stream()
                .collect(Collectors
                        .groupingBy(People::getCraft
                                , Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));


//        return repository.getAstronautObject()
//                .getPeopleList()
//                .stream()
//                .map(people -> people.)


//                .collect(Collectors
//                        .groupingBy(People::getName,Collectors.mapping(People::getCraft, Collectors.counting())));
    }


    @Override
    public List<String> namesOfAstronautsInISS() {
        return repository.getAstronautObject()
                .getPeople()
                .stream()
                .filter(people -> people.getCraft().equals("ISS"))
                .map(people -> people.getName())
                .collect(Collectors.toList());
    }
}
