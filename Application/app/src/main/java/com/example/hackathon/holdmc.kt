package com.example.hackathon
var uqtymc:IntArray= intArrayOf(0,0,0,0)

var imgarr = intArrayOf(R.drawable.cheesecake)

public data class holdmc(var qtymc:IntArray?)
{
    fun retmc() = qtymc
}
public fun retmc(qtymc: IntArray= intArrayOf(0,0,0,0))
{
    uqtymc = qtymc
}