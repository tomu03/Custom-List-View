package com.webcode.customlistview

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    val profileName = arrayOf(
        "Tamim Iqbal",
        "Sakib Al Hasan",
        "Musfiqur Rahim",
        "mahmudulllah Riyad",
        "Masrafi din Mutraza"
    )

    val profileDec = arrayOf(
        "Left hand batter",
        "No 1 All rounder",
        "Right hand batter and wicketkeeper",
        "All rounder",
        "Captain fantastic"
    )

    val images = arrayOf<Int>(
        R.drawable.tamim,
        R.drawable.sakib,
        R.drawable.musfiq,
        R.drawable.mahmudllah,
        R.drawable.mash
    )

    val longDce = arrayOf(
        "Tamim Iqbal (Bengali: মুশফিকুর রহিম; born 9 May 1987) is a Bangladeshi cricketer and the former captain of the Bangladesh national cricket team. He is a right-handed middle-order batsman and wicket-keeper in the national team. Mushfiqur is tarted his international career in 2005 against England at the age of 18 years 17 days. He was made to play as a specialist batsman in the first Test match of his career. He thus became the second-youngest, after Sachin Tendulkar, to play Test cricket at Lord's Cricket Stadium.[4] He continued to make consistent contributions down the order with the bat and was more than competent as a keeper for Bangladesh's spin dominated attack. His moment of fame came in 2010 in a Test against India. Where he scored a quickfire century, the quickest by any Bangladeshi to date. He is one of the best run scorers as a wicketkeeper who has 11,000 runs and 400+ dismissals.According to Jamie Siddons, the former coach of Bangladesh, Mushfiqur Rahim's batting is so versatile that he can bat anywhere in the top order, from one to six. He is also rated as one of the consistent performers and one of the few keepers to score 1000+ runs in every format.[6] He is the highest individual scorer for Bangladesh in Test cricket.[7] He is the first and only wicketkeeper-batsman in the history of Test cricket to score two double-hundreds.[8][9][10][11][12] He is also the first and only Bangladeshi batsman to score three double-hundreds in Tests.[13] Mushfiqur is the only Bangladeshi player to win 150 international matches.[14] In December 2023, he became only the second cricketer in test cricket history after Len Hutton to be given out for obstructing the field, when he physically handled the ball with his gloves during a test match against New Zealand.",
    "Sakib Al Hasan (Bengali: মুশফিকুর রহিম; born 9 May 1987) is a Bangladeshi cricketer and the former captain of the Bangladesh national cricket team. He is a right-handed middle-order batsman and wicket-keeper in the national team. Mushfiqur is tarted his international career in 2005 against England at the age of 18 years 17 days. He was made to play as a specialist batsman in the first Test match of his career. He thus became the second-youngest, after Sachin Tendulkar, to play Test cricket at Lord's Cricket Stadium.[4] He continued to make consistent contributions down the order with the bat and was more than competent as a keeper for Bangladesh's spin dominated attack. His moment of fame came in 2010 in a Test against India. Where he scored a quickfire century, the quickest by any Bangladeshi to date. He is one of the best run scorers as a wicketkeeper who has 11,000 runs and 400+ dismissals.According to Jamie Siddons, the former coach of Bangladesh, Mushfiqur Rahim's batting is so versatile that he can bat anywhere in the top order, from one to six. He is also rated as one of the consistent performers and one of the few keepers to score 1000+ runs in every format.[6] He is the highest individual scorer for Bangladesh in Test cricket.[7] He is the first and only wicketkeeper-batsman in the history of Test cricket to score two double-hundreds.[8][9][10][11][12] He is also the first and only Bangladeshi batsman to score three double-hundreds in Tests.[13] Mushfiqur is the only Bangladeshi player to win 150 international matches.[14] In December 2023, he became only the second cricketer in test cricket history after Len Hutton to be given out for obstructing the field, when he physically handled the ball with his gloves during a test match against New Zealand.",
    "Mushfiqur Rahim (Bengali: মুশফিকুর রহিম; born 9 May 1987) is a Bangladeshi cricketer and the former captain of the Bangladesh national cricket team. He is a right-handed middle-order batsman and wicket-keeper in the national team. Mushfiqur is tarted his international career in 2005 against England at the age of 18 years 17 days. He was made to play as a specialist batsman in the first Test match of his career. He thus became the second-youngest, after Sachin Tendulkar, to play Test cricket at Lord's Cricket Stadium.[4] He continued to make consistent contributions down the order with the bat and was more than competent as a keeper for Bangladesh's spin dominated attack. His moment of fame came in 2010 in a Test against India. Where he scored a quickfire century, the quickest by any Bangladeshi to date. He is one of the best run scorers as a wicketkeeper who has 11,000 runs and 400+ dismissals.According to Jamie Siddons, the former coach of Bangladesh, Mushfiqur Rahim's batting is so versatile that he can bat anywhere in the top order, from one to six. He is also rated as one of the consistent performers and one of the few keepers to score 1000+ runs in every format.[6] He is the highest individual scorer for Bangladesh in Test cricket.[7] He is the first and only wicketkeeper-batsman in the history of Test cricket to score two double-hundreds.[8][9][10][11][12] He is also the first and only Bangladeshi batsman to score three double-hundreds in Tests.[13] Mushfiqur is the only Bangladeshi player to win 150 international matches.[14] In December 2023, he became only the second cricketer in test cricket history after Len Hutton to be given out for obstructing the field, when he physically handled the ball with his gloves during a test match against New Zealand.",
    "Mahmudullah Riyad(Bengali: মুশফিকুর রহিম; born 9 May 1987) is a Bangladeshi cricketer and the former captain of the Bangladesh national cricket team. He is a right-handed middle-order batsman and wicket-keeper in the national team. Mushfiqur is tarted his international career in 2005 against England at the age of 18 years 17 days. He was made to play as a specialist batsman in the first Test match of his career. He thus became the second-youngest, after Sachin Tendulkar, to play Test cricket at Lord's Cricket Stadium.[4] He continued to make consistent contributions down the order with the bat and was more than competent as a keeper for Bangladesh's spin dominated attack. His moment of fame came in 2010 in a Test against India. Where he scored a quickfire century, the quickest by any Bangladeshi to date. He is one of the best run scorers as a wicketkeeper who has 11,000 runs and 400+ dismissals.According to Jamie Siddons, the former coach of Bangladesh, Mushfiqur Rahim's batting is so versatile that he can bat anywhere in the top order, from one to six. He is also rated as one of the consistent performers and one of the few keepers to score 1000+ runs in every format.[6] He is the highest individual scorer for Bangladesh in Test cricket.[7] He is the first and only wicketkeeper-batsman in the history of Test cricket to score two double-hundreds.[8][9][10][11][12] He is also the first and only Bangladeshi batsman to score three double-hundreds in Tests.[13] Mushfiqur is the only Bangladeshi player to win 150 international matches.[14] In December 2023, he became only the second cricketer in test cricket history after Len Hutton to be given out for obstructing the field, when he physically handled the ball with his gloves during a test match against New Zealand.",
        "Masrafi bin mutreza (Bengali: মুশফিকুর রহিম; born 9 May 1987) is a Bangladeshi cricketer and the former captain of the Bangladesh national cricket team. He is a right-handed middle-order batsman and wicket-keeper in the national team. Mushfiqur is tarted his international career in 2005 against England at the age of 18 years 17 days. He was made to play as a specialist batsman in the first Test match of his career. He thus became the second-youngest, after Sachin Tendulkar, to play Test cricket at Lord's Cricket Stadium.[4] He continued to make consistent contributions down the order with the bat and was more than competent as a keeper for Bangladesh's spin dominated attack. His moment of fame came in 2010 in a Test against India. Where he scored a quickfire century, the quickest by any Bangladeshi to date. He is one of the best run scorers as a wicketkeeper who has 11,000 runs and 400+ dismissals.According to Jamie Siddons, the former coach of Bangladesh, Mushfiqur Rahim's batting is so versatile that he can bat anywhere in the top order, from one to six. He is also rated as one of the consistent performers and one of the few keepers to score 1000+ runs in every format.[6] He is the highest individual scorer for Bangladesh in Test cricket.[7] He is the first and only wicketkeeper-batsman in the history of Test cricket to score two double-hundreds.[8][9][10][11][12] He is also the first and only Bangladeshi batsman to score three double-hundreds in Tests.[13] Mushfiqur is the only Bangladeshi player to win 150 international matches.[14] In December 2023, he became only the second cricketer in test cricket history after Len Hutton to be given out for obstructing the field, when he physically handled the ball with his gloves during a test match against New Zealand."
    )

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(this, profileName, profileDec, images)

        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this,
                "Item Clicked${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this,detailsActivity::class.java)
            intent.putExtra("name",profileName[position])
            intent.putExtra("image",images[position])
            intent.putExtra("longdesc",longDce[position])

            startActivity(intent)
        }
    }
}