package com.manuelrosado.recyclerviewp1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClientesAdapter(var context: Context, var ListaClientes: MutableList<dtClientes>) : RecyclerView.Adapter<ClientesAdapter.vHolder>()
{
    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtid: TextView
        init {
            txtid=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtdescripción: TextView
        init {
            txtdescripción=itemView.findViewById(R.id.txtdescripción)
        }
        lateinit var txtPrecioMenudeo: TextView
        init {
            txtPrecioMenudeo=itemView.findViewById(R.id.txtPrecioMenudeo)
        }
        lateinit var txtPrecioMayoreo: TextView
        init {
            txtPrecioMayoreo=itemView.findViewById(R.id.txtPrecioMayoreo)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientesAdapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.vista_clientes,parent,false)

        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaClientes.size
    }

    override fun onBindViewHolder(holder: ClientesAdapter.vHolder, position: Int) {
        var clientes = ListaClientes[position]
        holder.txtid.text=clientes.Id
        holder.txtdescripción.text=clientes.Descripcion
        holder.txtPrecioMenudeo.text=clientes.PrecioMenudeo
        holder.txtPrecioMayoreo.text=clientes.PrecioMayoreo

    }


}
