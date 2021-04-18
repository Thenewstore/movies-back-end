package co.edu.iudigital.app.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.Movie;
import co.edu.iudigital.app.service.iface.MovieServices;

@RestController
@RequestMapping("/movie")
@CrossOrigin("*")
public class MovieController {
	
	@Autowired
	private MovieServices movieServices;
	
	@GetMapping
	public List<Movie> getAll(){
		return movieServices.getAll();
	}
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void create(@RequestBody Movie movie) {
		movieServices.create(movie);
	}
	
	@PutMapping("/edit/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void edit(@RequestBody Movie movie, @PathVariable int id) {
		movieServices.edit(movie, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		movieServices.delete(id);
	}
	
	@PutMapping("/rate/{id}")
	public void rate(@RequestBody Movie movie, @PathVariable int id) {
		movieServices.rate(movie, id);
	}
	
}
