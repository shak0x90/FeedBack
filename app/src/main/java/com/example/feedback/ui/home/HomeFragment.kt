package com.example.feedback.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.feedback.ChangleLanguage
import com.example.feedback.LoginActivity
import com.example.feedback.ReportIssueActivity
import com.example.feedback.databinding.FragmentHomeBinding
import com.example.feedback.orderHistory

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.orderhistoryTvid.setOnClickListener {
            val orderHistory = Intent(this.context, orderHistory::class.java)
            startActivity(orderHistory)
        }

        binding.changgeLanguageTvid.setOnClickListener {
            val changelan = Intent(this.context, ChangleLanguage::class.java)
            startActivity(changelan)
        }

        binding.changePaswordTvD.setOnClickListener {
            val changpass = Intent(this.context, ChangePasswordActivity::class.java)
            startActivity(changpass)
        }

        binding.ReporttvID.setOnClickListener {
            val reportIsuue = Intent(this.context, ReportIssueActivity::class.java)
            startActivity(reportIsuue)
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}