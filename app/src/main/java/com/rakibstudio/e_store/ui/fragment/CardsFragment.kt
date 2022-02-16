package com.rakibstudio.e_store.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.rakibstudio.e_store.R
import com.rakibstudio.e_store.adapter.CardAdapter
import com.rakibstudio.e_store.data.model.UserModel
import com.rakibstudio.e_store.databinding.FragmentCardsBinding

class CardsFragment : Fragment(R.layout.fragment_cards) {

    //Binding
    private var _binding: FragmentCardsBinding? = null
    val binding get() = _binding

    //Sent args
    private val args: CardsFragmentArgs by navArgs()
    private lateinit var selectedUserCard: UserModel

    //Adapter
    private lateinit var cardAdapter: CardAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCardsBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        selectedUserCard = args.userCard

        cardAdapter = CardAdapter()
        cardAdapter.diff.submitList(selectedUserCard.userCards)

        binding!!.cardsRecycler.apply {
            adapter = cardAdapter
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        }
    }
}