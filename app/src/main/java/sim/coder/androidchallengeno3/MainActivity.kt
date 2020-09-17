package sim.coder.androidchallengeno3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

           var toast=  Toast.makeText(this,"post has been upload successfully" ,Toast.LENGTH_LONG)
                toast.setGravity(Gravity.TOP,
                0,0)
            toast.show()



        }

    }
}
