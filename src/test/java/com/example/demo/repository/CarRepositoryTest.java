package com.example.demo.repository;

import com.example.demo.domain.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void should_got_3L_order_when_count_given_a_new_order_and_initialized_2_cars_in_sql() {
        carRepository.save(new Car("Mazda"));

        long countAfterSavedNew = carRepository.count();

        then(countAfterSavedNew).isEqualTo(3L);
    }
}
