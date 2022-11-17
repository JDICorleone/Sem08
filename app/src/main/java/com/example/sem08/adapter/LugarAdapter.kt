package com.example.sem08.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem08.databinding.FragmentLugarFilaBinding
import com.example.sem08.model.Lugar

class LugarAdapter: RecyclerView.Adapter<LugarAdapter.LugarViewHolder>() {

    private var listaLugares = emptyList<Lugar>()

    inner class LugarViewHolder(private val itemBuilding: FragmentLugarFilaBinding) : RecyclerView.ViewHolder(itemBinding.root){
        fun dibujar(lugar:Lugar){
            itemBinding.tvNombre.text = lugar.nombre
            itemBinding.tvTelefono.text = lugar.telefono
            itemBinding.tvCorreo.text = lugar.correo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugarViewHolder {
        val itemBinding = FragmentLugarFilaBinding
            .inflate(LayoutInflater.from(parent.context)
            ,parent,false)
        return LugarViewHolder(itemBinding)

    }

    fun setLugares(lugares: List<Lugar>){
        listaLugares = lugares
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: LugarViewHolder, position: Int) {
        val lugar = listaLugares[position]
        holder.dibujar(lugar)
    }

    override fun getItemCount(): Int {
        return listaLugares.size
    }
}