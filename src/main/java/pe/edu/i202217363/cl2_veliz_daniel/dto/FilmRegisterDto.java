package pe.edu.i202217363.cl2_veliz_daniel.dto;

import java.util.Date;

public record FilmRegisterDto(Integer filmId,
                              String title,
                              String description,
                              Integer releaseYear,
                              Integer languageId,
                              String languageName,
                              Integer rentalDuration,
                              Double rentalRate,
                              Integer length,
                              Double replacementCost,
                              String rating,
                              String specialFeatures,
                              Date lastUpdate) {
}
