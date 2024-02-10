package mx.unam.fi.certificadocurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.unam.fi.certificadocurso.ui.theme.CertificadoCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificadoCursoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificateCourse("Luis Miguel Gallego Basteri", "Antroid Pro-Master", 48)
                }
            }
        }
    }
}

@Composable
fun CertificateCourse(name: String, course: String, number: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(10.dp), verticalArrangement = Arrangement.Center,) {
        Box(contentAlignment = Alignment.Center){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = R.drawable.escudounam_azul),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp))
                Text(
                    text = "   ANDROFI   ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    )
                Image(painter = painterResource(id = R.drawable.escudofi_azul),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp))
            }
        }
        Text(modifier = Modifier
            .padding(vertical = 35.dp)
            .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "This certificate is presented to:"
        )
        Box(contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = modifier.fillMaxWidth(),
                alpha = 0.3F)
            Text(
                text = "$name",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
        }
        Text(modifier = Modifier
            .padding(vertical = 20.dp)
            .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Has completed a $number hours course on:"
        )
        Text(modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "$course",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )
        Box(modifier = Modifier.padding(vertical = 50.dp),contentAlignment = Alignment.Center){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.firmadaniel),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp))
                    Text(modifier = Modifier
                        .padding(vertical = 5.dp),
                        fontWeight = FontWeight.Bold,
                        text = "Daniel Aguirre")
                    Text(modifier = Modifier
                        .padding(vertical = 5.dp),
                        text = "Representante")
                }
                Spacer(modifier = Modifier.width(60.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.firmaluisa),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp))
                    Text(modifier = Modifier
                        .padding(vertical = 5.dp),
                        fontWeight = FontWeight.Bold,
                        text = "Luisa Castillo")
                    Text(modifier = Modifier
                        .padding(vertical = 5.dp),
                        text = "Representante")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificateCoursePreview() {
    val horas = 48
    val course = "Antroid Pro-Master"

    CertificadoCursoTheme {
        CertificateCourse("Daniel Mitchel Aguirre Bravo", course, horas)
    }
}