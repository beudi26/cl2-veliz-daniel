package pe.edu.i202217363.cl2_veliz_daniel.service;

import pe.edu.i202217363.cl2_veliz_daniel.dto.FilmDetailDto;
import pe.edu.i202217363.cl2_veliz_daniel.dto.FilmDto;
import pe.edu.i202217363.cl2_veliz_daniel.dto.FilmRegisterDto;
import pe.edu.i202217363.cl2_veliz_daniel.dto.FilmUpdateDto;
import pe.edu.i202217363.cl2_veliz_daniel.entity.Language;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
