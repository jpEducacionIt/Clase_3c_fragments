package com.example.clase4fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.concurrent.fixedRateTimer

class LightFragment : Fragment() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myView = inflater.inflate(R.layout.fragment_light, container, false)
        button = myView.findViewById(R.id.buttonNavigate)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
           val darkFragment = DarkFragment()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, darkFragment)
                .commit()
        }
    }
}