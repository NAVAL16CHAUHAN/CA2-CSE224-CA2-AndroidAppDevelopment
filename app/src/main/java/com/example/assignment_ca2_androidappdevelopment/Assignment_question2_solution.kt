package com.example.assignment_ca2_androidappdevelopment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Assignment_question2_solution : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_question2_solution)

        val radioBtnMale = findViewById<RadioButton>(R.id.radio_Button_male)
        val radioBtnFemale = findViewById<RadioButton>(R.id.radio_Button_female)
        val checkBox = findViewById<CheckBox>(R.id.check_Box_2)
        val reg = findViewById<Button>(R.id.Register)


        radioBtnMale.setOnClickListener{
                Toast.makeText(applicationContext,"Selected Gender is : Male",Toast.LENGTH_SHORT).show()
        }

        radioBtnFemale.setOnClickListener{
                Toast.makeText(applicationContext,"Selected Gender is : Female",Toast.LENGTH_SHORT).show()
        }

        checkBox.setOnClickListener{
            if(checkBox.isChecked){
                Toast.makeText(applicationContext,"Checkbox Is Selected And You Agree Terms And Condition",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext,"Checkbox Is Not Selected",Toast.LENGTH_SHORT).show()
            }
        }

        reg.setOnClickListener{
            Toast.makeText(applicationContext,"You Have Been Successfully Registered",Toast.LENGTH_SHORT).show()
        }
    }
}