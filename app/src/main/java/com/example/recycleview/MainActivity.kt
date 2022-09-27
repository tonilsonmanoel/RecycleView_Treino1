package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.Adapter.AdapterProduto
import com.example.recycleview.model.Produto


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recycleView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        recyclerView_produtos.setHasFixedSize(true)
        //configurar Adapter
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProdutos)
        recyclerView_produtos.adapter = adapterProduto
        val produto1 = Produto(
            R.drawable.celular_xiaomi_redmi_note_7_64gb_red,
            nome="Celular Note 7 ",
            descricao = "Câmera dupla e mais detalhes Suas 2 câmeras traseiras de 48 Mpx/5 Mpx permitirão que você tire fotos mais detalhadas e obtenha efeitos únicos, como a famosa profundidade rasa do modo retrato de campo. Além disso, o dispositivo possui uma câmera frontal de 13 Mpx para que você possa tirar selfies divertidas ou fazer videochamadas.",
            preco = "R$1500,00"
        )
        listaProdutos.add(produto1)
        val produto2 = Produto(
            R.drawable.a50,
            nome = "Celular Samsung Galaxy A50 Dual 64gb",
            descricao = "Tela Infinita de 6.4 Câmera Tripla Traseira de 25MP + 5MP + 8MP Câmera frontal de 25MP 64GB de Memória Interna e 4GB RAM",
            preco = "R$1100,00"
        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.xbox,
            nome = "Microsoft Xbox One S 1TB",
            descricao = "Com seu console Xbox One você terá entretenimento garantido todos os dias. Sua tecnologia foi criada para colocar novos desafios para jogadores novatos e especialistas.",
            preco = "R$2000,00"
        )
        listaProdutos.add(produto3)
        val produto4 = Produto(
            R.drawable.watch,
            nome = "Watch Dogs 2 Standard Edition",
            descricao = "Com este jogo Watch Dogs, você desfrutará de horas de diversão e novos desafios que lhe permitirão melhorar como jogador.",
            preco = "R$50,00"
        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.f1,
            nome = "Jogo F1 2022 - Formula 1 2022",
            descricao = "F1 22 é o game oficial do maior campeonato automobilístico do mundo, a Fórmula 1. É um jogo de simulação esportiva que busca transmitir com precisão a real experiência de pilotar um dos carros mais rápidos do mundo em um circuito profissional. Treine para se tornar a maior lenda das pistas, se transformando no piloto mais habilidoso e imbatível do mundo, deixando todos os adversários para trás.",
            preco = "R$239,99"
        )
        listaProdutos.add(produto5)




    }
}