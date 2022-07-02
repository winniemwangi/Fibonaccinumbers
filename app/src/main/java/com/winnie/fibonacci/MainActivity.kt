package com.winnie.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.winnie.fibonacci.NumberRecyclerViewAdapter
import com.winnie.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList=Addition(100)
        println(numberList)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter=NumberRecyclerViewAdapter(numberList)
    }
    fun Addition(size:Int):List<Int>{
        var list=ArrayList<Int>()
        var num1=0
        var num2=1
        var number=0
        while (number <= size){
            print(num1)
            var add= num1+num2
            num1=num2
            num2=add
            number++
            list+=add

        }
        return list
    }
}