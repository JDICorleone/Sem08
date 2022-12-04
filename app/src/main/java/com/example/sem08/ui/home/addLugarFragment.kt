package com.example.sem08.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.sem08.databinding.FragmentAddLugarBinding
import com.example.sem08.viewmodel.HomeViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [addLugarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class addLugarFragment : Fragment() {
    private var _binding: FragmentAddLugarBinding? = null
    private val binding get() = _binding!!
    private lateinit var lugarViewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        HomeViewModel = ViewModelProvider(this).get(HomeViewModel::class,java)
        _binding = FragmentAddLugarBinding.inflate(inflater,container, false)

        binding.btAgregarLugar.setOnClickListener{ agregarLugar()}
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun agregarLugar(){
        val nombre = binding.etNombre.text.toString()
        val correo = binding.etEmail.text.toString()
        val telefono = binding.etTelefono.text.toString()
        val web = binding.etWeb.text.toString()

        if(nombre.isNotEmpty()){
            val lugar = Lugar(0,nomrbre,correo,telefono,web)
            //Proceso de agregar a BD
            homeViewModel.saveLugar(lugar)
            Toast.makeText(requireContext(), "Exito",Toast.LENGHT_LONG).show()

        }
        else{
            Toast.makeText(returnContext(),getString.msg_error),Toast.LENGHT_LONG).show()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AddLugar.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            addLugarFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}