package com.example.feedback.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.feedback.adapters.NotificationAdapter
import com.example.feedback.databinding.FragmentNotificationsBinding
import com.example.feedback.models.notificationData

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var notificationData: ArrayList<notificationData>
    private lateinit var notificationAdapter: NotificationAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        notificationData = ArrayList<notificationData>()
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","Just Now"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","10 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))

        notificationAdapter = NotificationAdapter(notificationData,this.requireActivity())

        binding.newsetReclerVid.layoutManager = LinearLayoutManager(this.requireActivity())
        binding.newsetReclerVid.adapter=notificationAdapter

        binding.previousRcVID.layoutManager = LinearLayoutManager(this.requireActivity())
        binding.previousRcVID.adapter=notificationAdapter

//        val textView: TextView = binding.textNotifications
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }


        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}