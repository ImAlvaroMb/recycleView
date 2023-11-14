package com.example.recycleview

class Movie(val movieImageResourceId: Int, val movieTitle: String) {

    private var lastMovieId = 0;

    fun createMovieList(numMovies: Int): ArrayList<Movie>{

        val movieList = ArrayList<Movie>()

        for (i in 1 .. numMovies){
            movieList.add(Movie(R.drawable.untitled, "Movie " + ++lastMovieId))
        }
        return movieList
    }

}