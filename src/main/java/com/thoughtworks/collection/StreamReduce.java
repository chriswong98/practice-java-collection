package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce((element1, element2) -> element2%2==1 ? element2:element1 ).get();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce("", (str1, str2) -> str2.length()>str1.length() ? str2:str1 );
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .mapToInt(word-> word.length()).reduce( 0,(a,b) ->a+b );
    }
}
