package com.example.kotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Extensions (확장)
        //확장 함수는 어떤 클래에 밖에서, 마치 그 클래스의 멤버인 것처럼 선언된 메서드를 말한다.
        //클래스 내부에 있지 않지만 그 클래스 내부 멤버에 접근할 수 있고, 클래스 멤버 메서드와 동일한 방식으로 호출할 수 있다.
        recyclerview.adapter = MainAdapter()
        recyclerview.layoutManager = LinearLayoutManager(this)

    }
}
