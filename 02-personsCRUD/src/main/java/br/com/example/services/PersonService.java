package br.com.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.example.model.Person;

//@Service serve para que o spring cuide da injeção de dependência
//dessa classe onde for necessário, então quando for preciso usar
//essa classe em outra classe não é necessário instanciar diretamente
//também torna-se desnecessário o uso do static, apenas utiliza-se
//o @AutoWired e o spring cuida disso.
@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		//delete(id);
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Felipe");
		person.setLastName("Almeida");
		person.setAddress("Bem ali, bairro - esquina dobrada, Parnamirim/RN ,Brasil");
		person.setGender("Male");
		return person;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Primeiro Nome" + i);
		person.setLastName("Sobrenome" + i);
		person.setAddress("Endereço no Brasil" + i);
		person.setGender("Male" + i);
		return person;
	}
}
