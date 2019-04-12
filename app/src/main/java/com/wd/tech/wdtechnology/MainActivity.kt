package com.wd.tech.wdtechnology

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import tech.wd.com.wdtechnology.R

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tz ->initData()

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getSupportActionBar()?.hide();
    }
    fun initData(){
        val intent = Intent()
        //获取intent对象
        intent.setClass(this, MainActivity::class.java)
        // 获取class是使用::反射
        startActivity(intent)

       /* Class clazz=Class.fromName("com.clean.spaceplus.MainActivity")
        startActivity(this,clazz);*/
    }
}
