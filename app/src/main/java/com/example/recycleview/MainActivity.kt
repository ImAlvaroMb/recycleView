package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.list)

        val movieList = ArrayList<Movie>()
        movieList.add(Movie(R.drawable.untitled, "Movie 1"))
        movieList.add(Movie(R.drawable.chica, "Movie 2"))
        movieList.add(Movie(R.drawable.ole, "Movie 3"))
        movieList.add(Movie(R.drawable.puzzlelevel, "Movie 4"))

        recyclerView.adapter = MovieAdapter(movieList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}