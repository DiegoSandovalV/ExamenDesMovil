package com.example.examen.framework.views.fragments

import android.os.Bundle
import android.provider.DocumentsContract.Root
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen.R
import com.example.examen.databinding.FragmentHomeBinding
import com.example.examen.domain.model.movie.Movie
import com.example.examen.framework.ui.adapters.MovieAdapter


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView

    private val adapter: MovieAdapter = MovieAdapter()

    private lateinit var data: ArrayList<Movie>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val root: View = binding.root

        data = ArrayList()

        return root
    }

    private fun initComponents(root: View) {
        recyclerView = root.findViewById(R.id.RVMovies)
    }

    private fun setUpRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter.MovieAdapter(data, requireContext())
        recyclerView.adapter = adapter
    }


}