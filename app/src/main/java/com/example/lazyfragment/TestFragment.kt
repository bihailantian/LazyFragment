package com.example.lazyfragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.text.FieldPosition


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [TestFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [TestFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class TestFragment : BaseLazyFragment() {

    private var position :Int = 0

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        val bundle = arguments
        position = bundle!!.getInt(KEY_POSITION)
    }






    override fun lazyLoad() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    companion object{
        private const val KEY_POSITION = "position"


            fun  getInstance(card:Card,position:Int){

            }
    }

}
