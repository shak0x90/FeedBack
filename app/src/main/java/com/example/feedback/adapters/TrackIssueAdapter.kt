package com.example.feedback.adapters

import android.content.Context
import android.text.Editable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.databinding.ReportissuecaerdivewBinding
import com.example.feedback.models.TrackIssueData

class TrackIssueAdapter(var dataList:ArrayList<TrackIssueData>,var context: Context):
    RecyclerView.Adapter<TrackIssueAdapter.TrackIssueViewHolder>() {

    fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)



    class TrackIssueViewHolder(var binding: ReportissuecaerdivewBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackIssueViewHolder {
       var binding = ReportissuecaerdivewBinding.inflate(LayoutInflater.from(context),parent,false)
        return TrackIssueViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: TrackIssueViewHolder, position: Int) {
        holder.binding.issuetexVid.text = dataList[position].issueName
        holder.binding.trackIssueDateTv.text = dataList[position].issueDate
        holder.binding.editextID.text = dataList[position].issueEdittext.toEditable()
        holder.binding.reportissuestatusId.text = dataList[position].btntext

        if (dataList[position].issueSolved){
            holder.binding.reportissuestatusId.setBackgroundColor(0xFFEEFAF6.toInt())

        }


    }
}