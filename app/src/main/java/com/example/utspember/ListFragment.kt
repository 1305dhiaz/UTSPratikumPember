package com.example.utspember

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utspember.databinding.FragmentListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        val list = ArrayList<Data>()

        list.addAll(
            arrayOf(
                Data("Valentino Rosi", "44 Tahun", R.drawable.rosi),
                Data("Pedrosa", "37 Tahun", R.drawable.pedrosa),
                Data("Marc Marquez", "30 Tahun", R.drawable.marquez),
                Data("Brad Binder", "32 Tahun", R.drawable.brad),
                Data("Fabio Quartararo", "23 Tahun", R.drawable.fabio),
                Data("Francesco Bagnaia", "30 Tahun", R.drawable.francesco),
                Data("Enea Bastianini", "30 Tahun", R.drawable.enea),
                Data("Franco Morbidelli", "33 Tahun", R.drawable.franco),
                Data("Joan Mir", "30 Tahun", R.drawable.joan),
                Data("Maverick Vinales", "32 Tahun", R.drawable.maverick),
                Data("Jack Miller", "32 Tahun", R.drawable.jeck),
                Data("Raul Fernandez", "22 Tahun", R.drawable.raul),
                Data("Miguel Oliveira", "28 Tahun", R.drawable.miguel),
                Data("Jorge Martin", "25 Tahun", R.drawable.jorge),
                Data("Johann Zarco", "32 Tahun", R.drawable.johann),
                Data("Luca Marini", "25 Tahun", R.drawable.luca),
                Data("Maverick Viñales", "28 Tahun", R.drawable.vinales),
                Data("Takaaki Nakagami", "31 Tahun", R.drawable.takaaki),
                Data("Augusto Fernandez", "25 Tahun", R.drawable.augusto),
                Data("Pol Espargaro", "31 Tahun", R.drawable.pol),
                Data("Marco Bezzecchi", "24 Tahun", R.drawable.marco)
            )
        )

        val myAdapter = ListAdapter(list)

        binding.recycleListView.layoutManager = LinearLayoutManager(requireContext())
        binding.recycleListView.setHasFixedSize(true)
        binding.recycleListView.adapter = myAdapter

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}