package com.example.astronaut.Service;

import java.util.List;
import java.util.Map;

public interface AstronautService {
  int getAllAstronautsCurrentlyInSpace();
  Map<String, Integer> getNumberOfAstronautsBySpaceCraft();
  List<String> namesOfAstronautsInISS();

}
