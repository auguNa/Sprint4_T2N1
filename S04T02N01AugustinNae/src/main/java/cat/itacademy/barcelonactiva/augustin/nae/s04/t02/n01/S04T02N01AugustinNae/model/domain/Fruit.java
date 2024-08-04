package cat.itacademy.barcelonactiva.augustin.nae.s04.t02.n01.S04T02N01AugustinNae.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name= "fruits")
public class Fruit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	@NotBlank(message = "Name is mandatory")
    private String name;

	@Min(value = 1, message = "Quantity must be at least 1 kg")
    private int kgQuantity;

    public Fruit(){

    }
    public Fruit(String name, int kgQuantity){
        this.name=name;
        this.kgQuantity=kgQuantity;
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKgQuantity() {
		return kgQuantity;
	}
	public void setKgQuantity(int kgQuantity) {
		this.kgQuantity = kgQuantity;
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", kgQuantity=" + kgQuantity + "]";
	}
    
}
