package com.example.viraoufala

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.viraoufala.ui.theme.ViraOuFalaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViraOuFalaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFDAA7F3)
                ) {
                    TelaApp()
                }
            }
        }
    }
}

@Composable
fun TelaApp() {
    val perguntas = listOf(
        "Mostre a última foto da sua galeria ou vira.",
        "Se pudesse trocar de vida com alguém aqui, quem seria?",
        "Diga um crush secreto seu.",
        "Qual foi a última pessoa para quem você mandou mensagem?",
        "Qual foi a última coisa que você pesquisou no Google?",
        "Conte uma mentira que ninguém sabe.",
        "Quem são seus fixados no WhatsApp?",
        "Você ficaria 6 meses sem celular em troca de se casar com o amor da sua vida?",
        "Beije alguém na roda ou vira.",
        "Faça uma declaração pra alguém aqui ou vira.",
        "Revele um segredo seu ou vira.",
        "Casar com uma pessoa que você não ama e ser rico o resto da vida ou casar com alguém que você ama e não ter dinheiro?",
        "Descreva sua última ficada em 3 palavras.",
        "Quem é a pessoa que você finge gostar, mas que se pudesse nunca mais via?",
        "Poder de voar ou ficar invisível?",
        "Qual é sua teoria da conspiração favorita?",
        "Que livro você me recomendaria ler e por quê?",
        "Uma data importante? Por quê?",
        "Você já se apaixonou por um personagem de desenho animado? Se sim, qual?",
        "Onde foi seu primeiro encontro?",
        "Você já brincou de tocar a campainha e sair correndo?",
        "Você já ficou com a mesma pessoa que o seu melhor amigo ou a sua melhor amiga?",
        "Quem foi a primeira pessoa por quem você se apaixonou?",
        "Qual é o seu maior arrependimento?",
        "O que é mais importante para você, um relacionamento ou a sua carreira?",
        "Você já chorou no transporte público?",
        "Você já teve algum pesadelo recorrente?",
        "Qual é o pior lugar do corpo onde você já se queimou do sol?",
        "Você consegue soletrar (otorrinolaringologista)?",
        "Qual foi a coisa mais ousada que você já fez depois de beber?",
        "Qual é a piada mais engraçada que você sabe de cor?",
        "Que reality show você acha que teria mais chances de vencer?",
        "Você já teve um amigo imaginário?",
        "Você aceitaria um casamento arranjado?",
        "Você passaria um fim de semana em uma casa mal-assombrada po R$5 mil?",
        "Quantos ex ainda estão salvos na sua agenda?",
        "Quem no grupo você gostaria de ter ao seu lado em um apocalipse zumbi?",
        "Quem é a pessoa mais engraçada do grupo?",
        "Você já mentiu sua idade para entrar em um bar ou balada?",
        "Quem é o pior dançarino do grupo?",
        "Você já pesquisou alguma coisa constrangedora no Google? Se sim, o quê?",
        "Você já stalkeou alguém aqui nas redes sociais?",
        "Você tem algum talento que ninguém conhece?",
        "Classifique todo mundo que está jogando da pessoa de quem você mais gosta à com a qual menos tem afinidade.",
        "Das pessoas que estão aqui, com quem você ficaria só para causar ciúmes em alguém?",
        "Conte a história mais nojenta de alguma vez que você vomitou.",
        "Qual foi o sonho mais estranho que você já teve?",
        "Qual foi a coisa mais esquisita que já perguntaram a você durante um encontro?",
        "Ligue para a primeira pessoa na sua lista de contatos e converse usando apenas sons de animais.",
        "Conte onde foi o lugar mais estranho que você já tirou um cochilo.",
        "Cante o alfabeto de trás para frente. Se errar, tome um shot.",
        "Liste três coisas que você faria se ganhasse na loteria.",
        "Recita uma cantiga de ninar de forma dramática.",
        "Conta qual foi a coisa mais estranha que você já comeu.",
        "Liste três coisas que você levaria para uma ilha deserta.",
        "Diga um trava-línguas sem errar. Se errar, beba.",
        "Já ficou obcecado em stalkear nas redes sociais alguma pessoa que alguém da roda conhece?",
        "Já fingiu estar dormindo no transporte público para não ceder o meu lugar a alguém?",
        "Já colaste num teste ou prova?",
        "Qual é a combinação de comida mais estranha que gostas?",
        "Qual foi a coisa mais estranha que você já fez por grana?",
    )

    var perguntaAtual by remember { mutableStateOf("Bora animar essa festinha! Clique no botão pra começar a brincadeira.") }

    val fonteTitulo = FontFamily(Font(R.font.darumadrop))
    val fonteTexto = FontFamily(Font(R.font.lubrifont))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF250A3B))
    ) {
        Image(
            painter = painterResource(id = R.drawable.coelho_tela),
            contentDescription = "Coelho Fofo",
            modifier = Modifier
                .size(260.dp)
                .align(Alignment.BottomCenter)
                .padding(end = 1.dp, bottom = 2.dp),
            contentScale = ContentScale.Fit,
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Vira ou Fala",
                fontSize = 48.sp,
                color = Color(0xFFFFB8E1),
                fontWeight = FontWeight.ExtraBold,
                fontFamily = fonteTitulo
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .shadow(15.dp, shape = RoundedCornerShape(24.dp))
                        .background(
                            color = Color(0xF8522183),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .border(
                            width = 3.dp,
                            color = Color(0xFFF496D4),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .padding(24.dp)
                ) {
                    Text(
                        text = perguntaAtual,
                        fontSize = 22.sp,
                        color = Color(0xFFFDADFC),
                        lineHeight = 28.sp,
                        fontFamily = fonteTexto
                    )
                }

                Spacer(modifier = Modifier.height(40.dp))

                Button(
                    onClick = {
                        perguntaAtual = perguntas.random()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xF8522183),
                        contentColor = Color(0xFFFFB8E1)
                    ),
                    shape = RoundedCornerShape(60.dp),
                    modifier = Modifier
                        .height(65.dp)
                        .fillMaxWidth(0.7f)
                ) {
                    Text(
                        text = "Sortear a boa da vez",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = fonteTexto
                    )
                }
            }
        }
    }
}
