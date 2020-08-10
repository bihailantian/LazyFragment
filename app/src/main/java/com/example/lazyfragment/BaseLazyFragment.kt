package com.example.lazyfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseLazyFragment : Fragment() {

    /**
     * 当前Fragment状态是否可见
     */
    private var isVisibleToUser: Boolean = false

    /**
     * 是否已创建View
     */
    private var isViewCreated: Boolean = false

    /**
     * 是否第一次加载数据
     */
    private var isFirstLoad: Boolean = false

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        this.isVisibleToUser = isVisibleToUser
        onLazyLoad()
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isViewCreated  = true
        lazyLoad()
    }


    private fun onLazyLoad(){
        if (isVisibleToUser && isViewCreated && isFirstLoad){
            isFirstLoad = false
            lazyLoad()
        }
    }


    protected abstract  fun lazyLoad()

}