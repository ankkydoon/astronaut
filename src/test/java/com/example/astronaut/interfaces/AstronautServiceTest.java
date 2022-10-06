package com.example.astronaut.interfaces;

import com.example.astronaut.Service.AstronautService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AstronautServiceTest {

    @Autowired
    AstronautService astronautService;
    Map<String, Integer> map;
    int test;
    List<String> list;

    @Before
    public void testData() {
        map = new HashMap<>();
        map.put("Tiangong", 3);
        map.put("ISS", 7);
        map.put("Endurance", 4);

        test =14;

        list = Arrays.asList("Kjell Lindgren", "Bob Hines", "Samantha Cristoforetti", "Jessica Watkins", "Sergey Prokopyev", "Dmitry Petelin", "Frank Rubio");

    }

    @Test
    public void testNumberOfAstronautsIsGreaterThanZero() {
        Assert.assertEquals(astronautService.getNumberOfAstronautsBySpaceCraft(), map);

    }
    @Test
    public void testNamesOfAstronautSizeGreaterThanZero() {
        Assert.assertEquals(astronautService.getAllAstronautsCurrentlyInSpace(),test);
    }

    @Test
    public void testNamesOfAstronautsInISS() {
        Assert.assertEquals(astronautService.namesOfAstronautsInISS(),list);
    }
}
