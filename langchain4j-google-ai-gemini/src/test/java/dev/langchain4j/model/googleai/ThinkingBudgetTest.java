package dev.langchain4j.model.googleai;

import org.junit.jupiter.api.Test;

import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.response.ChatResponse;

public class ThinkingBudgetTest {
    private static final String GOOGLE_AI_GEMINI_API_KEY = System.getenv("GOOGLE_AI_GEMINI_API_KEY");

    @Test
    void shouldPrintRequestWithThinkingBudget() {
        GoogleAiGeminiChatModel model = GoogleAiGeminiChatModel.builder()
            .apiKey( GOOGLE_AI_GEMINI_API_KEY ) 
            .modelName("gemini-2.5-flash-preview-04-17")
            .temperature(0.7)
            .thinkingBudget(1000)
            .build();

        ChatResponse response = model.chat(ChatRequest.builder()
                .messages(UserMessage.from("What is the capital city of Nepal"))
                .build());

        System.out.println(response);    
    }
}
