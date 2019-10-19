package com.example.kotlinexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

//만약 생성자를 만들 때 매개변수가 필요할 경우, 주 생성자를 만들어 주자
class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var items: MutableList<MainData> = mutableListOf(MainData("Title1","Content1"),
        MainData("Title2","Content2"), MainData("Title3","Content3"))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MainViewHolder(parent)

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        //let 함수 item
        //함수를 호출하는 객체를 이어지는 블록의 인자로 넘기고, 해당 블록의 결과 값을 반환하는 코틀린의 함수이다.
        //이 let 함수가 안전한 호출 연산자와 함께 사용되면 Nullable 타입을 사용할 수 없는 곳에 Nullable 타입의 변수를 사용할 수 있는 방법이 된다.
        items[position].let {
            item -> with(holder){
                tvTitle.text = item.title
                tvContent.text = item.content
            }
        }
    }

    //!! 연산자는 절대 null 값이 올수 없는 상황에서
    // nullable 타입의 변수를 사용해야 할 때 Null Check 가 없으면 컴퍼일할 수 없는 번거로운 일을 막기 위해 만들어 졌다.
    override fun getItemCount(): Int  = items!!.size

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_main,parent,false)){
        val tvTitle = itemView.tv_main_title
        val tvContent = itemView.tv_main_content
    }
}