package com.koose.highwayapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.koose.highwayapp.R


class RegisterFragment : Fragment() {

    private lateinit var userEmail: String
    private lateinit var userPassword:String
    private lateinit var createAccUser: Array<EditText>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
        createAccUser = arrayOf()
    }

}