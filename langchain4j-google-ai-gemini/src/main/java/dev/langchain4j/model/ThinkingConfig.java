package dev.langchain4j.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ThinkingConfig {
    private Integer thinkingBudget;
    private Boolean includeThoughts;

    @JsonCreator
    public ThinkingConfig(@JsonProperty("thinkingBudget") Integer thinkingBudget,@JsonProperty("includeThoughts") Boolean includeThoughts) {
        this.thinkingBudget = thinkingBudget;
        this.includeThoughts = includeThoughts;
    }

    public Integer getThinkingBudget() {
        return thinkingBudget;
    }

    public void setThinkingBudget(Integer thinkingBudget) {
        this.thinkingBudget = thinkingBudget;
    }

    public Boolean getIncludeThoughts(){
        return this.includeThoughts;
    }

    public void setIncludeThoughts(Boolean includeThoughts){
        this.includeThoughts = includeThoughts;
    }

        @Override
    public String toString() {
        return "ThinkingConfig(thinkingBudget=" + thinkingBudget + ", includeThoughts=" + includeThoughts +  ")";
    }
}
