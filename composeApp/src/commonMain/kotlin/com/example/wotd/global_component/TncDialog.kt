package com.example.wotd.global_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.multiplatform.webview.web.WebView
import com.multiplatform.webview.web.rememberWebViewState

@Composable
fun TncDialog(
    onFinishClick: () -> Unit,
) {
    Dialog(
        onDismissRequest = {},
        properties = DialogProperties(
            dismissOnBackPress = false,
            dismissOnClickOutside = false
        )
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = Modifier.padding(24.dp)
            ) {
                TncContent()

                ButtonWithGradient(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onFinishClick
                ) {
                    Text("I Agree")
                }
            }
        }
    }
}

@Composable
fun TncContent() {
    Column {
        val annotatedText = buildAnnotatedString {
            // --- Terms Section ---
            withStyle(SpanStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)) {
                append("\nTerm & Condition\n")
            }

            withStyle(
                SpanStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("\nIntroduction\n")
            }
            append("Welcome to the YourWOTD application! By using our application, you agree to comply with and be bound by the following Terms and Conditions. If you do not agree with any part of these terms, please do not use our application.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nApplication Usage\n")
            }
            append("    • Access and Use: You are granted a non-exclusive, non-transferable license to access and use the application in accordance with these terms.\n")
            append("    • Eligibility: Users are not restricted by any specific age requirement.\n")
            append("    • User Account: As an end user, you are not required to have a specific account to access this application.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nIntellectual Property Rights\n")
            }
            append("    • Ownership: All copyrights, trademarks, and other intellectual property rights in the application and its content belong to us or our licensors. Except for the word dataset, which we obtained from https://www.kaggle.com/datasets/anthonytherrien/larger-dictionary-of-english-words-and-definitions.\n")
            append("    • Limited Use: You may not copy, modify, distribute, sell, or lease any part of the application without our written permission.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nLimitation of Liability\n")
            }
            append("    • Application Use: You use the application at your own risk. This application is provided \"as is\" and \"as available\" without any warranties, either express or implied.\n")
            append("    • Damages: We are not responsible for any loss or damage arising from the use of the application or inability to access the application.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nChanges to Terms and Conditions\n")
            }
            append("Modifications: We reserve the right to modify these terms and conditions at any time. Changes will take effect after being posted in the application. Continued use of the application after changes means you accept those changes.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nGoverning Law\n")
            }
            append("These terms and conditions are governed by and interpreted in accordance with Indonesian law.\n")

            // --- Privacy Section ---
            withStyle(SpanStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)) {
                append("\n\nPrivacy Policy\n")
            }

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nDefinitions\n")
            }
            append("    • Application: Refers to the YourWOTD application, software program provided by the Company.\n")
            append("    • Company: Refers to the YourWOTD application, referred to as \"Company\", \"We\", \"Us\", or \"Our\" in this agreement.\n")
            append("    • Personal Data: Any information relating to an identified or identifiable individual.\n")
            append("    • Service: Refers to the Application.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nCollecting and Using Your Personal Data\n")
            }
            append("In this application, no user data is collected.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nChildren's Privacy\n")
            }
            append("Our Service is directed to anyone without age restrictions. If you are a parent or guardian and you are aware that your child has provided Personal Data, please contact us.\n")

            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nChanges to this Privacy Policy\n")
            }
            append("We may update our Privacy Policy from time to time. Changes will take effect when posted on this page.\n")

            // --- Contact Section ---
            withStyle(SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)) {
                append("\nContact Us\n")
            }
            append("If you have any questions about these Terms & Conditions or Privacy Policy:\n")
            pushStringAnnotation(tag = "email", annotation = "mailto:fahmigutawan@gmail.com")
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("fahmigutawan@gmail.com\n")
            }
            pop()
        }

        Box(
            modifier = Modifier.heightIn(max = 380.dp).verticalScroll(rememberScrollState())
        ){
            Text(annotatedText)
        }
    }
}