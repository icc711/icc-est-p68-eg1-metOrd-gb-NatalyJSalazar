package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden descendente.
     * 
     * Metodo: sortByTitle
     * 
     * @param movies Arreglo de películas a ordenar
     */

    public void sortByTitle(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            int minimo = i;
            for (int j = i + 1; i < movies.length; j++) {
                if (movies[j].getName().compareToIgnoreCase(movies[minimo]).getName()) < 0 {
                    minimo = j;
                }
            }
            if (minimo != i) {
                Movie aux = movies[i];
                movies[i] = movies[minimo];
                movies[minimo] = aux;
            }
        }
    }
}
