package pe.edu.i202217363.cl2_veliz_daniel.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202217363.cl2_veliz_daniel.entity.Film;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}