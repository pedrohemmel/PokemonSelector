package com.example.pokemonselector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class PokemonSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_selector)

        val spinnerPokemon: Spinner = findViewById(R.id.spinnerPokemon)
        val imageViewPokemon: ImageView = findViewById(R.id.imageViewPokemon)
        val btnChoosePokemon: Button = findViewById(R.id.btnChoosePokemon)

        val pokemons = arrayOf("Select", "Alakazam", "Aipom", "Aggron", "Aerodactyl")

        val arraySpinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)
        arraySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPokemon.adapter = arraySpinnerAdapter
    }
}