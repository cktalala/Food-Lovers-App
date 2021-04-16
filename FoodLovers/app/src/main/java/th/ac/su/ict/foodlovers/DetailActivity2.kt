package th.ac.su.ict.foodlovers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.list_item_food.view.*

class DetailActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val caption = intent.getStringExtra("caption")
        val imageFile = intent.getStringExtra("imageFile")
        val star = intent.getIntExtra("star",0)
        val Fooddata = intent.getStringExtra("Fooddata")

        namefood.setText(title)
        namestore.setText(caption)
        lo.setText(Fooddata)
        if (star == 1 )
        star1.setImageResource(R.drawable.star)
        else if (star == 2) {
            star1.setImageResource(R.drawable.star)
            star2.setImageResource(R.drawable.star)
        }
        else if (star == 3) {
            star1.setImageResource(R.drawable.star)
            star2.setImageResource(R.drawable.star)
            star3.setImageResource(R.drawable.star)
        }
        else if (star == 4) {
            star1.setImageResource(R.drawable.star)
            star2.setImageResource(R.drawable.star)
            star3.setImageResource(R.drawable.star)
            star4.setImageResource(R.drawable.star)
        }
        else if (star == 5) {
            star1.setImageResource(R.drawable.star)
            star2.setImageResource(R.drawable.star)
            star3.setImageResource(R.drawable.star)
            star4.setImageResource(R.drawable.star)
            star5.setImageResource(R.drawable.star)
        }



        val res = resources
        val drawableId: Int =
            res.getIdentifier(imageFile, "drawable", packageName)

        img.setImageResource(drawableId)
    }
}