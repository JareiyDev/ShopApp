package com.thc.Spa.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thc.Spa.R
import com.thc.Spa.databinding.FragmentDashboardBinding
import com.thc.Spa.ui.ItemMenuAdapter
import com.thc.Spa.ui.ItemProductAdapter
import com.thc.Spa.ui.ItemsProductModel
import com.thc.Spa.ui.ItemsViewModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList1(view)
        initList2(view)

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initList1(view: View){
        val recyclerview = view.findViewById<RecyclerView>(R.id.rcv_list1)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(ItemsViewModel(R.drawable.hair_treatment, "Facial", "Facial"))
        data.add(ItemsViewModel(R.drawable.comb, "Hair", "Hair"))
        data.add(ItemsViewModel(R.drawable.nails, "Nail", "Nail"))
        data.add(ItemsViewModel(R.drawable.hair_treatment, "Facial", "Facial"))
        data.add(ItemsViewModel(R.drawable.comb, "Hair", "Hair"))
        data.add(ItemsViewModel(R.drawable.nails, "Nail", "Nail"))

        // This will pass the ArrayList to our Adapter
        val adapter = ItemMenuAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }

    fun initList2(view: View){
        val recyclerview = view.findViewById<RecyclerView>(R.id.rcv_list2)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL,false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsProductModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(ItemsProductModel(R.drawable.thumbnail1, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail2, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail1, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail2, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail1, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail2, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))
        data.add(ItemsProductModel(R.drawable.thumbnail1, "Alaina Tisha", "Beauty Artist","$ 39.00/hr", "4.8","04"))

        // This will pass the ArrayList to our Adapter
        val adapter = ItemProductAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}