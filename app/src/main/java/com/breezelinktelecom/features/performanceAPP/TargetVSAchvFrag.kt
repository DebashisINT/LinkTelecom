package com.breezelinktelecom.features.performanceAPP

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.breezelinktelecom.R
import com.breezelinktelecom.base.presentation.BaseFragment
import com.breezelinktelecom.features.performanceAPP.model.ChartDataModelNew
import com.ekn.gruzer.gaugelibrary.HalfGauge
import com.ekn.gruzer.gaugelibrary.Range

class TargetVSAchvFrag: BaseFragment(), View.OnClickListener  {

    private lateinit var mContext: Context
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.frag_target_vs_achv, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        var halfGauge = view.findViewById<HalfGauge>(R.id.half_gauge)
        val range = Range()
        range.color = Color.parseColor("#01A049") // green
        range.from =0.0
        range.to = 300.0

        halfGauge.addRange(range)

        //set min max and current value
        //set min max and current value
        halfGauge.minValue = 0.0
        halfGauge.maxValue = (1000).toDouble()
        halfGauge.value = (300).toDouble()

        halfGauge.setNeedleColor(Color.BLACK)
        halfGauge.valueColor = Color.DKGRAY
        halfGauge.minValueTextColor = Color.BLACK
        halfGauge.maxValueTextColor = Color.BLACK

        halfGauge.isEnableNeedleShadow = true
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}