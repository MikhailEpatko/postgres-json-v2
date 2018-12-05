package ru.epatko.postgresjsonv2.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.epatko.postgresjsonv2.model.Details;
import ru.epatko.postgresjsonv2.model.MyNewModel;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRepositoryTest {

    @Autowired
    private MyRepository repository;

    @Test
    public void saveRequest() {

        String name = "name";
        String email = "email";
        int age = 1;
        Details details = new Details(email, name, age);
        MyNewModel model = new MyNewModel(details);

        MyNewModel saved = repository.save(model);

        assertEquals(saved, model);
    }
}