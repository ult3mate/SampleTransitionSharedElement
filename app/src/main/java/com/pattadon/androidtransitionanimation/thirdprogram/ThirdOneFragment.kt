package com.pattadon.androidtransitionanimation.thirdprogram

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pattadon.androidtransitionanimation.R
import kotlinx.android.synthetic.main.third_program_one_fragment.*

/**
 * Created by pattadon on 8/17/17.
 */

class ThirdOneFragment : Fragment(){

    companion object {
        fun newInstance(): ThirdOneFragment {
            val newsFragment = ThirdOneFragment()
            val args = Bundle()
            newsFragment.arguments = args
            return newsFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.third_program_one_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragment_one_iv.setOnClickListener {
            activity.supportFragmentManager
                    .beginTransaction()
                    .addSharedElement(fragment_one_iv, ViewCompat.getTransitionName(fragment_one_iv))
//                    .addSharedElement(fragment_one_2_iv, ViewCompat.getTransitionName(fragment_one_2_iv))
                    .addToBackStack(null)
                    .replace(R.id.content_frame, ThirdTwoFragment.newInstance())
                    .commit()
        }

        fragment_one_2_iv.setOnClickListener {
            activity.supportFragmentManager
                    .beginTransaction()
                    .addSharedElement(fragment_one_iv, ViewCompat.getTransitionName(fragment_one_iv))
                    .addSharedElement(fragment_one_2_iv, ViewCompat.getTransitionName(fragment_one_2_iv))
                    .addToBackStack(null)
                    .replace(R.id.content_frame, ThirdTwoFragment.newInstance())
                    .commit()
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
}
