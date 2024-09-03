package com.breezelinktelecom.features.mylearning

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.recyclerview.widget.RecyclerView
import com.breezelinktelecom.R
import com.breezelinktelecom.base.presentation.BaseFragment

class BookmarkFrag: BaseFragment()  {

    private lateinit var mContext: Context
    private lateinit var rvList:RecyclerView
    private lateinit var adapterBookmarked:AdapterBookmarkedprivate

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.frag_bookmark, container, false)
        initView(view)
        requireActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE or WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        return view
    }

    private fun initView(view: View) {

        rvList = view.findViewById(R.id.rv_frag_bookmark)

        var mList : ArrayList<VidBookmark> = ArrayList()
        mList.add(VidBookmark("1","Jai Hanuman","1","Who is Hanuman?","Who is Hanuman?","http://3.7.30.86:8073/Commonfolder/LMS/Thumbnails/1000234474.jpg" ,
                "http://3.7.30.86:8073/Commonfolder/LMS/ContentUpload/1000235624.mp4"))
        mList.add(VidBookmark("1","Jai Hanuman","1","Who is Hanuman?","Who is Hanuman?","http://3.7.30.86:8073/Commonfolder/LMS/Thumbnails/1000234474.jpg" ,
                "http://3.7.30.86:8073/Commonfolder/LMS/ContentUpload/1000235624.mp4"))
        adapterBookmarked = AdapterBookmarkedprivate(mContext,mList,object :AdapterBookmarkedprivate.OnClick{
            override fun onClick(obj: VidBookmark) {

            }
        })
        rvList.adapter = adapterBookmarked


    }

}