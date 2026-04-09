package edu.ban7.chatbotmsnmsii2527.dto;

import java.util.List;

public record Question(String content, List<Integer> includedTagIds, List<Integer> excludedTagIds
) {

}
