package org.d3if0048.pra_assesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PraAssesment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//
//        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
//            inflater, R.layout.fragment_title, container, false
//        )
//        binding.playButton.setOnClickListener { v: View ->
//            v.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_pra_assesment, container, false)
        }


    }


