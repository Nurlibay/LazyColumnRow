package uz.nurlibaydev.lazycolumnandrow

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.nurlibaydev.lazycolumnandrow.ui.theme.LazyColumnAndRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnAndRowTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyRV()
                }
            }
        }
    }
}

@Composable
fun LazyRV(){

    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        items(1){
            CustomItem(person = Person(10, "N", "K", 22))
        }

//        items(items = getAllData) { person ->
//            CustomItem(person = person)
//        }

        itemsIndexed(items = getAllData) { index, person ->
            Log.d("TTT", index.toString())
            CustomItem(person = person)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRV(){
    LazyColumnAndRowTheme {
        LazyRV()
    }
}