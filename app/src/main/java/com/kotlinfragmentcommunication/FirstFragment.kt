package com.kotlinfragmentcommunication

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class FirstFragment : Fragment() {
    private lateinit var btnGotoSecondFragment: Button
    private lateinit var showDataInterface: ShowDataInterface
    private lateinit var btnSendData: Button

    val TAG = FirstFragment::class.simpleName

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        try {
            showDataInterface = activity as ShowDataInterface
            // listener.showFormula(show?);
        } catch (castException: ClassCastException) {
            /** The activity does not implement the listener.  */
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        Log.i(TAG,"onViewCreated")

        // Initialize button
        btnGotoSecondFragment = view.findViewById(R.id.btnGotoSecondFragment)
        btnSendData = view.findViewById(R.id.btnSendData)
        btnSendData.setOnClickListener {
            showDataInterface.showData("Activit Textview: This message from First Fragment")
        }

        btnGotoSecondFragment.setOnClickListener {
            val bundle = Bundle().apply {
                putString("first_name","Ashok")
                putString("middle_name","No Middle Name")
                putString("last_name","Sannala")
                putString("age","25Y")
                putString("place","hyderabad")
            }


            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle

            // Replace the current fragment with the second fragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, secondFragment)
                .addToBackStack(null) // Optional: Add this transaction to the back stack
                .commit()
        }


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
