package com.hafizsyahputra.utshafiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter
    private lateinit var dataList: ArrayList<Data>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Inisialisasi ArrayList
        dataList = ArrayList()

        // Menambahkan data ke dalam ArrayList
        dataList.add(Data("Dante", R.drawable.dante, "Dante is one of the main protagonists of the Devil May Cry franchise, and the main playable character for the majority of the games in the series. He is the second son of the demon Sparda and the human Eva, the younger twin brother of Vergil, and the uncle of Nero."))
        dataList.add(Data("Lady", R.drawable.lady, "Lady is a human Devil Hunter who first appeared in Devil May Cry 3: Dante's Awakening as both a supporting character and a boss character. She is the daughter of Arkham and sought to hunt him down, encountering Dante in the process."))
        dataList.add(Data("Nero", R.drawable.nero, "Nero is the one of the main protagonists of the Devil May Cry franchise. He first appeared as a playable character in Devil May Cry 4, and later in Devil May Cry 5. He was raised in Fortuna and served as a Holy Knight in the Order of the Sword, a religious group that worships Sparda and fights to protect the world from demons."))
        dataList.add(Data("Vergil", R.drawable.vergil,"Vergil is the older twin brother of Dante and one of the main antagonists of the Devil May Cry franchise. Following the death of their mother as children, Vergil and Dante went their separate ways, with Vergil rejecting his humanity and embracing his demonic heritage, in contrast with his younger brother's embrace of humanity and initial rejection of the demonic. "))
        dataList.add(Data("V", R.drawable.v,"A human with demonic ties, V presents himself as Dante's new client to put him on the trail of Urizen and takes Nero as backup insurance. It's revealed later that V is, in fact, the human half of Vergil."))
        dataList.add(Data("Chaos", R.drawable.chaos,"Chaoses are reptilian lesser demons evolved from harsh environments of the Underworld like Riot. In their case, they develop razor-sharp scutes across the spine that can be deployed to cut and shred things like a circular saw via a rolling attack, along with a neurotoxin sac hidden within the chest cavity which gives them ability to spit poison at range, in addition to their claws and sharp teeth."))
        dataList.add(Data("Fury", R.drawable.fury,"The Fury's species have mutated over time to achieve greater speed to hunt down prey, many generations have passed in order to reach the level of the Fury.[1] It's also able to spawn a blade out of its arm without injuring itself, using it to damage its targets."))
        dataList.add(Data("Goliath", R.drawable.goliath, "Goliath is an extremely arrogant and confident demon with a huge ambition of becoming the ruler of the Underworld. As noticed by Nero in his taunts, he's not the sharpest tool in the shed. He is verbally aggressive to the point of calling Nero a \"Motherfucker\" during their battle. He is quick-tempered, getting angry whenever Nero taunts him."))
        dataList.add(Data("Hell Judecca", R.drawable.hell,"Hell Judeccas are tall, thin demons with a skeletal appearance surrounded by filament like purple energy protecting them to an extent (similar to Hell Antenora in berserk state). They are related to Hell Caïna and Hell Antenora and can summon them both in combat. They are the strongest of the 3 Hells."))
        dataList.add(Data("Urizen", R.drawable.urizen,"Urizen is a colossal humanoid creature with 37 eyes along all his body and head, large sharp teeth and claws. His most prominent features are the thick root-like layers of flesh that cover his body, encircling his face and reaching up to form a spiked \"crown\" on his head. In his standing form, thick severed roots with spiked tips drape down from his back like a cloak. He also has several blue glowing orbs on his body."))

        // Menambahkan adapter ke RecyclerView
        adapter = MyAdapter(dataList)
        recyclerView.adapter = adapter

        return view
    }
}
