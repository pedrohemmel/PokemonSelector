package com.example.pokemonselector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import java.text.FieldPosition

class PokemonSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_selector)

        val spinnerPokemon: Spinner = findViewById(R.id.spinnerPokemon)
        val btnChoosePokemon: Button = findViewById(R.id.btnChoosePokemon)
        var imageViewPokemon: ImageView = findViewById(R.id.imageViewPokemon)

        val pokemons = arrayOf("Select", "Alakazam", "Aipom", "Aggron", "Aerodactyl")

        val arraySpinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pokemons)
        arraySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPokemon.adapter = arraySpinnerAdapter

        spinnerPokemon.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapter: AdapterView<*>?, spinner: View?, position: Int, id: Long) {
                imageViewPokemon = onItemSelectedSpinnerAction(position, imageViewPokemon)
            }
            override fun onNothingSelected(adapter: AdapterView<*>?) {
                imageViewPokemon.setImageDrawable(null)
            }
        }

        btnChoosePokemon.setOnClickListener {
           btnChoosedPokemonAction(spinnerPokemon, pokemons)
        }
    }

    fun btnChoosedPokemonAction(spinnerPokemon: Spinner, pokemons: Array<String>) {
        when(spinnerPokemon.selectedItemPosition) {
            1 -> showMsg("Pokemon choosed", pokemons[spinnerPokemon.selectedItemPosition], this)
            2 -> showMsg("Pokemon choosed", pokemons[spinnerPokemon.selectedItemPosition], this)
            3 -> showMsg("Pokemon choosed", pokemons[spinnerPokemon.selectedItemPosition], this)
            4 -> showMsg("Pokemon choosed", pokemons[spinnerPokemon.selectedItemPosition], this)
            else -> showMsg("Erro", "No pokemon selected", this)
        }
    }

    fun onItemSelectedSpinnerAction(position: Int, imageViewPokemon: ImageView): ImageView {
        when(position) {
            1 -> imageViewPokemon.setImageResource(R.drawable.alakazam_pokemon)
            2 -> imageViewPokemon.setImageResource(R.drawable.aipom_pokemon)
            3 -> imageViewPokemon.setImageResource(R.drawable.aggron_pokemon)
            4 -> imageViewPokemon.setImageResource(R.drawable.aerodactyl_pokemon)
            else -> imageViewPokemon.setImageDrawable(null)
        }

        return imageViewPokemon
    }
}