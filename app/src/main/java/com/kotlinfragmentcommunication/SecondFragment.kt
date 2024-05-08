package com.kotlinfragmentcommunication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kotlinfragmentcommunication.R

class SecondFragment : Fragment() {
    val TAG = SecondFragment::class.simpleName

    private lateinit var tvDetails: TextView
    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private lateinit var tv3: TextView
    private lateinit var tv4: TextView
    private lateinit var tv5: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Initialize TextViews
        tvDetails = view.findViewById(R.id.tvDetails)
        tv1 = view.findViewById(R.id.tv1)
        tv2 = view.findViewById(R.id.tv2)
        tv3 = view.findViewById(R.id.tv3)
        tv4 = view.findViewById(R.id.tv4)
        tv5 = view.findViewById(R.id.tv5)

        // Access arguments
        val args = arguments
        tv1.text = args?.getString("first_name")
        tv2.text = args?.getString("middle_name")
        tv3.text = args?.getString("last_name")
        tv4.text = args?.getString("age")
        tv5.text = args?.getString("place")

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG,"onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG," onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG," onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG," onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG," onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG," onDestroy")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG," onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG," onDestroy")
    }

}
