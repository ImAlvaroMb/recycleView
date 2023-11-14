package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter (private val movieList : List<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val movieImage = itemView.findViewById<ImageView>(R.id.movieImage)
        val movieTitleTextView: TextView = itemView.findViewById<TextView>(R.id.movie_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val movieView = inflater.inflate(R.layout.item_contactt, parent, false)

        return ViewHolder(movieView)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val movie: Movie = movieList.get(position)
        val textView = holder.movieTitleTextView
        textView.text = movie.movieTitle
        val movieImage = holder.movieImage.setImageResource(movie.movieImageResourceId)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}