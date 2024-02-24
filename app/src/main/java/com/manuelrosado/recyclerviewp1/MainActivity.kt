package com.manuelrosado.recyclerviewp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listaClientes: MutableList<dtClientes> = mutableListOf()
    private  lateinit var reycycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaClientes.add(dtClientes("01", "Tortillas, sirven para hacer un taco", "$25 Precio al Menudeo","$15 Precio al Mayoreo"))
        listaClientes.add(dtClientes("02", "Plumas", "$60 Precio al Menudeo","$55 Precio al Mayoreo"))
        listaClientes.add(dtClientes("03", "Lapices", "$100 Precio al Menudeo","$70 Precio al Mayoreo"))
        listaClientes.add(dtClientes("04", "Colores", "$80 Precio al Menudeo","$75 Precio al Mayoreo"))
        listaClientes.add(dtClientes("05", "Borradores", "$60 Precio al Menudeo","$50 Precio al Mayoreo"))
        listaClientes.add(dtClientes("06", "Cuardernos", "$380 Precio al Menudeo","$270 Precio al Mayoreo"))
        listaClientes.add(dtClientes("07", "Carpetas", "$200 Precio al Menudeo","$150 Precio al Mayoreo"))
        listaClientes.add(dtClientes("08", "Paquete de Hojas blancas", "$540 Precio al Menudeo","$350 Precio al Mayoreo"))
        listaClientes.add(dtClientes("09", "Paquete de Cubre bocas", "$15 Precio al Menudeo","$50 Precio al Mayoreo"))
        listaClientes.add(dtClientes("10", "Peluches", "$650 Precio al Menudeo","$480 Precio al Mayoreo"))
        listaClientes.add(dtClientes("11", "Tijeras", "$80 Precio al Menudeo","$75 Precio al Mayoreo"))
        listaClientes.add(dtClientes("12", "Kilo de jamón de pavo cocido", "$75 Precio al Menudeo","$68 Precio al Mayoreo"))
        listaClientes.add(dtClientes("13", "Kilo de jamón de pavo americano", "$85 Precio al Menudeo","$78 Precio al Mayoreo"))
        listaClientes.add(dtClientes("14", "Kilo de chorizo", "$75 Precio al Menudeo","$68 Precio al Mayoreo"))
        listaClientes.add(dtClientes("15", "Kilo de longaniza", "$85 Precio al Menudeo","$78 Precio al Mayoreo"))
        listaClientes.add(dtClientes("16", "Kilo de arrachera", "$230 Precio al Menudeo","$210 Precio al Mayoreo"))
        listaClientes.add(dtClientes("17", "Kilo de chistorra", "$140 Precio al Menudeo","$120 Precio al Mayoreo"))
        listaClientes.add(dtClientes("18", "Kilo de chorizo argentino", "$60 Precio al Menudeo","$55 Precio al Mayoreo"))
        listaClientes.add(dtClientes("19", "Kilo de bistec de puerco", "$70 Precio al Menudeo","$65 Precio al Mayoreo"))
        listaClientes.add(dtClientes("20", "Kilo de salchicha de pavo", "$150 Precio al Menudeo","$135 Precio al Mayoreo"))



        var tabla = findViewById<RecyclerView>(R.id.tablasclietes)
        reycycler=tabla
        reycycler.layoutManager= LinearLayoutManager(this)
        reycycler.adapter=ClientesAdapter(this,listaClientes)
    }
}