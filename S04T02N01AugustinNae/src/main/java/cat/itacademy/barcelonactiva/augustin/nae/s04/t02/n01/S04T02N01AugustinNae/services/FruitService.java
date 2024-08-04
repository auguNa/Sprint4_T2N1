package cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.services;

import java.util.List;

import cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.model.domain.Fruit;

public interface FruitService {
	Fruit createFruit(Fruit fruit);

	Fruit updateFruit(Fruit fruit);

	void deleteFruit(long fruitId);

	Fruit getOneFruit(long fruitId);

	List<Fruit> getAllFruits();

}
