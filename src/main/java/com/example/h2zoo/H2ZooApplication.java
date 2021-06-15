package com.example.h2zoo;

import com.example.h2zoo.model.Birds;
import com.example.h2zoo.model.Mammals;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdsRepository;
import com.example.h2zoo.repository.MammalsRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

	BirdsRepository birdsRepository =
			configurableApplicationContext.getBean(BirdsRepository.class);
	Birds parrot = new Birds("Tiktok", "Bird", "Red");
	Birds dove = new Birds("Peace", "White-winged", "White");
	birdsRepository.saveAll(List.of(parrot, dove));

		MammalsRepository mammalsRepository =
				configurableApplicationContext.getBean(MammalsRepository.class);
		Mammals deer = new Mammals("LittleRock", "small", "orange");
		Mammals eliphant = new Mammals("BigBoy", "african", "grey");
		mammalsRepository.saveAll(List.of(deer, eliphant));
}
}